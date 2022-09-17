package interface1;

import java.util.Date;

public class RegistrationOffice {
//	RegistrationOffice() {
//
//	}

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
			student = new GraduateStudent(no, "Kubra", 2018, new Date(), "Computer Science", "Elif Polat",
					"Java");
			break;
		case 1:
			student = new VocationalStudent(no, "Yaren", 2017, new Date(), "Computer Teacher");
			break;
		case 2:
			student = new UndergraduateStudent(no, "Fuat", 2018, new Date(), "Economy", "Ali Yılmaz");
			break;
		case 3:
			student = new MasterStudent(no, "Ahmet", 2015, new Date(), "Computer Engineering", "İrfan Simsek", "OOP");
			break;
		case 4:
			student = new PhdStudent(no, "Aleyna", 2018, new Date(), "Computer Science", "Nermin Isik", "Hardware", true);
			break;
		}
		return student;
	}

}
