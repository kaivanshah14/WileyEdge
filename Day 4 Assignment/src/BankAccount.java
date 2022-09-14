/*Create a class BankAccount with following details:
Attributes: accountId, accountHolderName, openingBalance, currentBalance, totalBalance.
Methods: depositAmount(double amount), withdrawAmount(double amount), getCurrentBalance(), displayTotalBalance()

Create at least 3 bank accounts using parameterized constructor. Invoke the withdraAmount() and depositAmount() 
method randomly for different accounts. Display the details of the each account after transaction. 
Also show the current cash available in the bank. (Use the totalBalance to know the current cash available in the bank)
IMP: Apply the validations for openingBalance and withDrawAmount
- openingBalance should be positive number
- You should not be able to withdraw the amount more than current balance. 
*/

// Opening balance as defined here is the minimum balance required to be paid while creating a new bank account
// Current balance accounts for current available balance in the account in addition with the opening balance
// Opening balance is assumed to be same for all the account holders
// Total balance is the balance in the bank

public class BankAccount {
	private int accountId;
	private String accountHolderName;
	private double openingBalance;
	private double currentBalance;
	private static double totalBalance;

	AccountType accountType;

	public BankAccount(int accountId, String accountHolderName, double currentBalance, AccountType accountType) {
		super();

		System.out.println("------New Account Created--------\nAccount Information: ");
		System.out.println("Account ID: " + accountId + " | Account Holder Name: " + accountHolderName + " | Account Type: "
				+ accountType + " | " + currentBalance + " was added to the account");

		if (accountType == AccountType.CURRENT)
			openingBalance = 1000;
		if (accountType == AccountType.SAVINGS)
			openingBalance = 500;
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		if (checkforCurrentBalance(currentBalance))
			this.currentBalance = currentBalance + openingBalance;
		else
			currentBalance = 0;

		totalBalance += openingBalance + currentBalance;
		this.accountType = accountType;
	}

	private boolean checkforCurrentBalance(double currentBalance2) {
		if (currentBalance2 < 0) {
			System.out.println(
					"Invalid operation: Current Balance cannot be less than 0, current balance will be calculated as 0");
			return false;
		}
		return true;
	}

	public int getCountId() {
		return accountId;
	}

	public void setCountId(int countId) {
		this.accountId = countId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setCurrentBalance(int currentBalance) {
		this.currentBalance = currentBalance;
	}

	public void depositAmount(double amount) {
		if (amount < 0)
			System.out.println("ERROR: Cannot deposit amount, deposit amount cannot be less than 0");
		else {
			currentBalance += amount;
			totalBalance += amount;
			System.out.println("Amount deposited: " + amount + " Current Balance: " + currentBalance
					+ " | Old balance was: " + (currentBalance - amount));
		}
	}

	public void withdrawAmount(double amount) {
		if (amount > currentBalance)
			System.out.println(
					"ERROR: Cannot withdraw amount, insufficient balance, available balance: " + currentBalance);
		else {
			double temp = currentBalance;
			currentBalance -= amount;
			totalBalance -= amount;
			System.out.println("Amount withdrawn: " + amount + " Current Balance: " + currentBalance
					+ " | Old balance was: " + (temp));
		}

	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public static void displayTotalBalance() {
		System.out.println("Total balance in the bank: " + totalBalance);
	}

	public void getAccountInfo() {
		System.out.println("Account ID: " + accountId + " | Account Name: " + accountHolderName + " | Account Type: "
				+ accountType + " | Current Balance: " + currentBalance);
	}

}