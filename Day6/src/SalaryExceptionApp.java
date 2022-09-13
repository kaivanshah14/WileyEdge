public class SalaryExceptionApp {

	public static void main(String[] args) { 
			try {
				calculateSalary(65);
			} catch (SalaryException e) {
				System.out.println(e.getMessage());
			}
			
		}

	private static void calculateSalary(int i) throws SalaryException {
		
		throw new SalaryException(i);
		
	}
}
