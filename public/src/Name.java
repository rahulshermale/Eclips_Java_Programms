interface poly {
	abstract void getarea();

	default void getSide() {
		System.out.println(" I Can Get Sides");
	}
}

class Rect implements poly {
	int l1 = 10;
	int b1 = 5;
	int area = l1 * b1;

	@Override
	public void getarea() {
		System.out.println(area);

	}

	public void getSide() {
		System.out.println("The area of four side");
	}

}

class circle implements poly {
	public void getarea() {
		int r = 5;
		double s = 3.14;
		double area = (s * r * r);
		System.out.println(area);
	}

	public void getSide() {
		System.out.println("the circle");
	}

}

public class Name {
	public static void main(String[] args) {
		Rect ob = new Rect();
		ob.getarea();
		ob.getSide();

		circle ob1 = new circle();
		ob1.getarea();
		ob1.getSide();

	}

}
