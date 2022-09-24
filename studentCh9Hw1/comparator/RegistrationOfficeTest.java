package comparator;

import java.util.*;

public class RegistrationOfficeTest {
	public static void main(String[] args) {
		RegistrationOffice registrationOffice = new RegistrationOffice();

		List<AbstractStudent> list_student = registrationOffice.getAllStudent();

		list_student.add(new GraduateStudent(1100, "Ceren", 2018, new Date(), "Philosophy", "Ali", ""));

		Collections.sort(list_student, new StudentComparator());

		for (AbstractStudent s : list_student) {
			System.out.println(s);
		}

	}
}
