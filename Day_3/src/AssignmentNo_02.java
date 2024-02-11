
import java.util.*;

class QueueProg
{
	private int rear,front,maxsize,queue[];
	
	void createQueue(int size)
	{
		maxsize=size;
		rear=-1;
		front=0;
		queue =new int[maxsize];
	}
	void Enqueue(int e)
	{
		rear++;
		queue[rear]=e;
	}
	
	boolean isFull()
	{
		if(rear==maxsize-1)
			return true;
		else
			return false;
	}
	
	int Dequeue()
	{
		int temp=queue[front];
		front++;
		return temp;
	}
	
	boolean isEmpty()
	{
		if(front>rear)
			return true;
		else
			return false;
		
	}
	
	int peek()
	{
		return queue[front];
	}
	void printQueue()
	{
		for(int i=front;i<=rear;i++)
		  System.out.println(queue[i]);
	}
}

public class AssignmentNo_02
{
		QueueProg q1=new QueueProg();
		QueueProg q2=new QueueProg();
		void createStack(int size)
		{
			q1.createQueue(size);
			q2.createQueue(size);
		}
		void push(int num)
		{
			while(q1.isEmpty()!=true)
			{
				q2.Enqueue(q1.Dequeue());
			}
			q1.Enqueue(num);
			
			while(q2.isEmpty()!=true)
			{
				q1.Enqueue(q2.Dequeue());
			}
		}
	
		void pop()
		{
			System.out.println("Element poped:"+q1.Dequeue());
		}
	
		int top()
		{
			return q1.peek();
		}
	
		boolean isEmpty()
		{
			return q1.isEmpty();
		}
		
		boolean isFull()
		{
			return q1.isFull();
		}
		
		void printStack()
		{
			q1.printQueue();
		}
	
	
	
	public static void main(String[] args)
	{
	
		int ch,e,size;
		AssignmentNo_02 sobj=new AssignmentNo_02();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of stack:");
		size=sc.nextInt();
		sobj.createStack(size*2);  
		do {
			System.out.println("\n Menu for stack:\n1.Push \n2.Pop \n3.Peek \n4.Print \n0.Exit");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				   if(sobj.isFull()!=true)
				   {
					   System.out.println("Enter elements");
					   e=sc.nextInt();
					   sobj.push(e);
				   }
				   else
				   {
					  System.out.println("Stack full");
				   }
				    break;
			 case 2:
				   if(sobj.isEmpty()!=true)
				   {
					   //System.out.println("Element popped is:"+sobj.pop());
					   sobj.pop();
				   }
				   else
				     System.out.println("Stack is Empty");
				   break;
			  case 3:
				       if(sobj.isEmpty()!=true)
				       {
				    	   System.out.println("Element at peek:"+sobj.top());
				       }
				       else
				          System.out.print("Stack empty");
				       break;
			  case 4:
				     if(sobj.isEmpty()!=true)
				     {
				    	 System.out.println("Stack Elements are:");
				    	 sobj.printStack();;
				     }
				     else
				    	 System.out.println("Stack Empty");
				    break;
			   case 0:
				    System.out.println("Exiting code");
				     break;
				    
			   default:
			    	 System.out.println("Wrong choice");
				    break;
			   }
						
		}while(ch!=0);				
	}	
}
