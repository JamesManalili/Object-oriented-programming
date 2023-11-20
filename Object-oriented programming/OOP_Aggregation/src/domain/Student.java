package domain;
import java.util.List;
public class Student {

	private String studentNumber;
	private String name;
	private String program;
	private List<Course> courseList;
	private int totalUnitsEnrolled;

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public int getTotalUnitsEnrolled() {
		return totalUnitsEnrolled;
	}

	public void setTotalUnitsEnrolled(int totalUnitsEnrolled) {
		this.totalUnitsEnrolled = totalUnitsEnrolled;
	}

	public String toString() {

		String studentOutput = new String();
			studentOutput += "Student number: " + studentNumber + "\n" + "Student Name: " + name + "\n" + "Program: "
					+ program + "\n" + "Total Units Enrolled: " + totalUnitsEnrolled + "\n";
			// header for courseList
			studentOutput += "\nSchedule\n" + "Course code\t" + "Description\t\t" + "Unit\t" + "Day\t" + "Time\n";
			for (Course course : courseList) {
				studentOutput += course;
			}
			studentOutput += "\n";
		
		return studentOutput;

	}

}
