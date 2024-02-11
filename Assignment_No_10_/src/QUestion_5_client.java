

public class QUestion_5_client {



 private String name;
 private int age;

 public void Person(String name, int age) throws VotingNotAllowedException {
     if (age < 18) {
         throw new VotingNotAllowedException();
     }
     this.name = name;
     this.age = age;
 }

 public String toString() {
     return "Name: " + name + ", Age: " + age;
 }
}
