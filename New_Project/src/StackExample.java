import java.util.*;
public class StackExample
 {
    private int tos,Maxsize;
     int[] stack;
    void createStack (int size)
    {
       Maxsize=size;
       tos=-1;
       stack=new int[size];
    }
    void push(int e)
    {
        tos++;
        stack[tos]=e;
    }
    boolean isFull()
        {
         if(tos==Maxsize-1)
           return true;
         else 
           return false;
        }
    int pop()
        {
          int temp=stack[tos];
          tos--;
          return temp;
        }
    boolean isEmpty()
        {
         if(tos==-1)
           return true;
         else 
           return false;
        }
    void printStack()
        {
            for(int i=tos;i>=0;i--)
            System.out.println(stack[i]);
        }
    int peek()
        {
             return(stack[tos]);
        }
     public static void main(String[]args)
     {
            int ch,e,size;
            StackExample obj=new StackExample();
            Scanner sc = new Scanner(System.in);
            System.out.println("enter size of stack");
            size=sc.nextInt();
            obj.createStack(size);
            do
            {
                System.out.println("\nMenu for stack\n1.push\n2.pop\n3.peek\n4.print\n0.Exit");
                ch=sc.nextInt();
                switch(ch)
                {
                    case 1:
                      if(obj.isFull()!=true)
                      {
                        System.out.println("enter element:");
                        e=sc.nextInt();
                        obj.push(e);
                      }
                      else 
                      System.out.println("stack Full");
                      break;
                      case 2:
                      if(obj.isEmpty()!=true)
                      {
                        System.out.println("element poped:"+obj.pop());
                      }
                      else 
                        System.out.println("stack empty");
                      break;
                      case 3:
                      if(obj.isEmpty()!=true)
                      {
                        System.out.println("element at peek:"+obj.peek());
                      }
                      else 
                      System.out.println("stack empty");
                      break;
                      case 4:
                      if(obj.isEmpty()!=true)
                      {
                        System.out.println("stack has");
                       obj.printStack();
                      }
                      else 
                      System.out.println("stack empty");
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
