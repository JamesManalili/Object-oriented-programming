package dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domain.BlockSection;
import domain.Course;
import domain.Student;

public class StudentDA {

	private List<Student> studentList = new ArrayList<Student>();

	public StudentDA(String BlockSec) throws FileNotFoundException {
		Scanner studentInfo = new Scanner(
				new FileReader("C:\\Users\\james\\eclipse-workspace\\OOP_Aggregation\\src\\studentInfo.csv"));
		int total = 0;
		int totalStudent = 0;
		while (studentInfo.hasNext()) {
			// read the student block
			String rowStudent = new String();
			rowStudent = studentInfo.nextLine();
			// declare an array that will split the student
			String[] rowStudentSpecific = new String[4];
			rowStudentSpecific = rowStudent.split(",");
			if (BlockSec.equals(rowStudentSpecific[0])) {
				Student student = new Student();
				student.setStudentNumber(rowStudentSpecific[1].trim());
				student.setName(rowStudentSpecific[2]);
				student.setProgram(rowStudentSpecific[3]);

				CourseDA courseDA = new CourseDA(student.getStudentNumber());
				student.setCourseList(courseDA.getCourseList());
				studentList.add(student);
				Scanner scheduleInfo = new Scanner(
						new FileReader("C:\\Users\\james\\eclipse-workspace\\OOP_Aggregation\\src\\scheduleInfo.csv"));
				while (scheduleInfo.hasNext()) {
					// read the entire course row
					String rowCourse = new String();
					rowCourse = scheduleInfo.nextLine();

					// split the content of rowCourse
					String[] rowCourseSpecific = new String[6];
					rowCourseSpecific = rowCourse.split(",");
					if (student.getStudentNumber().equals(rowCourseSpecific[0])) {
						total = total + Integer.parseInt(rowCourseSpecific[3].trim());
						student.setTotalUnitsEnrolled(total);
					}

				}
				total = 0;
			}
		}
		studentInfo.close();
	}

	public List<Student> getStudentList() {
		return studentList;
	}
}
