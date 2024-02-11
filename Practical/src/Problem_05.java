
public class Problem_05 {
	public static void main(String[] args) {
		int i;
		for (i = 0; i <= 3; i++) {
			for (int j = 0; j <= 2; j++) {
				System.out.print(" *");
			}
		}
		System.out.println(" ");

		int k = 0;
		for (k = 0; k < 10; k++) {
			if (k == 2)
				continue;
			System.out.println(k);
		}

	}
}
