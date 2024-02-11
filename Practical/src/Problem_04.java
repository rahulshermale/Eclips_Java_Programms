public class Problem_04{
	public static void main(String[] args) {
		int i =0;
		float j=0f;
		
		while(i<=10) {
			System.out.print(" "+i*2);
			i++;
		}
		System.out.println("");
		do {
			j++;
			System.out.print(" "+(int)(j*3));
			
		}
		while(j<10);
		
		System.out.println("");
		for(int k=1;k<=10;k++) {
			System.out.print(" "+ k*4);
		}
	}
}