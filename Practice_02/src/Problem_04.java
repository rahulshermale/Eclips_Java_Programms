import java.util.ArrayList;
public class Problem_04 {

	public static void main(String[] args) {
		
		ArrayList<String> cars=new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("BmW");
		cars.add("RR");
		cars.add("FORD");
		cars.add("BUKATI");
		System.out.println(cars.get(0));
		System.out.println(cars.get(01));
		System.out.println(cars.get(02));
		cars.set(04,"Rolls Royel");
		System.out.println(cars);
		System.out.println(cars.remove(0));
		System.out.println(cars.size());

	}

}
