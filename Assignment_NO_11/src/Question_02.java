import java.io.*;

public class Question_02 {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("test.txt", "rw");

            
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter message to write in file: ");
            String message1 = reader.readLine();
            file.writeUTF(message1);

           
            file.seek(0);

            String storedMessage = file.readUTF();
            System.out.println("Message stored in file: " + storedMessage);

          
            file.seek(file.length());
            
            System.out.print("Enter another message to write in file: ");
            String message2 = reader.readLine();
            file.writeUTF(message2);

           
            file.seek(0);

           
            byte[] content = new byte[(int) file.length()];
            file.readFully(content);

           
            System.out.println("Entire content of file:");
            System.out.println(new String(content));

           
            file.close();
        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}
