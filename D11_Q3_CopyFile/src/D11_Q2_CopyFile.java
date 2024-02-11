
/*
3) write a file copy program using byte streams.
( FileOutputStream and FileInputStream )
*/
 
import java.io.*;

public class D11_Q2_CopyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream sourceStream = null;
		FileOutputStream targetStream = null;

		try {
			sourceStream = new FileInputStream("source.txt");
			targetStream = new FileOutputStream("destination.txt");

			// Reading source file using read method
			// and write to file byte by byte using write method
			int temp;
			while ((temp = sourceStream.read()) != -1)
				targetStream.write((byte) temp);
		} finally {
			if (sourceStream != null) {
				sourceStream.close();
			}
			if (targetStream != null) {
				targetStream.close();
			}
		}
	}
}
