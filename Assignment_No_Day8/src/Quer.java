import java.util.Scanner;

public class Quer {

	static void disp(int x) throws MyArithException {

		int result = Calculator.caldouble(x);

		System.out.println("The double of " + x + " is " + result);

	}

	public static void main(String[] args) throws MyArithException {

		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		try {

			disp(num);
		} catch (MyArithException e) {

			e.printStackTrace();
		}

	}

}
