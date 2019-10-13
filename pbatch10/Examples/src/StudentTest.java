import javax.swing.JOptionPane;

class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void disp() {
		System.out.println("[id=" + id + ", name=" + name + "]");
	}

}

class MyNumbert {
	private int data;

	MyNumbert() {
	}

	public MyNumbert(int data) {
		this.data = data;
	}

	public boolean isNegative() {
		return data < 0;
	}
	
	public boolean isEven() {
		return data % 2 == 0;
	}

}

public class StudentTest {

	public static void main(String[] args) {

		MyNumbert t1 = new MyNumbert(9);
		boolean isNeg = t1.isNegative();
		if(isNeg) {
			
			JOptionPane.showMessageDialog(null, "Number is Negative");
			//System.out.println("Number is Negative");
		}else {
			System.out.println("Number is not Negative");
		}
		
		System.out.println("isEven:"+t1.isEven());

	}
}
