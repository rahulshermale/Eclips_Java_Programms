
public class Problem_7 {
	public static void main(String[] args) {

		int Arr[] = { 3, 5, 2, 1, 7 };
		int Arr1[] = { 2, 3, 5, 2, 1, 7 };

		Arr1[0] = 3*1;
		Arr1[1] = 5 * 2;
		Arr1[2] = 3 * 2;
		Arr1[3] = 5 * 1;
		Arr1[4] = 2 * 7;
		Arr1[5] = 1*1;
		for (int j = 0; j < Arr1.length; j++)
			System.out.println(Arr1[j]);

		Arr[0] = 5*1;
		Arr[1] = 3 * 2;
		Arr[2] = 5 * 1;
		Arr[3] = 7 * 2;
		Arr[4] = 1 * 1;

		for (int i = 0; i < Arr.length; i++) {
			System.out.println(Arr[i]);

		}
	}
}
