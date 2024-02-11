
class A
{
	public A()
	{
		System.out.println("inside A constructor");
	}
}
class B
{
	public B()
	{
		System.out.println("inside B constructor");
	}
}
class Parent
{
	public Parent()
	{
		System.out.println("inside Parent constructor");
	}
}
class Child extends Parent
{
	private B ob1=new B();
	private A ob2=new A();
	public Child()
	{
		System.out.println("inside Child constructor");
	}
}
public class Problem_3 {
	public static void main(String args[])
	{
		new Child();
		new Parent();
	}


}