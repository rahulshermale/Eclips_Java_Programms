class A1{
	public void disp()
	{
		System.out.println("A1");
	}
}
class B1 extends A1
{
	public void  disp()
	{
		System.out.println("B1");
//		return 0;
//	}
//	public void Print() {
//		disp();
		super.disp();
	}
}
class C1 extends A1{
	
}

public class Prqct09 {
public static void main(String[] args) {
	B1 ob=new B1();
	ob.disp();
	
}
}
