class Animal{
	String name;
	void disp1() {
		System.out.println("Hi i am Rahul");
	}
}
class Cat extends Animal{
	int a;
	void disp() {
		System.out.println("cat");
	}
}
public class Inheritance{
	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.name="rahul";
		obj.disp1();
		
		obj.disp();
	}N
}