
class Secon {
	public void property() {
		System.out.println("cash + land + gold");
	}

	public void marrage() {
		System.out.println("Shubh Laxmi");
	}
}
class R1 extends Secon{
	public void marrage() {
		System.out.println("rrrrr");
	}
}
class Second{
	public static void main(String[] args) {
		Secon ob=new Secon();
		ob.property();
		ob.marrage();
		R1 obj=new R1();
		obj.marrage();
	}
}
