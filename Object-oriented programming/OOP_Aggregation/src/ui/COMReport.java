package ui;

import java.io.FileNotFoundException;

import dao.BlockSectionDA;

public class COMReport {

	public COMReport() throws FileNotFoundException {
		
		BlockSectionDA blockSectionDA = new BlockSectionDA();	
	}
	public static void main(String[] args) throws FileNotFoundException {
		new COMReport();
	}
}
