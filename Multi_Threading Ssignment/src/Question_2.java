//above program  using "implements Runnable" method.
//) create a multi-threaded application by using  "extends Thread " method.create 2 threads. they should display characters from A to J.

public class Question_2 implements Runnable {

	public void run() {
		for (char i = 'A'; i <= 'J'; i++) {

			System.out.println("char " + i);
		}
	}

	public static void main(String[] args) {
		Question_2 obj = new Question_2();

		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.start();
		t2.start();

	}
}
