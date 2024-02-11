public class Problem_10 {

	static int ab;
	
	static int getId(int id) {
		int param=id;
		return id;
	}
	public static void main(String[] args) {
		
		ab=Problem_10.getId(15);
		System.out.println(ab);
		System.out.println(Problem_10.getId(10));
	}
}