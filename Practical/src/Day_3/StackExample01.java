package Day_3;
import java.util.*;

public class StackExample01 {
	private int Maxsize, tos, s[];

	void createStack(int size) {
		Maxsize = size;
		tos = -1;
		s = new int[Maxsize];
	}

	void push(int e) {
		tos++;
		s[tos] = e;
	}

	boolean isFull() {
		if (tos == Maxsize - 1)
			return true;

		else
			return false;
	}

	public int pop() {
		int temp;
		temp = s[tos];
		tos--;
		return temp;
	}

	public int peek() {
		return s[tos];
	}

	public boolean isEmpty() {
		if (tos == -1)
			return true;
		else
			return false;
	}

	public void printStack() {
		for (int i = tos; i > -1; i++) 
			System.out.println(s[i]);
		}
	

public static void Main(String []args) {
	StackExample01 obj=new StackExample01();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Stack Size");
int size=sc.nextInt();
obj.createStack(size);
int ch;
do {
	System.out.println("\n1.push\n2.pop\n3.peek\n4.print\n0.exit\n");
	 ch=sc.nextInt();
	switch(ch) {
	case 1:
		if(obj.isFull()!=true)
		{
			System.out.println("Enter Elements: ");
			int e=sc.nextInt();
			obj.push(e);
		}
		else 
			System.out.println("Stack is Full");
		break;
	
	case 2:
		if(obj.isEmpty()!=true) {
			System.out.println("elements :"+ obj.pop());
		}
		else 
			System.out.println("Stack is Empty :");
		break;
		
	case 3: 
		if(obj.isEmpty()!=true) {
			System.out.println("elements:"+obj.pop());
		}
		break;
	case 4:
		if(obj.isEmpty()!=true)
		System.out.println("Stack Has");
		else
			System.out.println("stack empty");
		break;
	case 0:
		System.out.println("existing Stack ");
		break;
}
}
   while(ch!=0);


}
}