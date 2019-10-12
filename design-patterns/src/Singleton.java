
public class Singleton {

	//Eager singleton
	private static Singleton singleton = new Singleton();

	private Singleton() {
		System.out.println("Object created");
	}

	// Thread safe singleton
	public static Singleton getInstance() {
		
		//lazy singleton
		/*
		 * //class level locking synchronized (Singleton.class) { if (singleton == null)
		 * singleton = new Singleton(); }
		 */
		return singleton;
	}
}
