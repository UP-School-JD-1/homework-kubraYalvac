package students;

import java.util.Date;

public class RegistrationOfficeTest {

	public static void main(String[] args) {
		RegistrationOffice registrationOffice = new RegistrationOffice();

		System.out.println("_____GRADUATE STUDENT______");
		Student student1 = new Student(1, "Kubra ", 1999, new Date(), "");

		if (student1 instanceof GraduateStudent) {
			System.out.println("Student 1 GraduateStudent : " + student1.getName());
			GraduateStudent graduateStudent1 = (GraduateStudent) student1;
			System.out.println(graduateStudent1.toString());
		} else
			System.out.println(student1.getName() + "Student 1 isn't GraduateStudent ");

		System.out.println("\n_____MASTER STUDENT_____");

		Student student2 = new GraduateStudent(2, "Yaren ", 62, new Date(), "", "", "");

		if (student2 instanceof MasterStudent) {
			System.out.println("Student 1 GraduateStudent : " + student2.getName());
			MasterStudent masterStudent2 = (MasterStudent) student2;
			System.out.println(masterStudent2.toString());
		} else
			System.out.println(student2.getName() + "Student 2 isn't MasterStudent ");
		System.out.println();

		System.out.println("\n____UNDERGRADUATE STUDENT____");

		Student student3 = new UndergraduateStudent(150, "Fuat", 1999, new Date(), "Economy", "Economy");
		if (student3 instanceof UndergraduateStudent) {
			System.out.println("Student 3 UndergraduateStudent : " + student3.getName());
			UndergraduateStudent undergraduateStudent1 = (UndergraduateStudent) student3;
			System.out.println(undergraduateStudent1.toString());
		}

		System.out.println("\n_____PhD STUDENT_____");

		Student student4 = new PhdStudent(175, "Elif", 1995, new Date(), "Philosophy", "", "", false);

		if (student4 instanceof PhdStudent) {
			System.out.println("Student 4 GraduateStudent : " + student4.getName());
			PhdStudent phdStudent1 = (PhdStudent) student4;
			System.out.println(phdStudent1.toString());
		} else
			System.out.println(student4.getName() + "Student 4 isn't MasterStudent ");
		System.out.println();

		System.out.println("\n_____REGISTRATION OFFICE_____");

		registrationOffice.RegisterStudent(student4);
		student4.equals(student2);
		System.out.println(student1.equals(student2));
		student1.register();
	}

}
