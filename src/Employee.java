
public class Employee {
	// Data members
	int empId;
	String empName;
	String empDept;
	int empSal;
	int noOfYearsOfExp;

	// Member functions
	void calculateSalary() {
		empSal = noOfYearsOfExp * 200000;
	}

	void printDetails() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empDept);
		System.out.println(noOfYearsOfExp);
		System.out.println(empSal);
	}

	public static void main(String[] args) {
		// Create Object
		Employee e1 = new Employee();

		// How to set values for data members?
		e1.empId = 1;
		e1.empName = "ABC";
		e1.empDept = "QA";
		e1.noOfYearsOfExp = 2;

		// How to call member functions?
		e1.calculateSalary();
		e1.printDetails();
		
	}
	
	@Override
	public String toString() {
		printDetails();
		return super.toString();
	}
}
