
public class CourseDemo {
	public static void main(String[] args) {

		Basic b = new Basic();
		DacDbda d = new DacDbda();
		MsCit m = new MsCit();

		Course[] arr = new Course[3];

		arr[0] = b;
		arr[1] = d;
		arr[2] = m;

		for (int i = 0; i < 3; i++) {
			arr[i].start();
			System.out.println(arr[i].fees());

			if (arr[i] instanceof DacDbda) {
				((DacDbda) arr[i]).orientation();
			}
		}
	}

}
