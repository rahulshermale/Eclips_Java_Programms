abstract class A2{
	protected void disp() {
		 System.out.println("Ram");
	 }
	
	
	public void disp1() {
		System.out.println("print ln");
	}

//class B2 extends A2{
//	void disp1()
//	{
//		
//	}

	
}
public class Abs extends A2{
	public static void main(String[] args) {
		Abs ob=new Abs();
	ob.disp1();
	ob.disp();
	}
}