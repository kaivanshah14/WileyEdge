package BankProblem;

public class InvalidAmountException extends Exception {

	public InvalidAmountException() {
		super();
	}

	@Override
	public String getMessage() {
		return "Amount cannot be less than 0";
	}
}
