import java.util.Scanner;

public class Bank {
	String acctName;
	private int balance;
	static int rateOfInterest;
	
	public void printRateOfInterest() {
		System.out.println(rateOfInterest);
	}
	
	public void setBalance(int b) {
		
		// Authentication
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username: ");
		String uname = scanner.nextLine();
		System.out.println("Enter password: ");
		String pwd = scanner.nextLine();
		
		if (pwd.equals("test@123")) {
			balance = b;
		} else {
			System.out.println("Ghari ja");
		}
	}
}
