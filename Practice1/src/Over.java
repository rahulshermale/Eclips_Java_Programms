abstract class A{
	public void disp() {
		System.out.println("Rahul");
	}
	
}
class B extends A{
	public void disp2() {
		System.out.println("Amresh");
	}
}
public class Over{
	public static void main(String[] args) {
		B ob=new B();
		ob.disp();
		ob.disp2();
	}
}