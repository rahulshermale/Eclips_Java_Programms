import java.io.*;

public class Question_4 {
    public static void main(String[] args) {
        try {
            
            FileReader source = new FileReader("source.txt");
           
            FileWriter destination = new FileWriter("destination.txt");

            int character;
            while ((character = source.read()) != -1) { 
                destination.write(character); 
            }

     
            source.close();
            destination.close();
            
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
