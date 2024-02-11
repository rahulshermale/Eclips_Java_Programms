
public class CourseDemo {
	public static void main(String[] args) {
		Mscit m=new Mscit();
		Basic b =new Basic();
		DacDbda d =new DacDbda();
		
		
		
		Course[] arr=new Course[3];
		
		arr[0]=m;
		arr[1]=b;
		arr[2]=d;
		
		for( int i = 0;i<3;i++) {
			System.out.println(arr.length);
		}
	}
	}


