import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

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

		String fileName = "/home/sunil/studentdata.dat";
		writeToFile(fileName);
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
				os.write(data, 0, totalReads);

			System.out.println("Copy Done.");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeToFile(String fileName) {

		try (DataOutputStream writer = new DataOutputStream(new FileOutputStream(fileName))) {
			writer.writeInt(10);
			writer.writeUTF("Sunil Patil");
			writer.writeDouble(6.1);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readFromFile(String fileName) {
		try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName));) {

			int no = dis.readInt();
			String name = dis.readUTF();
			double height = dis.readDouble();
			System.out.println("ID:" + no + ",Name:" + name + ",Height:" + height);

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
