/*Q.1) Employee - developer Example
on developer side
define a class "Employee" inside "emppack" with
private String name,desig;
private double salary
parameterized and default constructor
setters and getters
Create jar file and documentation for the above code on Employee side access Employee class
(instantiate it and invoke its methods).*/
public class Deve {

	private String name, design;
	private double salary;

	Deve() {
	}

	public Deve(String name, String design, double salary) {
		this.name = name;
		this.design = design;
		this.salary = salary;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
