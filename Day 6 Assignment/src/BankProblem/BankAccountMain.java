/*
 * 7.Create the BankAccount with the following details: 
 * 
 * Attributes: accountId, accountHolderName, AccountType
 * AccountType be enum contains the types SAVINGS and CURRENT. 
 * The enum should also provide the default interest rate for SAVINGS and CURRENT account. 
 * That should be returned from one of the methods from the enum 
 * 
 * Behaviour: BankAccount should have the method, calculateTotalInterest as shown below:
 * calculateTotalInterest(double amount, int years)
 * The main class should create object of BankAccount and provide the accounttype. 
 * It should later invoke the calculateTotalInterest() by providing arguments. 
 * Print the total interest on 	investments. 
 * 
 * 8.Modify the above BankAccount class by connecting it with DepositAmountException. 
 * This exception should be generated if the amount passed in the calculateTotalInterest is not positive. 
*/



package BankProblem;
public class BankAccountMain {
	public static void main(String args[]) {
		
		BankAccount b = new BankAccount(100, "Ram", 10000, AccountType.SAVINGS);
		b.getAccountInfo();
		System.out.println("Interest: " + b.calculateTotalInterest(1000, 5));
		b.getAccountInfo();
		
		System.out.print("\n");
		System.out.println("------------");
		
		BankAccount b1 = new BankAccount(101, "Karan", 10000, AccountType.CURRENT);
		b1.getAccountInfo();
		System.out.println("Interest: " + b1.calculateTotalInterest(1000, 5));
		b1.getAccountInfo();
		
		System.out.print("\n");
		System.out.println("------------");
		
		b1.addBalance(1000);
		b1.getAccountInfo();
		
		System.out.print("\n");
		System.out.println("------------");
		
		b1.calculateTotalInterest(-1000, 5);
		
	}
}