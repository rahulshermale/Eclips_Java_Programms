
public class Problem_01 {
	enum month{
	JAN,
	FEB,
	MARCH,
	APRIL,
	MAY
	}


public static void main(String[]args) {
month MyVar=month.APRIL;

switch(MyVar) {
case JAN:
	System.out.println("THE MONTH JANAURY");
	break;
case FEB:
	System.out.println("THE MONTH FEBRURY");
	break;
case MARCH:
	System.out.println("THE MONTH MARCH");
	
	break;
case APRIL:
	System.out.println("THE MONTH IS APRIL");
	break;
case MAY:
	System.out.println("THE MONTH IS MAY");
	break;
default:
	break;

}
}
}