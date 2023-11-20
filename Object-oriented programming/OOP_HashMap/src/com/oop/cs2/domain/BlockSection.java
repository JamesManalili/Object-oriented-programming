package com.oop.cs2.domain;

import java.util.List;

public class BlockSection {
	private String blockSectionCode;
	private Adviser adviser;
	private List<Student>studentList;
	
	public String getBlockSectionCode() {
		return blockSectionCode;
	}
	public void setBlockSectionCode(String blockSectionCode) {
		this.blockSectionCode = blockSectionCode;
	}
	public Adviser getAdviser() {
		return adviser;
	}
	public void setAdviser(Adviser adviser) {
		this.adviser = adviser;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	@Override 
	public String toString() {
		String output = new String();
		output += "Block section: "+ blockSectionCode +"\n";
		output += "Adviser: "+adviser.getLastName().toUpperCase() +", "+adviser.getFirstName()+"\n";
		output += "\nList of Students:\n";
		
		
		for(Student student:getStudentList()) {
			output += "Student No: "+ student.getStudentNo()+"\n";
			output += "Name: "+student.getLastName().toUpperCase()+", "+ student.getFirstName()+"\n\n";
		}
		return output;
	}
	
	
}
