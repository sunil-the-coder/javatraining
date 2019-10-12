class Employee implements Cloneable {
	private int id;
	private String employeeName;
	private Department dept;

	public Employee(int id, String employeeName, Department dept) {
		super();
		this.id = id;
		this.employeeName = employeeName;
		this.dept = dept;
	}

	@Override
	protected Employee clone() throws CloneNotSupportedException {
		Employee emp = (Employee) super.clone();
		emp.setDept(emp.getDept().clone());
		return emp;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Department getDept() {
		return dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", dept=" + dept + "]";
	}

}

class Department implements Cloneable {
	private int id;
	private String deptName;

	public Department(int id, String deptName) {
		super();
		this.id = id;
		this.deptName = deptName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	protected Department clone() throws CloneNotSupportedException {
		return (Department)super.clone();
	}
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", deptName=" + deptName + "]";
	}

}

public class CloningTest {

	public static void main(String[] args) {

		Department dept = new Department(1, "Science");
		Employee originalEmp = new Employee(10, "Sunil", dept);

		try {
			Employee clonedEmp = (Employee) originalEmp.clone();
			clonedEmp.getDept().setDeptName("Electronics");

			System.out.println(clonedEmp);
			System.out.println(originalEmp);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}
}
