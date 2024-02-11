
import java.util.*;

public class StackExample12 {

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

		int temp = stack[tos];
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
		StackExample1 obj=new StackExample1();
		Scanner in=new Scanner(System.in);
	    System.out.println("Enter string to reverse:");
	    
	    String s = in.next();
	    obj.createStack(s.length());
	
	  
for(int i=0;i<s.length();i++) {
	char e=s.charAt(i);
	if(e=='{')
obj.push(e);
	else if(e=='{')
	{
		if(obj.isEmpty()==true)
		{
			System.out.println("Error:'}'unExcepted");
			break;
		}
		char temp=(char) obj.pop();
	}
if(obj.isEmpty()==true)
	System.out.println("Balanced");
else
	System.out.println("Error:'}'Excepted");
}
	}
}
