package test.MultiThreading;

abstract class coldBeavrage {

	abstract void packing();

	abstract void preparingProcess();
}

class Lassi extends coldBeavrage {

	String Curd;
	int suger;
	int flavour;

	@Override
	public void packing() {
		// TODO Auto-generated method stub

	}

	public void preparingProcess() {

		System.out.println("preapring process");
	}
}

class FruitJuice extends coldBeavrage {

	String Fruit;
	String Suger;
	String Ice;

	@Override
	public void packing() {
		// TODO Auto-generated method stub

	}

	@Override
	void preparingProcess() {
		// TODO Auto-generated method stub

	}

	void preparingProcess(int Suger) {
		System.out.println("for more Sweeter ");
	}

	void AddFruitCrush() {
		System.out.println("Adding extra frut crush at time of serving as per user reqiremengt");
	}

}

class coldDrink extends coldBeavrage {

	String Flavour;
	String Carbonation;

	@Override
	public void packing() {
		// TODO Auto-generated method stub

	}

	@Override
	void preparingProcess() {
		// TODO Auto-generated method stub

	}

}

public class Fridge {

	public static void Serve(coldBeavrage ref) {
		ref.packing();
		ref.preparingProcess();

		if (ref instanceof FruitJuice) {
			((FruitJuice) ref).AddFruitCrush();
		}
	}

	public static void main(String[] args) {

		coldBeavrage c1 = new Lassi();
		coldBeavrage c2 = new FruitJuice();
		// Serve(new Lassi());
		// Serve(new FruitJuice());
		// Serve(new coldDrink());
	}

}