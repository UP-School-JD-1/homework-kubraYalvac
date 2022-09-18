//Course2 Chapter5 Hw1 Exception Handling 

package EmployeeCh5;

public class EmployeeTest {
	public static void main(String[] args) {

		Employee employee1 = new Employee(128, "Kubra", 7, "Engineer");
		employee1.work();
		try {
			System.out.println("Amount to be paid: " + employee1.calculateSalary());
		} catch (SalaryPaidOnBankException e) {
			e.getMessage();
			durationSalaryPaidOnBankException(e);

		}

		Manager manager1 = new Manager(250, "Ebru", 10, "Engineer", "IT");
		manager1.work();

		try {
			System.out.println("Amount to be paid:" + manager1.calculateSalary());
		} catch (SalaryPaidOnBankException e) {
			e.getMessage();
			durationSalaryPaidOnBankException(e);
		}

		Director director1 = new Director(25, "Ali", 12, "Engineer", "SWE", 500);
		director1.work();

		try {
			System.out.println("Amount to be paid:" + director1.calculateSalary());
		} catch (SalaryPaidOnBankException e) {
			e.getMessage();
			durationSalaryPaidOnBankException(e);
		}

	}

	private static void durationSalaryPaidOnBankException(SalaryPaidOnBankException e) {

		System.err.println(e.getMessage());
	}
}
