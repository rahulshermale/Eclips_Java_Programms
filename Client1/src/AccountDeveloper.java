
class devloperAccount {

	private int id;
	private String name;
	private int accno;
	private double balance;
	private String address;
	private static final int rate=8;
	public static int getRate() {
		return rate;
	}
	public void setId(int id) {
		this.id = id;
	}

	public void getId() {
//		return id;
		System.out.println("Your id " + id);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getName() {
//		return name;
		System.out.println("Your Name " + name);
	}

	public void setAccno(int accno) {
		this.accno = accno;
	}

	public void getAccno() {
//		return accno;
		System.out.println("Your Account number" + accno);
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void getBalance() {
//		return balance;
		System.out.println("Your Balance" + balance);
	}

	public void setAddres(String address) {
		this.address = address;
	}

	public void getAddress() {
//		return address;
		System.out.println("Your Addres " + address);

	}}

public class  AccountDeveloper{
	
	public static void main(String[] args) {
		devloperAccount A1 = new  devloperAccount();
		
		A1.setId(123);
		A1.setName("RAhul Shermale");
		A1.setAccno(15476);
		A1.setBalance(21586365);
		A1.setAddres("Manmad");
		
		A1.getId();
		A1.getName();
		A1.getAccno();
		A1.getBalance();
		A1.getAddress();
		
		
		
		
	}
	
	
	
	
}
	
	

