
/*
2) on the developer side:
	create a generic class which can accept any type
		with setters , getters and toString methods.
	create necessary jar files and  documentation.

on client side 
	create the object of above generic class and invoke its setters , getters and display the object.

*/
import static java.lang.System.out;

class Generic1<T> {
	// variable of T type
	private T val;

	void setVal(T first) {
		this.val = first;
	}

	T getVal() {
		return val;
	}

}

public class D12_Q2_GenericAnyType {

	public static void main(String[] args) {

		Generic1<String> g1 = new Generic1<String>();
		g1.setVal("Hello Generic");
		out.println(g1.getVal());

		Generic1<Integer> g2 = new Generic1<Integer>();
		g2.setVal(420);
		out.println(g2.getVal());

		Generic1<Boolean> g3 = new Generic1<Boolean>();
		g3.setVal(true);
		out.println(g3.getVal());
	}
}
