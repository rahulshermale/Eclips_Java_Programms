/*
4) add 5 numbers inside CopyOnWriteArrayList and show
 how can you add one more number at the same time of traversal through its iterator.
*/
//D12_Q4_CopyOnWriteArrayList

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {

	public static void main(String[] args) {

		CopyOnWriteArrayList<Integer> arrList = new CopyOnWriteArrayList<Integer>();

		arrList.add(100);
		arrList.add(200);
		arrList.add(300);
		arrList.add(400);
		arrList.add(500);

		System.out.println("CopyOnWriteArrayList Elements = " + arrList);
		
		Iterator<Integer> itr =arrList.iterator();
		int j=0;
		while(itr.hasNext())
		{
			int k=(int) itr.next();
			j=j+k;

			System.out.println(k);
		}
		System.out.println("Sum of elements is: ");
		System.out.println(j);
		
	}
}