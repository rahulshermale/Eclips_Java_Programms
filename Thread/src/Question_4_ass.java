//4)	Show the example of single level inheritance with constructor invocation.

class parant{
   
	int a=10;
	void disp() {	
		System.out.println(a);
		
		
	}
}
class childe extends parant{
	int b=20;
	void disp1() {
		System.out.println(b);
	}
	
}

public class Question_4_ass {
public static void main(String[] args) {
	childe obj=new childe();
	System.out.println(obj.a);
	System.out.println(obj.b);
	obj.disp();
	obj.disp1();
}
}
