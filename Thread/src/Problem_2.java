class MyThreadrunnable implements Runnable
{
	public void run() {
	System.out.println("Rahul Shermale");
	}
	}
class MyThreadRunnable1 implements Runnable{
	public void run() {
		System.out.println("shermale rahul");
	}
	
}
	
	

	

public class Problem_2 {
public static void main(String[] args) {
	MyThreadrunnable bullet1=new MyThreadrunnable();
	Thread gun=new Thread(bullet1);////////////////////////////////////////////////////////////////////////////////////////////////////oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo//////////////////////////////////////////////////////////
	MyThreadRunnable1 bullet=new MyThreadRunnable1();
	Thread gun1= new Thread(bullet);
	gun.start();
	gun1.start();
	
}
}
