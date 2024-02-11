
public class Problem_09 {

	static void getAge(int age) {
		if (age < 25) {
			System.out.println(age + "My age is 50 year old");
		}

		else if (age < 50) {
			System.out.println(age + " My age Is");
		} else {
			System.out.println("Hello");
		}
	}

	public static void main(String[] args) {
		getAge(49);
	}
}
