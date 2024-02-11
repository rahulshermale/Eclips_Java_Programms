class Rahul {
	public void speak() {

	};
}

class Parent extends Rahul {
	public void disp() {
		System.out.println("English");

	}
}

class Chiled extends Parent {
	public void disp() {
		System.err.println("Maratthi");
	}
}

public class Polyme {
	public static void main(String[] args) {
		Chiled ob = new Chiled();
		ob.speak();

	}
}
