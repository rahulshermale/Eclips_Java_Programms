
/*
3) create LinkedList with the values 10,20,30 and 40.
display it.now:
 	insert 500 in the beginning.
	insert 400 at 2nd position.
	add 1000 at the end.
display the list again.
*/
import java.util.LinkedList;

public class D12_Q3_LinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> num = new LinkedList<Integer>();
		num.addFirst(500);
		num.add(400);
		num.addLast(1000);
		System.out.println(num);
	}

}
