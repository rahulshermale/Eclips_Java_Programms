class Animal112 {

}

class mokey extends Animal112 {

}

class Anima {
	public void m1(Animal112 A) {
		System.out.println("Animal Vear");

	}

	public void m1(mokey m) {
		System.out.println("Monkey ");
	}

	public static void main(String[] args) {
		Anima ob = new Anima();
	 Animal112 obj=new Animal112();
	 ob.m1(obj);
	 mokey obj1=new mokey();
	 ob.m1(obj1);
	 
		
	}
}