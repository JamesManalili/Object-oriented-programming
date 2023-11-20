package dao;

import java.io.FileNotFoundException ;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import domain.Course;
import domain.Student;

public class CourseDA {
	private ArrayList<Course> courseList = new ArrayList<Course>();

	public CourseDA(String studentNumber) throws FileNotFoundException {
		Scanner scheduleInfo = new Scanner(
				new FileReader("C:\\Users\\james\\eclipse-workspace\\OOP_Aggregation\\src\\scheduleInfo.csv"));
		while (scheduleInfo.hasNext()) {
			// read the entire course row
			String rowCourse = new String();
			int total = 0;
			rowCourse = scheduleInfo.nextLine();

			// split the content of rowCourse
			String[] rowCourseSpecific = new String[6];
			rowCourseSpecific = rowCourse.split(",");
			if (studentNumber.equals(rowCourseSpecific[0])) {
				Course course = new Course();
				course.setCourseCode(rowCourseSpecific[1]);
				course.setDescription(rowCourseSpecific[2]);
				course.setUnit(Integer.parseInt(rowCourseSpecific[3].trim()));
				course.setDay(rowCourseSpecific[4]);
				course.setTime(rowCourseSpecific[5]);
				courseList.add(course);
			}
			
		}
		scheduleInfo.close();
	}

	public ArrayList<Course> getCourseList() {
		return courseList;
	}
}
