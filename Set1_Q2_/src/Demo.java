//import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.*;

class Student implements Serializable{

	int rollno;
	String name;
	String Address;

	Student(int rollno, String name, String Address) {
		this.rollno = rollno;
		this.name = name;
		this.Address = Address;
	}

	void disp() {
		System.out.println("RollNo: " + rollno + "\nName: " + name + "\nAddress: " + Address);
	}

}

public class Demo {
	public static void main(String[] args) {
		Student s1 = new Student(10, "RK", "Msouth");
		Student s2 = new Student(20, "MR", "south");
		Student s3 = new Student(30, "SK", "Nsouth");
		Student s4 = new Student(40, "RR", "Wsouth");

		List<Student> ls = new ArrayList<Student>();
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		ls.add(s4);
		try (
		FileOutputStream fos =new FileOutputStream("output.txt");
		ObjectOutputStream oos=new ObjectOutputPrintStream(fos);
		FileInputStream fis=new FileInputStream("output.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);){
		
			oos.writeObject(ls);
			List<Student> readls=(List<Student>) ois.readObject();
			Iterator<Student> itr=readls.iterator();
			while(itr.hasnext()) {
				((Student) itr.next()).disp();
				}
		}Catch(IoException | ClassNotFoundException e){
		e.printStackTrace();
	}
			
}