package Chapter02;

class Employee {
	
	public static int serialNum = 1000;
	
	private int employeeId;
	private String employeeName;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeeLee = new Employee();
		employeeLee.setEmployeeName("이순신");

		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
				
		System.out.println(employeeLee.getEmployeeName() + ", " + employeeLee.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + ", " + employeeKim.getEmployeeId());
	
		System.out.println(Employee.serialNum);
	}

}
