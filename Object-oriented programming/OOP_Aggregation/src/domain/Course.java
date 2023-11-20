package domain;

public class Course {
	private String courseCode;
	private String description;
	private int unit;
	private String time;
	private String day;
	
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUnit() {
		return unit;
	}
	public void setUnit(int unit) {
		this.unit = unit;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public String toString() {
		String courseOutput = new String();
		
		courseOutput += courseCode + "\t" + description +"\t"+
						unit + "\t"+ day +"\t" + time + "\n";
		return courseOutput;
	}



}
