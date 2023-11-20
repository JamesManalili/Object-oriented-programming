package domain;
import java.util.List;

public class BlockSection {
	private String blockCode;
	private String description;
	private String adviser;
	private List<Student> studentList;
	private int totalStudent;
	
	public int getTotalStudent() {
		return totalStudent;
	}

	public void setTotalStudent(int totalStudent) {
		this.totalStudent = totalStudent;
	}

	public String getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(String blockCode) {
		this.blockCode = blockCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAdviser() {
		return adviser;
	}

	public void setAdviser(String adviser) {
		this.adviser = adviser;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public String toString() {
		String result = new String();
		result += "Block Section: " + blockCode + "\n" + 
				  "Description: " + description + "\n"
				+ "Class Adviser: " + adviser + "\n\n"+"Total Student: "+totalStudent + "\n\n";
		for (Student student : studentList) {
			result += student;
		}
		return result;
	}

}
