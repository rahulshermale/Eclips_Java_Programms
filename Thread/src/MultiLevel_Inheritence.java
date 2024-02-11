//5)	Show the example of multi-level inheritance with constructor invocation
class base{
	int a=10;
	void disp() {
}
}
class sub extends base{
	int num1=20;
	void disp2() {
		
	}
}
class sub1 extends sub{
	int num2=30;
	void disp() {}
	
}
public class MultiLevel_Inheritence {

	public static void main(String[] args) {
	sub1 obj=new sub1();
	System.out.println(obj.a);
	System.out.println(obj.num1);
	System.out.println(obj.num2);
	}

}
