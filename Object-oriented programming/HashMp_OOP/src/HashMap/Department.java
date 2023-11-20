package HashMap;

import java.util.HashMap;


public class Department {
	
	private String depCode;
	private String depName;
	private double depTotalSalary;
	private HashMap<String, Employee> mpMap;
	

	public HashMap<String, Employee> getMpMap() {
		return mpMap;
	}
	public void setMpMap(HashMap<String, Employee> mpMap) {
		this.mpMap = mpMap;
	}
	
	public String getDepCode() {
		return depCode;
	}
	public void setDepCode(String depCode) {
		this.depCode = depCode;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public double getDepTotalSalary() {
		return depTotalSalary;
	}
	public void setDepTotalSalary(double depTotalSalary) {
		this.depTotalSalary = depTotalSalary;
	}
	
	
	
}
