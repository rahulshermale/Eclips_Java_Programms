import java.util.Scanner;

//) Create user defined checked exception "InvalidCredentialsException".
//define a class "Login" with void accept(String user,String password) method. this accept should
//check if user and password are not "scott" and "tiger" respectively, it should raise
//"InvalidCredentialsException" saying that "invalid credentials have been entered" or else display a
//message “Successful Login”. define a class "Demo" with main function. In this main function accept
//username and password from the user and pass them to “accept()” method of “Login” class.
public class InvalidCredentialsException extends Exception {
	public InvalidCredentialsException(String message) {
		super(message);
	}
}

 class Login {
	public void accept(String user, String password) throws InvalidCredentialsException {
		if (!user.equals("scott") || !password.equals("tiger")) {
			throw new InvalidCredentialsException("Invalid credential entered");
		} else {
			System.out.println("Successfull Login");
		}
	}
}

 class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		String user=sc.nextLine();
		
		System.out.println("Enter the Password");
		String password=sc.nextLine();
		Login login= new Login();
	    try {
	         login.accept(user, password);
	    } catch (InvalidCredentialsException e) {
		         System.out.println("Error: " + e.getMessage());
	}
}
}
