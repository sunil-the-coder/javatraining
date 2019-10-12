
public class Test {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			new Thread(() -> {
				Singleton s1 = Singleton.getInstance();
				System.out.println(s1);
			}).start();

		}
		
		/*
		 * Singleton s1 = Singleton.getInstance(); Singleton s2 =
		 * Singleton.getInstance(); Singleton s3 = Singleton.getInstance();
		 * 
		 * System.out.println(s1); System.out.println(s2); System.out.println(s3);
		 */
	}
}
