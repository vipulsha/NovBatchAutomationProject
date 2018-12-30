
public class Employee {
	// Data members
	private int empId;
	private String empName;
	String empDept;
	int empSal;
	int noOfYearsOfExp;
	
	public Employee() {
	
	}

	public Employee(int empId, String empName, String empDept, int empSal, int noOfYearsOfExp) {
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empSal = empSal;
		this.noOfYearsOfExp = noOfYearsOfExp;
	}

	// Getter methods
	int getEmpId() {
		return empId;
	}
	
	String getEmpName() {
		return empName;
	}
	
	// Setter methods
	void setEmpId(int id) {
		empId = id;
	}

	void setEmpName(String name) {
		empName = name;
	}
	
	void setEmpDept(String empDept) {
		empDept = empDept;
	}
	
	// Member functions
	void calculateSalary() {
		empSal = noOfYearsOfExp * 200000;
	}

	void printDetails() {
		System.out.println("Employee's printDetails()");
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empDept);
		System.out.println(noOfYearsOfExp);
		System.out.println(empSal);
	}

	public static void main(String[] args) {
		// Create Object
/*		Employee e1 = new Employee();

		// How to set values for data members?
		e1.empId = 1; // Setting the values
//		e1.empName = "ABC";
		e1.setEmpName("ABC");
		e1.empDept = "QA";
		e1.noOfYearsOfExp = 2;

		System.out.println(e1.getEmpId()); // Getting the value
		
		// How to call member functions?
		e1.calculateSalary();
		e1.printDetails();
*/		
	}
	
	@Override
	public String toString() {
		printDetails();
		return super.toString();
	}
}
