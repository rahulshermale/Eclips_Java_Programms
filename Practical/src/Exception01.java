//import java.util.*;
public class Exception01 {
public static void main(String[] args) {
try {
	int a=10/0;
	String s=null;
	System.out.println(s.length());
}
catch(ArithmeticException  | NullPointerException e) {
	
	System.out.println(e);
	System.out.println();
	
}
System.out.println("rest the code ....");
}

	

}