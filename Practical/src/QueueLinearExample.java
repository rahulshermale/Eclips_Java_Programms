import java.util.Scanner;

public class QueueLinearExample {
 private int maxsize, Front, Rear;
 private int Queue[];
	
 
 	 void createQueue(int size) {
		
 		 maxsize= size;
 		 Front=0;
 		 Rear=-1;
 		 Queue= new int[maxsize];
 	 }
 	 
 	 boolean isFull() {
 		 if (Rear== maxsize-1) return true;
 		 else return false;
 		 
 	 }
 	 
 	 
 	 boolean isEmpty() {
 		 if(Front>Rear) return true;
 		 else return false;
 		 
 	 }
 	 
 	 
 	 void Enqueue(int x) {
 		 Rear++;
 		 Queue[Rear]=x;
 	 }
 	 
 	int  Dequeue() {
 		 int temp= Queue[Front];
 		 Front++;
 		 return temp;
 		 
 	 }
 	
 	
 	void Print() {
 		System.out.println();
 		for(int i= Front; i<=Rear; i++) {
 			System.out.print(Queue[i]+" ");
 			System.out.println();
 		}
 	}
 	
 	
 	
 	
 	public static void main(String[] args) 
 	{
 		QueueLinearExample obj= new QueueLinearExample();
 		Scanner sc= new Scanner(System.in);
 		System.out.println("Enter the size of Queue");
 		int n= sc.nextInt();
 		obj.createQueue(n);
 		
 		int op;

 		 do  
 	    {	
 	        
 	        System.out.println("1.Enqueue  2.Dequeue  3.Print  0.EXIT");
 	    	 op= sc.nextInt();
 	    	switch(op)
 	    	{
 	    	case 1:
 	    		if(obj.isFull()!= true)
 	    		{System.out.println(" enter the num"); int num= sc.nextInt(); obj.Enueue(num); }
 	    		else System.out.println(" Queue is full");
 	    		break;


 	    		case 2:
 	    		if(! obj.isEmpty()) { int x =obj.Deueue();System.out.println("Dequeue element is "+ x); }
 	    		else System.out.println(" Queue is Empty");
 	    		break;

 	    		
 	    		case 3:
 	    		if(! obj.isEmpty()) { obj.Print(); }
 	    		else System.out.println(" Queue is Empty");
 	    		break;

 	    		case 0 :
 	    		System.exit(0);
 	    		break;



 	    		default:
 	    		System.out.println(" Invalid Choices");


 		
 		     } 
 	     
 	     
 	     
 	     
 	    }
 	    while (op !=0);
 		 sc.close();

 		
 		
 	
 		
 		
 		
 	}

 	
 	}
 	
 	
 	
},                 