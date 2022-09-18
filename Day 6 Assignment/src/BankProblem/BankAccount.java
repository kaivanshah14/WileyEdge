package BankProblem;
public class BankAccount {
	private int accountId;
	private String accountHolderName;
	private double balance;
	AccountType accountType;
	private double interest;
	
	public BankAccount(int accountId, String accountHolderName, double balance, AccountType accountType) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
	}


	public void addBalance(double balance) {
		this.balance+=balance;
		System.out.print(balance + " added to Account " + this.accountId + " | ");
		getAccountInfo();
	}
	
	public double calculateTotalInterest(double amount, int years) {
		AccountType.setInterestRate(accountType);
		try {
			if(amount < 0) throw new InvalidAmountException();
			else {
				interest = (balance * AccountType.getInterestRate() * years)/100;
				balance+=interest;
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return interest;
	}
	
	public void getAccountInfo() {
		System.out.println("Account ID: " + accountId + " | Account Name: " + accountHolderName + " | Account Type: "
				+ accountType + " | Current Balance: " + balance);
	}

}