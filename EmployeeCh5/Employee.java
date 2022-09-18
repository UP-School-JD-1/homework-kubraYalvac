package EmployeeCh5;

public class Employee {
	
	protected int no;
	protected String name;
	protected int year;
	protected String department;

	public static final int BASE_SALARY = 1000;

	public Employee(int no, String name, int year, String department) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.department = department;

	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void work() {
		System.out.println("Employee is working..");
	}

	public double calculateSalary() throws SalaryPaidOnBankException {

		double salary = year * BASE_SALARY;

		if (salary >= 7000) {
			throw new SalaryPaidOnBankException("Your salary has been deposited in your bank. Amount:" + salary);

		} else if (salary < 7000) {
			System.out.println("You can get your salary by hand.");
		}
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [no=" + no + ", name=" + name + ", year=" + year + ", department=" + department + "]";
	}

	public static int getBaseSalary() {
		return BASE_SALARY;
	}
}
