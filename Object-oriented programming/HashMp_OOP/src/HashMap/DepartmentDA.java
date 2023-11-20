package HashMap;

import java.io.FileNotFoundException; 
import java.io.FileReader;
import java.util.*;
import java.text.DecimalFormat;

public class DepartmentDA {

	public DepartmentDA() {
		DecimalFormat df = new DecimalFormat("###,###.00");
		try {
			Scanner depInput = new Scanner(new FileReader("C:\\Users\\james\\eclipse-workspace\\W12_13\\src\\dep.csv"));
			depInput.nextLine();
			while (depInput.hasNext()) {
				String depLineData = new String();
				depLineData = depInput.nextLine();
				String[] depSplitData = new String[3];
				depSplitData = depLineData.split(",");
				String[] depEmpSplitData = new String[3];
				Department dep = new Department();
				dep.setDepCode(depSplitData[0]);
				dep.setDepName(depSplitData[1]);

				System.out.println("Department code: " + dep.getDepCode());
				System.out.println("Department name: " + dep.getDepName());

				Scanner depEmp = new Scanner(
						new FileReader("C:\\Users\\james\\eclipse-workspace\\W12_13\\src\\depEmp.csv"));
				depEmp.nextLine();
				Double salary = 0.0;
				while (depEmp.hasNext()) {
					String depEmpLineData = new String();
					depEmpLineData = depEmp.nextLine();
					depEmpSplitData = depEmpLineData.split(",");

					if (dep.getDepCode().equals(depEmpSplitData[0])) {
						EmployeeDA empDA = new EmployeeDA(dep.getDepCode());
						dep.setMpMap(empDA.getEmpMap());
						
					}
				}
				for (Map.Entry<String, Employee> entryMap : dep.getMpMap().entrySet()) {
                    salary += entryMap.getValue().getSalary();
                }	
				dep.setDepTotalSalary(salary);
				System.out.println("Department Total Salary: " + df.format(dep.getDepTotalSalary()));
				System.out.println("---------------------Details -------------------------");
				System.out.println("EmpNo\t\tEmployee Name\t\tSalary");

				for (Map.Entry<String, Employee> empMap : dep.getMpMap().entrySet()) {
					System.out.print(empMap.getValue().getEmpNo() + "\t\t");
					System.out.print(empMap.getValue().getLastName() + ", " + empMap.getValue().getFirsName() + "\t");
					System.out.print(empMap.getValue().getSalary() + "\n");
				}
				System.out.println();

			}

		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

	}
}
