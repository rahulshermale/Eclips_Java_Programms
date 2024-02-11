class S1 {
	String name;

	S1(String name) {
		this.name = name;
	}

	public void marrage() {
		// TODO Auto-generated method stub
		
	}
}

class S2 extends S1 {
	int id;
	int rollno;

	S2(int id, int rollno, String name) {
		super(name);
		this.id = id;
		this.rollno = rollno;

		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.rollno);
		System.out.println(this.rollno);
		System.out.println(this.rollno);
		System.out.println(this.rollno);
//		System.out.println(S2.hashCode());
	}
}

class Student {
	public static void main(String[] args) {
	


	S2 obj = new S2(10, 20, "Rahul");
}
}