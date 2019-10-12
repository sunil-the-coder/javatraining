import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class Student implements Serializable {

	// Solves the incompatibility issue which might occur at runtime due to
	// changes in class structure & byte stream structure.
	private static final long serialVersionUID = 1L;

	private transient int id;
	private String name;
	private double height;
	private String mobile;

	public Student(int id, String name, double height) {
		super();
		System.out.println("ctr called..");
		this.id = id;
		this.name = name;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", height=" + height + ", mobile=" + mobile + "]";
	}

}

public class FileTest {

	public static void main(String[] args) {

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

		try (ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(fileName))) {
			Student student = new Student(10, "sunil patil", 6.1);
			writer.writeObject(student);
			writer.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readFromFile(String fileName) {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));) {
			Student stud = (Student) ois.readObject();
			System.out.println(stud);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
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
