class MyThreads extends Thread{
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("The programm is running");
			System.out.println("hello");
			i++;
		}
	}
	}
class MyThread1 extends Thread{
public	void run() {
	int i=0;
	while(i<100) {
		System.out.println("the value will be print");
		System.out.println("the value 565656989+ will be print");
		 i++;
	}
}
}



public class Prob_1{
	public static void main(String[] args) {
		
		
		
		MyThreads T1=new MyThreads();
		MyThread1 T2=new MyThread1();
		T1.start();
		T2.start();
		
		
	}
}