import java.util.ArrayList;
public class Problem_05 {
	public static void main(String[] args) {
		
	
	ArrayList<String> bike=new ArrayList<String>();
	bike.add("FZ");
	bike.add("PUlsur");
	bike.add("Spelnder");
	bike.add("Shine");
	bike.add("Discover");
	System.out.println(bike);
	System.out.println(bike.indexOf(0));
	System.out.println(bike.remove(0));
	System.out.println(bike.parallelStream());
	System.out.println(bike.add("Scooti"));
	System.out.println(bike.size());
	System.out.println(bike);
	System.out.println(bike.get(4));
	for(int i=0;i<bike.size();i++) {
		System.out.println(bike.get(i));
	}
		
	}
}
