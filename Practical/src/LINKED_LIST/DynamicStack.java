package LINKED_LIST;

import java.util.Scanner;
	

public class DynamicStack{
	private Node root;
	
	 void push(int value) {
			Node n = new Node(value);
		 if(tos==null)
			tos = n;
		 else {
			 n.next = tos;
			 tos = n;
		 }
	 }
	 int pop() {
		 if(tos!=null) {
			 Node t = tos;
			 tos = tos.next;
			 return t.data;
		 }
			 return 0;		 
	 }	
	 int peek() {
		 if(tos!=null)
			 return tos.data;
		 return 0;
	 }
	void PrintDynamic_stack() {
		if(tos == null)
			System.out.println("Stack is Empty");
		else {
		Node t = tos;
		while(t!=null) {
			System.out.print("->"+t.data);
			t=t.next;
			}
		}
		System.out.println();
	}
	public static void main(String[] args) {
		DynamicStack obj = new DynamicStack();
		Scanner sc = new Scanner(System.in);
		int ch ,value;
		System.out.println("Enter the Choice : 1.Push 2.Pop 3.Peek 4.Print_Stack 0.Exit");
		do {
			System.out.print("Choice:");
			ch = sc.nextInt();
			switch(ch) {
			case 1 : 
				System.out.print("Value:");
				value = sc.nextInt();
				obj.push(value);
				break;
			case 2:
				if(obj.peek()!=0)
					 System.out.println("Data Poped..."+obj.pop());
				else
					System.out.println("Stack is Empty");
				break;
			case 3: 
				if(obj.peek()!=0)
					System.out.println("Data Peeked..."+obj.peek());
				else {
					System.out.println("Stack is Empty");
				}
				break;
			case 4:
				obj.PrintDynamic_stack();
				break;
			case 0:
				System.out.println("Exiting Code");
				break;
			default:
				System.out.println("Enter the Valid Choice");
			}
		}while(ch!=0);
	}
	
}