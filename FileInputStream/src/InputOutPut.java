import java.io.*;

class InputOutPut {
	public static void main(String[] args) {//InterruptedException {
//		int num =10;

		try {
			System.out.println("I wan't Sleep very hapily    " + (10 / 0.2));
//			System.out.println((10 / 0));

		} catch (NullPointerException e) {

			System.out.println("I wan't Sleep very hapily    " + (20 / 0.2));

		} 
//		catch (Exception e) {
//			System.out.println("I wan't Sleep very hapily    " + (20));
//
//		}
finally {
	System.out.println("Rahul");
}
	}

}
