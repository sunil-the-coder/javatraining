import java.io.File;

public class Test {

	public static void main(String[] args) {

		File f = new File("/home/sunil/unix");

		String[] fileNames = f.list();
		for (String file : fileNames)
			System.out.println(file);

		File[] files = f.listFiles();
		for (File f1 : files) {
			if (f1.getName().endsWith(".java")) {
				f1.delete();
			}
			System.out.println(f1.getAbsolutePath());
		}
	}
}
