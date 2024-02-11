interface poll {
	void getArea();

	default void getSides() {
		System.out.println(" I Can Get Sides");
	}
}

class Rectangle implements poll {

	@Override
	public void getArea() {

		int length = 6;
		int breadth = 5;
		int area = length * breadth;
		System.out.println("The area of " + area);

	}


	public void getSide() {
		System.out.println("I Have A 4 Side");
	}
}
	class square implements poll {
		public void getArea() {
			int l = 5;
			int area = l * l;
			System.out.println(area);
		}
	}


public class Main1 {
	public static void main(String[] args) {

		Rectangle obj = new Rectangle();
		obj.getArea();
		obj.getSide();

		square obj1 = new square();
		obj1.getArea();
		obj1.getSides();

	}

}
