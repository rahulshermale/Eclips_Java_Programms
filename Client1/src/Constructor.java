class cons {
	
	cons(){
		System.out.println("no arg or Default Provide by compiler");
	}

	private int id;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}

public class Constructor {

	public static void main(String[] args) {

		cons c1 = new cons();

		c1.setId(10);

		System.out.println(c1.getId());
	}

}
