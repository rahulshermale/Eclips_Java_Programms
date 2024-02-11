//) create a multi-threaded application by using  "extends Thread " method.create 2 threads. they should display characters from A to J.
public class Questiion_1 extends Thread {
	public void run() {
		for (char i = 'a'; i <= 'j'; i++) {

			System.out.println(i);

		}
	}

	public static void main(String[] args) {
		Questiion_1 obj = new Questiion_1();
		Questiion_1 obj1 = new Questiion_1();
		obj.start();
		obj1.start();

	}

}