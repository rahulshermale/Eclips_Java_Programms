//OPS_1)create a class "Shape" with 2 attributes, "width" and "height". Make sure one can not access these attributes directly.
//provide accessor methods on these attributes and allow them to call from outside of your class.
class Shape {
	private int width;
	private int height;

	public void setW(int width) {
		this.width = width;
	}

	public int getw() {
		return width;
	}

	public void setH(int height) {
		this.height = height;
	}

	public int getH() {
		return height;
	}

}

public class Question_Shape {
	public static void main(String[] args) {
		
		Shape ref = new Shape();
	ref.setW(10);
	ref.setH(10);

	
	System.out.println(ref.getw());
	System.out.println(ref.getH());
//	

}
}
