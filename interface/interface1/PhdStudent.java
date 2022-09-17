package interface1;

import java.util.Date;

public class PhdStudent extends GraduateStudent {

	boolean qualifyingExamTaken;

	PhdStudent(int no, String name, int year, Date dob, String major, String advisor, String thesis,
			boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, advisor, thesis);
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	public boolean isQualifyingExamTaken() {
		return qualifyingExamTaken;
	}

	public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

//	@Override
//	public String toString() {
//		return "PhdStudent [qualifyingExamTaken=" + qualifyingExamTaken + "]";
//	}

	@Override
	public void study() {
		System.out.println("PhD Student is studying.");
	}

	@Override
	public void register() {
		System.out.println("PhD Student is registering.");
	}

	@Override
	public void writeThesis() {
		System.out.println("PhD Student is write thesis.");
	}

	@Override
	public void meetWithAdvisor() {
		System.out.println("PhD Student is meet advisor.");
	}

	public void writePaper() {
		System.out.println("PhD Student is write paper.");
	}

}
