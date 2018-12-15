
public class MainClass {

	public static void main(String[] args) {
		Bank o1 = new Bank();
		Bank.rateOfInterest = 10;
		
		o1.rateOfInterest = 11;
		
		Bank o2 = new Bank();
//		o2.rateOfInterest = 10;
		
		Bank o3 = new Bank();
//		o3.rateOfInterest = 10;
		
		o1.printRateOfInterest();
		o2.printRateOfInterest();
		o3.printRateOfInterest();
		
		Bank.rateOfInterest = 11;
		System.out.println("=====================");
		o1.printRateOfInterest();
		o2.printRateOfInterest();
		o3.printRateOfInterest();
	}
}
