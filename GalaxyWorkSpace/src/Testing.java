import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("3", "venkat", "chandu", "2000");
		Employee e2 = new Employee("1", "sunil", "Jillellamudi", "3000");
		Employee e3 = new Employee("4", "Santoshbommi", "reddy", "4000");
		Employee e4 = new Employee("5", "Gopi", "kuppan", "5000");
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		System.out.println( employees);
		
		Collections.sort(employees);
		
		System.out.println(employees);
		
	}}


