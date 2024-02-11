class SampleConst_1{
	SampleConst_1(){
		System.out.println("Provide Default constructor by compiler");
	}
	SampleConst_1(int a){
		System.out.println("parametrisied constructor " +a);
	}
	
private int id;
public void setId(int id) {
	this.id=id;
}
public int getId() {
	return id;
}
}
public class constructor1 {

	public static void main(String[] args) {
		SampleConst_1 s1=new SampleConst_1(10);
		s1.setId(10);
		
		System.out.println(s1.getId());
	}

}
