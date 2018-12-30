
public class QA extends Employee {
	String testingType;
	boolean isISTQBCertified;
	
	public QA(int empId, String empName, String empDept, int empSal, int noOfYearsOfExp,String testingType, boolean isISTQBCertified) {
		super(empId, empName, empDept, empSal, noOfYearsOfExp);
/*		
		this.setEmpId(empId);
		this.setEmpName(empName);
		this.empDept = empDept;
		this.empSal = empSal;
		this.noOfYearsOfExp = this.noOfYearsOfExp;
*/		
		this.testingType = testingType;
		this.isISTQBCertified = isISTQBCertified;
	}
	
	public String getTestingType() {
		return testingType;
	}
	public void setTestingType(String testingType) {
		this.testingType = testingType;
	}
	public boolean isISTQBCertified() {
		return isISTQBCertified;
	}
	public void setISTQBCertified(boolean isISTQBCertified) {
		this.isISTQBCertified = isISTQBCertified;
	}
	
	void printDetails() {
		System.out.println("QA's printDetails()");
	}
	
	// How to generate getter & setter methods in Eclipse? Source --> Generate Geter/setter
	
}
