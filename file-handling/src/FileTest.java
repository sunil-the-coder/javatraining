import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileTest {

	public static void main(String[] args) {

		String fileName = "/home/sunil/demo.txt";
//		writeToFile(fileName);
	//	readFromFile(fileName);

		final String srcFile = "/home/sunil/first.sh";
		final String destFile = "/home/sunil/second.sh";

		copy(srcFile, destFile);
	}

	private static void copy(String srcFile, String destFile) {

		Reader reader = null;
		Writer writer = null;

		try {
			reader = new FileReader(srcFile);
			writer = new FileWriter(destFile);

			int value;
			while ((value = reader.read()) >= 0)
				writer.write(value);
			
			System.out.println("Copy Done.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close();
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private static void writeToFile(String fileName) {

		Writer writer = null;

		try {
			writer = new FileWriter(fileName);
			writer.write("Welcome to file handling");
			writer.flush();// move contents from buffer to actual hard disk

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	private static void readFromFile(String fileName) {
		Reader reader = null;
		try {
			reader = new FileReader(fileName);
			int ch;
			while ((ch = reader.read()) >= 0)
				System.out.print((char) ch);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		/*
		 * try { InputStream is = new FileInputStream(fileName); int ch; while ((ch =
		 * is.read()) >= 0) System.out.print((byte) ch);
		 * 
		 * is.close();
		 * 
		 * } catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
		 * e) { e.printStackTrace(); }
		 */
	}
}
