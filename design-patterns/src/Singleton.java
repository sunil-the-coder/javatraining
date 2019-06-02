
//Non-Thread safe singleton
public class Singleton {

	private static Singleton singleton; // default value is null

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (singleton == null)
			singleton = new Singleton();
		return singleton;
	}
}
