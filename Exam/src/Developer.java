/*Q.1) Employee - developer Example
on developer side
define a class "Employee" inside "emppack" with
private String name,desig;
private double salary
parameterized and default constructor
setters and getters
Create jar file and documentation for the above code on Employee side access Employee class
(instantiate it and invoke its methods).*/
class Employee {

	private String name;
	private String design;
	private double salary;

	public void getName() {
//		return name;
		System.out.println(name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getDesign() {
//		return design;
		System.out.println(design);
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public void getSalary() {
//		return salary;
		System.out.println(salary);

	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}





public class Developer {
	public static void main(String[] args) {

		Employee empployee = new Employee();
		empployee.getName();
		empployee.getSalary();
		empployee.getDesign();

	}

}
