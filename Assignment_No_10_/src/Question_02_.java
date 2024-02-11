//Define a class Sample with member variable “char ch” and 
//a parameterized constructor. Create some instances(at least 2)
//of this class by passing any alphabet.  Now achieve following tasks:

class Sample {
	char ch;

	public Sample(char ch) {
		this.ch = ch;

	}

	public char getCh() {
		return ch;
	}


	public void setCh(char ch) {
		this.ch = ch;
	}
	public void disp() {
		System.out.println(ch);
	}
}

public class Question_02_ {
	public static void main(String[] args) {
		Sample obj = new Sample('A');
		Sample obj1 = new Sample('B');

		System.out.println(obj.getCh());
		System.out.println(obj1.getCh());


      obj.setCh('X');
      obj1.setCh('Y');
      obj.disp();
      obj1.disp();
	}
}
