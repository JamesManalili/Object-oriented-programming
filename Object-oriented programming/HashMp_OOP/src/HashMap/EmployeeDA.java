package HashMap;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeDA {

	private HashMap<String, Employee> empMap;

	public HashMap<String, Employee> getEmpMap() {
		return empMap;
	}

	public void setEmpMap(HashMap<String, Employee> empMap) {
		this.empMap = empMap;
	}

	public EmployeeDA(String empNo) {
		DecimalFormat df = new DecimalFormat("###,###.00");
		try {
			Scanner depempInput = new Scanner(
					new FileReader("C:\\Users\\james\\eclipse-workspace\\W12_13\\src\\depEmp.csv"));
			empMap = new HashMap<String, Employee>();
			depempInput.nextLine();
			int key = 0;

			while (depempInput.hasNext()) {
				String depemplineData = new String();
				depemplineData = depempInput.nextLine();
				String[] depempsplitData = new String[3];
				depempsplitData = depemplineData.split(",");
				if (empNo.equals(depempsplitData[0])) {
					Employee emp = new Employee();
					emp.setSalary(Double.parseDouble(depempsplitData[2]));
					emp.setEmpNo(depempsplitData[1]);

					Scanner empInput = new Scanner(
							new FileReader("C:\\Users\\james\\eclipse-workspace\\W12_13\\src\\emp.csv"));

					while (empInput.hasNext()) {
						String emplineData = new String();
						emplineData = empInput.nextLine();
						String[] empSplitData = new String[3];
						empSplitData = emplineData.split(",");
						if (emp.getEmpNo().equals(empSplitData[0])) {
							emp.setLastName(empSplitData[1]);
							emp.setFirsName(empSplitData[2]);
							empMap.put(empNo + key, emp);
							key++;
						}
					} //
				}
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
}
