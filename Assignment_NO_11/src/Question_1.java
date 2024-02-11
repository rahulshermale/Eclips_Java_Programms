//)accept 10 characters from a user ( use Scanner).
//store these 10 characters in a file. (FileWriter)
//Now open a file and read all these characters.


	import java.io.FileWriter;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Scanner;

	public class Question_1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter 10 characters:");
	        String input = scanner.nextLine();

	        try (FileWriter writer = new FileWriter("myFile.txt")) {
	            writer.write(input);
	        } catch (IOException e) {
	            System.out.println("Error writing to file: " + e.getMessage());
	        }

	        try (FileReader reader = new FileReader("myFile.txt")) {
	            int ch;
	            StringBuilder sb = new StringBuilder();
	            while ((ch = reader.read()) != -1) {
	                sb.append((char) ch);
	            }
	            System.out.println("Characters read from file: " + sb.toString());
	        } catch (IOException e) {
	            System.out.println("Error reading from file: " + e.getMessage());
	        }
	    }
	}


