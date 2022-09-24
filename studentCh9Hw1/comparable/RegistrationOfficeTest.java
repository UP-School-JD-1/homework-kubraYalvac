//Course2 Chapter9 Collections Hw1 

package comparable;

import java.util.*;

public class RegistrationOfficeTest {
	public static void main(String[] args) {

		List<Student> list_student = new ArrayList<Student>();

		list_student.add(new Student(154, "Kubra ", 2018, new Date(), "CT"));
		list_student.add(new Student(745, "Fuat ", 2017, new Date(), "Economy"));
		list_student.add(new Student(118, "Yaren ", 2015, new Date(), "Nursery"));
		list_student.add(new Student(638, "Emre ", 2020, new Date(), "Engineering"));

		Collections.sort(list_student);

		for (Student s : list_student) {
			System.out.println(s);
		}

	}

}
