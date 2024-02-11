
public class StackExample
{
private int s[],Maxsize,tos;

public void createStack(int size) {
	
	Maxsize=size;
	tos=-1;
	s=new int [Maxsize];
}
public void push(int e) {
	tos++;
	s[tos]=e;
}
public boolean isFull() {
	if(tos==Maxsize-1)
	{
		return true;
	}
	else 
	{
		return false;
	}
}
public int pop() 
{
	 int temp=s[tos];
	tos--;
	return temp;
}
public int peek() {
	
	return(s[tos]);
}
public boolean isEmpty() {
	if(tos==-1) {
		return true;
	}
	else {
		return false;
	}
	
}
public void printStack() {
	for(int i=tos;i>-1;i++) {
		System.out.println(s[i]);
	}
}

}