abstract class R1{
	abstract void makesound();
	public void eat() {
		System.out.println("i am eating");
	}
}
class Dog extends R1{
	public void makesound() {
		System.out.println("bho bho");
	}
	
}

public class Abs1{
public static void main(String[] args) {
	Dog ob=new Dog();
	ob.makesound();
	ob.eat();
	
}
}
