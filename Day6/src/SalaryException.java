
public class SalaryException extends Exception {
	private String message="";
	public SalaryException(int i) {
		checkforSalary(i);
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
	}
	
	private void checkforSalary(int i) {
		if(i<0) message+="i is less than 0";
		else if(i>5000)  message+="i is greater than 5000";
		else message+="i is between 0 and 5000";
	}
	
}
