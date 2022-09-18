package EmployeeCh5;

public class Manager extends Employee {
	
	protected String departmentManaged;

	public static final int MANAGEMENT_PAYMENT = 5000;

	public Manager(int no, String name, int year, String department, String departmentManaged) {

		super(no, name, year, department);

		this.departmentManaged = departmentManaged;

	}

	@Override
	public double calculateSalary() throws SalaryPaidOnBankException {

		double salary1 = year * MANAGEMENT_PAYMENT;

		if (salary1 >= 7000) {
			throw new SalaryPaidOnBankException("Your salary has been deposited in your bank. Amount:" + salary1);

		} else if (salary1 < 7000) {
			System.out.println("You can get your salary by hand.");
		}
		return salary1;
	}

	@Override
	public void work() {
		System.out.println("Manager is working..");
	}

	@Override
	public String toString() {
		return "Manager [departmentManaged=" + departmentManaged + "]";
	}
}
