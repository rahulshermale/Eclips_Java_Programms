//OOPS_2) Define a class "MyClass" and make sure clients can instantiate it , 
//a) without any argument
//b) with one int argument
//c) with two int arguments

class MyClass
{
MyClass(){
	System.out.println("whithout Any Arguments");

}
MyClass(int a){
	System.out.println("with one arguments "+ a);
}
MyClass(int a,int b){
	System.out.println("with two arguments" +(a+b));
}
}
public class Question_Cons {
	public static void main(String[] args) {
		MyClass S1=new MyClass(10,25);
		
	}
}