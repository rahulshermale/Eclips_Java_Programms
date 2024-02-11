
public class Pattern_Progrmm {
	public static void main(String[] args) {
		int a = 0, b = 1, c = 0;

		int n = 5;

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {

				System.out.print(c + " ");
				a = b;
				b = c;
				c = a + b;
			}
			System.out.println("");
		}
	}
}