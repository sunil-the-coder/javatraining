import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileTest {

	public static void main(String[] args) {

		String fileName = "/home/sunil/first.sh";
		readFromFile(fileName);
		//writeToFile(fileName);
	}

	private static void readFromFile(String fileName) {

		try {			
			Reader reader = new FileReader(fileName);
			int ch;
			while((ch = reader.read()) >= 0)
				System.out.print((char)ch);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {			
			InputStream is = new FileInputStream(fileName);
			int ch;
			while((ch = is.read()) >= 0)
				System.out.print((byte)ch);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
