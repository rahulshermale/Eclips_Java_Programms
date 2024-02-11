public class Prractice extends Thread
{
	public void run() 
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hello " +Thread.currentThread().getName());
			try {
			    Thread.sleep(100);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
				
			}
			
		}
		
	}
public static void main(String[] args) {
	Prractice obj1 = new Prractice();
	Prractice obj2 = new Prractice();
	obj1.start();
	obj2.start();
	obj1.setName("Rahul");
	obj2.setName("ssr");
	
	
}
	
}