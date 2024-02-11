import java.util.Scanner;

public class Normal{public static void main(String[] args) {
	

	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number");
	
	int number=sc.nextInt();
	if(number%2==1) {
		System.out.println("number is prime");
	}
	else {
		System.out.println("number is non prime");
	}
	
}


}


 