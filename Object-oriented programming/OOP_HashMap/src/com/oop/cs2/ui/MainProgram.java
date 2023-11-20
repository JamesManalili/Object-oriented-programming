package com.oop.cs2.ui;

import java.util.ArrayList;
import java.util.List;
import com.oop.cs2.domain.Adviser;
import com.oop.cs2.domain.BlockSection;
import com.oop.cs2.domain.Student;

public class MainProgram {
		public static void main(String[] args) {
			BlockSection blockSection = new BlockSection();
			Student student1 = new Student();
			Student student2 = new Student();
			Student student3 = new Student();
			Adviser adviser = new Adviser();
			
			//put data for each student
			student1.setStudentNo("123");
			student1.setLastName("Dela Cruz");
			student1.setFirstName("Juan");
			
			student2.setStudentNo("456");
			student2.setLastName("Santos");
			student2.setFirstName("Maria");
			
			student3.setStudentNo("678");
			student3.setLastName("Hernandez");
			student3.setFirstName("Christopher");
			
			//put data for adviser
			adviser.setEmpNo(754);
			adviser.setLastName("Ezperanza");
			adviser.setFirstName("Jerry");
			
			//put data to Block
			blockSection.setBlockSectionCode("2BSCS-2");
			blockSection.setAdviser(adviser);
			
			//put data to List of Student
			
			List<Student>studentList = new ArrayList<Student>();
			studentList.add(student1);
			studentList.add(student2);
			studentList.add(student3);
			blockSection.setStudentList(studentList);
			System.out.println(blockSection);
			
			//Print print
			/*
			System.out.println("Adviser: "+blockSection.getAdviser().getLastName() +", "+ blockSection.getAdviser().getFirstName());
			System.out.println("Block Section Code: "+blockSection.getBlockSectionCode());
			System.out.println("\nList of Students: ");
			for(Student student:blockSection.getStudentList()) {
				System.out.println("Student No: "+student.getStudentNo());
				System.out.println("Name: "+student.getLastName()+", "+student.getFirstName());
				System.out.println();
			}
			*/
			
		}
}
