import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Test{
	public static void main(String[] args) {
		try {
			FileInputStream fis =new FileInputStream("d/abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}