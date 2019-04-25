import java.io.File;
import java.util.Date;

public class Test {

	public static void main(String[] args) {

		//D:\\data\\nobel.txt
		File f = new File("/home/sunil/");
		
		System.out.println("canRead:"+f.canRead());
		System.out.println("canExecute:"+f.canExecute());
		System.out.println("Size:"+f.length());
		
		Date  date = new Date(f.lastModified());
		System.out.println("Last Modified At:"+date);
		System.out.println("isFile:"+f.isFile());
		System.out.println("Parent File:"+f.getParentFile());
		
		//f.delete();
		
	}
}
