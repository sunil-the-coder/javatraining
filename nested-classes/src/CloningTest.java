class Employee implements Cloneable {
	private int id;
	private String employeeName;

	public Employee(int id, String employeeName) {
		super();
		this.id = id;
		this.employeeName = employeeName;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + "]";
	}

}

public class CloningTest {

	public static void main(String[] args) {

		Employee originalEmp = new Employee(10, "Sunil");
		System.out.println(originalEmp);
		
		try {
			Employee clonedEmp = (Employee) originalEmp.clone();
			System.out.println(clonedEmp);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
	}
}
