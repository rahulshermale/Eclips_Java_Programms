
public class Question_Thread implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Hello +" + Thread.currentThread().getName()+ " \t" +    i);
		}
		
	}
public static void main(String[] args) {
	Question_Thread obj=new Question_Thread();
	Thread t1=new Thread(obj);
	t1.start();
	t1.setName("rAHUL");
	
	
}


}
