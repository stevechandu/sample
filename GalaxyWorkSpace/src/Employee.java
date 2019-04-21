
public class Employee implements Comparable<Employee> {
	
	

	private String employeeID;
	private String FirstName;
	private String LastName;
	private String Salary;
	
	public Employee(String employeeID, String firstName, String lastName, String salary) {
		super();
		this.employeeID = employeeID;
		FirstName = firstName;
		LastName = lastName;
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", FirstName=" + FirstName + ", LastName=" + LastName
				+ ", Salary=" + Salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.employeeID - o.employeeID;
	}
}

	
	

	
	
	


