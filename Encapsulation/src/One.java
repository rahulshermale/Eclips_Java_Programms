class area{
	int length;
	int breadth;
	area (int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	public void getArea() {
		int area = length*breadth;
		System.out.println(area);
	}
}
public class One {
public static void main(String[] args) {
	area ob=new area(5,6);
	ob.getArea();
}
}
