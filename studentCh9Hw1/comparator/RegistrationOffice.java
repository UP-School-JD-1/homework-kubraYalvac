package comparator;

import java.util.*;

public class RegistrationOffice {
	RegistrationOffice() {

	}

	void registerStudent(Student student) {

		if (student instanceof GraduateStudent graduateStudent1) {
			System.out.println("GraduateStudent" + graduateStudent1.toString());
		} else if (student instanceof VocationalStudent vocationalStudent1) {
			System.out.println("VocationalStudent" + vocationalStudent1.toString());
		} else if (student instanceof UndergraduateStudent undergraduateStudent1) {
			System.out.println("UndergraduateStudent" + undergraduateStudent1.toString());
		} else if (student instanceof MasterStudent masterStudent1) {
			System.out.println("MasterStudent" + masterStudent1.toString());
		} else if (student instanceof PhdStudent phdStudent1) {
			System.out.println("PhdStudent" + phdStudent1.toString());
		} else
			student.study();
	}

	Student getAStudent() {
		Student student = null;

		int i = (int) (5 * Math.random());
		int no = new java.util.Random().nextInt(10);

		switch (i) {
		case 0:
			student = new GraduateStudent(no, "Kubra", 2018, new Date(), "CEIT", "Irfan", "SW");
			break;
		case 1:
			student = new VocationalStudent(no, "Fuat", 2017, new Date(), "Economy");
			break;
		case 2:
			student = new UndergraduateStudent(no, "Yaren", 2015, new Date(), "Nursery", "");
			break;
		case 3:
			student = new MasterStudent(no, "Emre", 2020, new Date(), "Engineering", "Burak", "Industrial");
			break;

		}
		return student;
	}

	public List<AbstractStudent> getAllStudent() {
		List<AbstractStudent> list_student = new ArrayList<AbstractStudent>();

		list_student.add(new GraduateStudent(154, "Kubra", 2018, new Date(), "CEIT", "Irfan", "SW"));
		list_student.add(new VocationalStudent(745, "Fuat", 2016, new Date(), "Economyst"));
		list_student.add(new MasterStudent(118, "Yaren", 2015, new Date(), "Faculty of Healt", "Gozde", "Nurse"));

		list_student
				.add(new GraduateStudent(638, "Emre", 2020, new Date(), "Faculty of Engineering", "Software", "Java"));
		return list_student;

	}
}
