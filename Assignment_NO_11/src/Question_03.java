import java.io.*;

public class Question_03 {
   public static void main(String[] args) {
      
    
      if (args.length != 2) {
         System.out.println("Usage: FileCopy <input file> <output file>");
         System.exit(1);
      }
      
      String inputFileName = args[0];
      String outputFileName = args[1];
      
      try (FileInputStream fis = new FileInputStream(inputFileName);
           FileOutputStream fos = new FileOutputStream(outputFileName)) {
           
           byte[] buffer = new byte[1024];
           int bytesRead;
           
           while ((bytesRead = fis.read(buffer)) != -1) {
              fos.write(buffer, 0, bytesRead);
           }
           
           System.out.println("File copy successful!");
           
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}
