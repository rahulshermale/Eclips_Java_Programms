


public class Demo {
 public static void main(String[] args) {
     try {
         Person p = new Person("John", 20);
         System.out.println(p);
     } catch (VotingNotAllowedException e) {
         System.out.println(e.getMessage());
     }
 }
}