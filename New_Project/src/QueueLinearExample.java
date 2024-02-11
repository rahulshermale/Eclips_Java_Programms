import java.util.*;
public class QueueLinearExample {
    private int front,rear,Maxsize,queue[];
    void createQueue(int size)
    {
        Maxsize=size;
        front=0;
        rear=-1;
        queue=new int[size];
    }
    void Enqueue(int e)
    {
        rear++;
        queue[rear]=e;
    }
    boolean isFull()
    {
        if(rear==Maxsize-1)
          return true;
        else 
          return false;
    }
    int Dequeue()
    {
        int temp=queue[front];
        front++;
        return(temp);
    }
    boolean isEmpty()
    {
        if(front>rear)
          return true;
        else 
          return false;
    }
    void printQueue()
    {
        for(int i=front;i<=rear;i++)
        System.out.println(queue[i]);
    }
    public static void main(String[]args)
    {
        int size,ch,e;
        QueueLinearExample obj= new QueueLinearExample();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of queue");
        size=sc.nextInt();
        obj.createQueue(size);
        do
        {
          System.out.println("\nmenu for Queue\n1.Enqueue\n2.Dequeue\n3.print\n0.Exit");
          ch=sc.nextInt();
          switch(ch)
          {
              case 1:
                if(obj.isFull()!=true)
                {
                  System.out.println("enter element:");
                  e=sc.nextInt();
                  obj.Enqueue(e);
                }
                else 
                System.out.println("queue Full");
                break;
                case 2:
                if(obj.isEmpty()!=true)
                {
                  System.out.println("element dequeue:"+obj.Dequeue());
                }
                else 
                  System.out.println("queue empty");
                break;
                
                case 3:
                if(obj.isEmpty()!=true)
                {
                  System.out.println("queue has");
                 obj.printQueue();
                }
                else 
                System.out.println("queue empty");
                break;
                case 0:
                System.out.println("Exiting code");
                break;
                default:
                System.out.println("Wrong choice");
                break;
              }
        }
            while(ch!=0);
          }
        }
