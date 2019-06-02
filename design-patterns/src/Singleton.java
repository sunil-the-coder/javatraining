
public class Singleton {

	private static Singleton singleton; // default value is null

	private Singleton() {
		System.out.println("Object created");
	}

	// Thread safe singleton
	public static Singleton getInstance() {
		synchronized (Singleton.class) {
			if (singleton == null)
				singleton = new Singleton();
		}

		return singleton;
	}
}
