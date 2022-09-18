package EmployeeCh5;

public class Director extends Manager {
	
	protected double bonus;

	public Director(int no, String name, int year, String department, String managingDepartment, double bonus) {

		super(no, name, year, department, managingDepartment);
		this.bonus = bonus;

	}

	@Override
	public void work() {
		System.out.println("Director is working..");
	}

	@Override
	public String toString() {
		return "Director [bonus=" + bonus + "]";
	}

	public double calculateSalary() throws SalaryPaidOnBankException {
		double salary2 = (year * MANAGEMENT_PAYMENT) + bonus;

		if (salary2 >= 7000) {
			throw new SalaryPaidOnBankException("Your salary has been deposited in your bank. Amount:" + salary2);

		} else if (salary2 < 7000) {
			System.out.println("You can get your salary by hand.");
		}
		return salary2;
	}
}
