import java.lang.Class;
import java.lang.reflect.*;
//






class Animal{}


public class Dog extends Animal{
	public void display() {
		System.out.println("i am a dog");
	}
}
class WER{
	public static void main(String[]args) {
	try {
		
		Dog d1= new Dog();
		
	Class obj=d1.getClass();
	
		
	String name=obj.getName();
	System.out.println(name);
	int modifier=obj.getModifiers();
	String mod = Modifier.toString(modifier);
    System.out.println("Modifier: " + mod);
    Class superClass = obj.getSuperclass();
  System.out.println("Superclass: " + superClass.getName());
		}

  catch (Exception e) {
    e.printStackTrace();
	
}
}
}
//class Animal {
//}
//
//// put this class in different Dog.java file
//public class Dog extends Animal {
//  public void display() {
//    System.out.println("I am a dog.");
//  }
//}
//
//// put this in Main.java file
//class Main {
//  public static void main(String[] args) {
//    try {
//      // create an object of Dog
//      Dog d1 = new Dog();
//
//      // create an object of Class
//      // using getClass()
//      Class obj = d1.getClass();
//
//      // get name of the class
//      String name = obj.getName();
//      System.out.println("Name: " + name);
//
//      // get the access modifier of the class
//      int modifier = obj.getModifiers();
//
//      // convert the access modifier to string
//      String mod = Modifier.toString(modifier);
//      System.out.println("Modifier: " + mod);
//
//      // get the superclass of Dog
//      Class superClass = obj.getSuperclass();
//      System.out.println("Superclass: " + superClass.getName());
//    }
//
//    catch (Exception e) {
//      e.printStackTrace();
//    }
//  }
//}