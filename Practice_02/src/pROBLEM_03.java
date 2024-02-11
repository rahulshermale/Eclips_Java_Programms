import java.util.Scanner;
import java.time.LocalTime;

public class pROBLEM_03 {
public static void main(String[] args) {
	Scanner ra=new Scanner(System.in);
	System.out.println("enter the Number");
	
	int ob1=ra.nextInt();
	System.out.println("Enter the name");
	String ob2=ra.next();
	System.out.println("enter the salary");
	double ob3=ra.nextDouble();
	
	
	
	System.out.println(ob1+" "+ob2+" "+ob3);
	LocalTime obj=LocalTime.now();
	System.out.println(obj);
}
}
