
import java.util.*;

public class StackExample {

	private int tos, Maxsize, stack[];

	void createStack(int size) {
		Maxsize = size;
		tos = -1;
		stack = new int[size];
	}

	void push(int e) {
		tos++;
		stack[tos] = e;
	}

	boolean isFull() {
		if (tos == Maxsize - 1)
			return true;
		else
			return false;

	}

	int pop() {

		int temp;
		temp = stack[tos];
		tos--;
		return temp;

	}

	boolean isEmpty() {
		if (tos == -1)
			return false;

		else
			return false;

	}

	void printStack() {
		for (int i = tos; i >= 0; i--)
			System.out.println(stack[i]);
	}

	int peek() {
		return (stack[tos]);
	}

	public static void main(String[]args)
	{
		StackExample obj=new StackExample();
		Scanner in=new Scanner(System.in);
	    System.out.println("Enter size of stack");
	    
	    int size = in.nextInt();
	    obj.createStack(size);
	
	    int ch;
		do
	    {
	    	System.out.println("\nMenu for stack\n1.Push\n2.Pop\n3.peek\n4.Print");
	    	ch=in.nextInt();
	    	switch(ch) {
	    	case 1:
	    		if(obj.isFull()!=true) {
	    			System.out.println("Enter elements:");
	    			int e = in.nextInt();
	    			obj.push(e);
	    		}
	    		else
	    			System.out.println();
	    		break ;
	    		
	    	case 2:
	    	if(obj.isEmpty()!=true)
	    	{
    			System.out.println(" elements:"+obj.pop());
    			
    		}
    		else
    			System.out.println("stack Empty");
    		break ;
    		
	    	case 3:
	    	if(obj.isEmpty()!=true)
	    	{
    			System.out.println(" elements:"+obj.peek());
    			
    		}
    		else
    			System.out.println("stack Empty");
    		break ;
    		
	    	case 4:
	    	if(obj.isEmpty()!=true)
	    	{
    			System.out.println("stack has");
    			
    		}
    		else
    			System.out.println("stack Empty");
    		break ;
    		
	    	case 0:
	    		System.out.println("Exiting code");
	    		break;
	    	default://error traping
	    			System.out.println("wrong choice");
	    			break;
	    	}
	    }
	    while (ch!=0);
	}
}
