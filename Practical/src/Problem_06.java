
public class Problem_06 {
	public static void main(String[] args) {
		int i = 0;
		int sum=0;
		for (i = 0; i <= 100; i++) {
			System.out.print(" "+i);
			i++;
			sum+=i;
		}
		System.out.println(" ");
		System.out.println(" "+sum);

		int k=1;
		int add=0;
		for (k = 1; k <= 100; ++k) {
			System.out.print(" "+k);
			k++;
			add+=k;
		}
		System.out.println(" ");
		System.out.println(add);
	}
}