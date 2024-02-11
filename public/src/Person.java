class CPU{
	double price;
	class Processor{
		double cores;
		String manufacture;
		
		double getCatche() {
			return 3.4;
		}
	}
	protected class RAM{
		double memory;
		String manufacturer;
		double getClockSpeed() {
			return 5.5;
		}
	}
}
public class Person{
	public static void main(String[] args) {
		CPU ob=new CPU();
		CPU.Processor proc=ob.new Processor();
		
		CPU.RAM ram=ob.new RAM();
		
		System.out.println(proc.getCatche());
		System.out.println(ram.getClockSpeed());
	}
}