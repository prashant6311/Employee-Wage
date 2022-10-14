package employeeWage;

public class EmployeeWage {

	public static void main(String[] args) {

		System.out.println("welcome to Employee Wage Computation Program");

		int empcheck = (int)Math.floor(Math.random()*10)%2;
		if(empcheck == 1)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

}
