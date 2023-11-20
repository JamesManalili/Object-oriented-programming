package dao;

import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.util.Scanner;

import domain.BlockSection;
import domain.Student;

//to read from input text file and convert it into object
public class BlockSectionDA {

	public BlockSectionDA() throws FileNotFoundException {

		BlockSection blockSection = new BlockSection();
		Scanner blockSectionInfo = new Scanner(
				new FileReader("C:\\Users\\james\\eclipse-workspace\\OOP_Aggregation\\src\\blockSectionInfo.csv"));
		int totalStudent = 0;
		
			// declare rowBlockSection
			String rowBlockSection = new String();
			rowBlockSection = blockSectionInfo.nextLine();

			String[] rowBlockSectionSpecific = new String[3];
			rowBlockSectionSpecific = rowBlockSection.split(",");
			blockSection.setBlockCode(rowBlockSectionSpecific[0]);
			blockSection.setDescription(rowBlockSectionSpecific[1]);
			blockSection.setAdviser(rowBlockSectionSpecific[2]);
			// test if attribute are allocated
			StudentDA studentDA = new StudentDA(blockSection.getBlockCode());
			Scanner studentInfo = new Scanner(new FileReader("C:\\Users\\james\\eclipse-workspace\\OOP_Aggregation\\src\\studentInfo.csv"));
			while (studentInfo.hasNext()) {
				String getBlock = new String();
				getBlock = studentInfo.nextLine();
				String[] blockSect = new String[2];
				blockSect = getBlock.split(",");
				String block = blockSect[0];
				if (blockSection.getBlockCode().equals(block)) {
					totalStudent++;
				}
			}
			blockSection.setStudentList(studentDA.getStudentList());
			blockSection.setTotalStudent(totalStudent);
			System.out.println(blockSection);
			totalStudent = 0;
		
		blockSectionInfo.close();
	}
}
