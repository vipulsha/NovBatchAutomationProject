import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass2 {

	public void getAcctNo() {
		System.out.println("Enter your acctno: ");
		try {
			int acctNo = new Scanner(System.in).nextInt();
		} catch (InputMismatchException e) {
			System.out.println("You entered value in incorrect format :)");
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		
//		new MainClass2().getAcctNo();
		
//		Bank bank = new Bank();
//		bank.setBalance(1000);

//		QA q = new QA(testingType, isISTQBCertified)
		
	}
}
