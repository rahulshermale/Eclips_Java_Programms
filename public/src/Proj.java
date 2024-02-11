

class Parent  {
	public int disp(int a) {
		System.out.println("English");
      return a+a;
	}
}

class Chiled extends Parent {
	public int disp(int a) {
		System.out.println("Maratthi");
		super.disp(a);
	return a;
	}
}

public class Proj {
	public static void main(String[] args) {
		Chiled ob = new Chiled();
		ob.disp(10);

	}
}
