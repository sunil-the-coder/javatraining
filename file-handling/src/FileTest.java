import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

class MyResource implements AutoCloseable {
	public void write() {
		System.out.println("myresource write....");
	}

	@Override
	public void close() {
		System.out.println("myresource closed.");
	}
}

public class FileTest {

	public static void main(String[] args) {

		try (MyResource resource = new MyResource();) {
			System.out.println("Resource opened...");
		} catch (Exception e) {

		}

		String fileName = "/home/sunil/test.cpp";
//		writeToFile(fileName);
		 readFromFile(fileName);

		final String srcFile = "/home/sunil/ubuntu-18.04.1-desktop-amd64.iso";
		final String destFile = "/home/sunil/data/ubuntu-18.04.1-desktop-amd64.iso";

//		copy(srcFile, destFile);
	}

	private static void copy(String srcFile, String destFile) {

		try (InputStream is = new FileInputStream(srcFile); OutputStream os = new FileOutputStream(destFile);) {
			int totalReads;
			System.out.println("Copying started....");
			
			byte[] data = new byte[2 * 1024];
			while ((totalReads = is.read(data)) >= 0)
				os.write(data,0,totalReads);

			System.out.println("Copy Done.");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeToFile(String fileName) {

		try (Writer writer = new FileWriter(fileName)) {
			writer.write("Welcome to file handling");
			writer.flush();// move contents from buffer to actual hard disk
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void readFromFile(String fileName) {
		try (BufferedReader reader = 
				new BufferedReader(new FileReader(fileName));) {
			String line = "";
			
			while ((line = reader.readLine()) != null)
				System.out.println(line);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
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
