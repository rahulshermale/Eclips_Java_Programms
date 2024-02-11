interface polygon{
	void getArea(int a,int b);
}
class rectangle implements polygon {
	public void getArea(int a,int b) {
		System.out.println(a*b);
	}
}
class By extends rectangle{
	void disp(String name) {
		System.out.println(name);
	}
}
public class Inter {

	
	public static void main(String[] args) {
		rectangle ob=new rectangle();
		ob.getArea(10,20);
		((By) ob).disp("rahul");
		
	}
}

