
public class PersistenceDemo {

	public static void main(String[] args) {
		PersistenceDemo demo=new PersistenceDemo();
		demo.action(new FileStorage());
		demo.action(new DataBaseStorage());
	}

	

	private void action(DataBaseStorage dataBaseStorage) {
		
		Persistable.save();
		Persistable.load();
		if
	}



	private void action(FileStorage fileStorage) {
		// TODO Auto-generated method stub
		
		
	}

}
