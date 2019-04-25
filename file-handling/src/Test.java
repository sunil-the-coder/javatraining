import java.io.File;
import java.io.FilenameFilter;

public class Test {

	public static void main(String[] args) {

		File f = new File("/home/sunil/unix");

		String[] fileNames = f.list();
		for (String file : fileNames)
			System.out.println(file);

		JavaFileFilter javaFilter = new JavaFileFilter();
		//TxtFileFilter txtFilter = new TxtFileFilter();
		
		//File[] files = f.listFiles(javaFilter);
		
		//Using java 8 lambda expression
		File[] files = f.listFiles((dir,name)->name.endsWith(".txt"));
		
		for (File f1 : files) {
			System.out.println(f1.getAbsolutePath());
			//f1.delete();
		}
	}
}


class JavaFileFilter implements FilenameFilter {
	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(".java");
	}
}
