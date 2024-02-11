class Figure {
	public void area() {
		System.out.println("Area of figure");
	};
}

class Square extends Figure {

	int area(int side) {
		return side * side;
	}

}

class circle extends Figure {

	public void area() {
		System.out.println("Area of figure");
	}
}

public class par1 {
	public static void main(String[] args) {
		Square s = new Square();
		s.area=5;
		System.out.println(s.area(5));
	}
}
