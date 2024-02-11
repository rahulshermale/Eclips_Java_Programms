//create 3 threads in such a way that while one thread is executing, 
//2 threads cannot interfere. they should display output "Exec  0" to "Exec 5".

public class Question_3 implements Runnable{
	private int id;



	public void run() {

		        Object lock;
				synchronized (lock) {
		            int count;
					while (count < 6) {
		                if (count % 3 == this.id) {
		                    System.out.println("Exec " + count);
		                    count++;
		                } else {
		                    try {
		                        lock.wait();
		                    } catch (InterruptedException e) {
		                        e.printStackTrace();
		                    }
		                }
		                lock.notifyAll();
		            }
		        }
		    }
	
		


}

    public static void main(String[] args) {
        Question_3 app1 = new Question_3();
        Question_3 app2 = new Question_3();
        Question_3 app3 = new Question_3();
        Thread thread1 = new Thread(app1);
        Thread thread2 = new Thread(app2);
        Thread thread3 = new Thread(app3);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
