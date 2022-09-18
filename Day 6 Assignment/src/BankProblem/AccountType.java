package BankProblem;

public enum AccountType {
	CURRENT, SAVINGS;

	private static double interestRate;

	public static double getInterestRate() {
		return interestRate;
	}

	public static void setInterestRate(AccountType accountType) {
		if (accountType == AccountType.CURRENT)
			interestRate = 0.5;
		else
			interestRate = 6;
	}

}