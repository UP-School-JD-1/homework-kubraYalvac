package studentsAbs;

import java.util.Date;

public class RegistrationOfficeTest {

	public static void main(String[] args) {

		RegistrationOffice registrationOffice = new RegistrationOffice();

		System.out.println("_____GRADUATE STUDENT______");
		Student student1 = new GraduateStudent(1, "Kubra ", 1999, new Date(), "CS", "Elif", "Java");

		if (student1 instanceof GraduateStudent graduateStudent1) {
			System.out.println("Student 1 graduateStudent : " + student1.getName());
			System.out.println(graduateStudent1.toString());
		} else
			System.out.println(student1.getName() + "Student 1 isn't GraduateStudent ");

		System.out.println("\n_____MASTER STUDENT_____");

		Student student2 = new GraduateStudent(2, "Yaren", 1998, new Date(), "CT", "Esra", "Java");

		if (student2 instanceof MasterStudent masterStudent2) {
			System.out.println("Student 2 GraduateStudent : " + student2.getName());
			System.out.println(masterStudent2.toString());
		} else
			System.out.println(student2.getName() + "Student 2 isn't MasterStudent ");
		System.out.println();

		System.out.println("\n____UNDERGRADUATE STUDENT____");

		Student student3 = new UndergraduateStudent(3, "Fuat", 1999, new Date(), "Economy", "Ali");
		if (student3 instanceof UndergraduateStudent undergraduateStudent1) {
			System.out.println("Student 3 UndergraduateStudent : " + student3.getName());
			System.out.println(undergraduateStudent1.toString());
		}

		System.out.println("\n_____PhD STUDENT_____");

		Student student4 = new PhdStudent(4, "Ahmet", 1995, new Date(), "CE", "Sinan", "se", false);

		if (student4 instanceof PhdStudent phdStudent1) {
			System.out.println("Student 4 GraduateStudent : " + student4.getName());
			System.out.println(phdStudent1.toString());
		} else
			System.out.println(student4.getName() + "Student 4 isn't PhD Student ");
		System.out.println();

		System.out.println("\n______VOCATIONAL STUDENT_____");

		Student student5 = new VocationalStudent(100, "Alex", 1995, new Date(), "CE");
		if (student5 instanceof VocationalStudent vocationalStudent1) {
			System.out.println("Student 5 VocationalStudent : " + student5.getName());
			System.out.println(vocationalStudent1.toString());
		}

		System.out.println("\n_____REGISTRATION OFFICE____");

		registrationOffice.RegisterStudent(student2);

	}

}
