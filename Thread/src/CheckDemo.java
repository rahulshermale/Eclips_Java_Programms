class check{
	int num1=10;
	private int num2=10;
	public int num3=30;
	protected int num4=40;
	
public void disp() {
	System.out.println("RAhul");
}
	
}
public class CheckDemo{
	public static void main(String[] args) {
	check C1=new check();
	System.out.println(C1.num1);
//	System.out.println(C1.num2);      //private can not be accessed with utside class
	System.out.println(C1.num3);
	System.out.println(C1.num4);
	}
}