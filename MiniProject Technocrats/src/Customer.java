
public class Customer {
	private int customerId;
	private String customerName;
	private String customerAreaCode;
	private int numberofUnitsConsumed;
	private double totalBill;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAreaCode() {
		return customerAreaCode;
	}

	public void setCustomerAreaCode(String customerAreaCode) {
		this.customerAreaCode = customerAreaCode;
	}

	public int getNumberofUnitsConsumed() {
		return numberofUnitsConsumed;
	}

	public void setNumberofUnitsConsumed(int numberofUnitsConsumed) {
		this.numberofUnitsConsumed = numberofUnitsConsumed;
	}

	public double getTotalBill() {
		return totalBill;
	}

	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}

	public Customer(int customerId, String customerName, String customerAreaCode, int numberofUnitsConsumed) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAreaCode = customerAreaCode;
		this.numberofUnitsConsumed = numberofUnitsConsumed;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAreaCode="
				+ customerAreaCode + ", numberofUnitsConsumed=" + numberofUnitsConsumed + ", totalBill=" + totalBill
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	public double calculateTotalBill() {
		try {
			if (this.numberofUnitsConsumed < 0) {
				throw new CustomerException();
			} else if (this.numberofUnitsConsumed >= 0 && this.numberofUnitsConsumed <= 100) {
				totalBill = this.numberofUnitsConsumed * 0.5;
			} else if (100 < this.numberofUnitsConsumed && this.numberofUnitsConsumed <= 150) {
				totalBill = 100 * 0.5 + (this.numberofUnitsConsumed - 100) * 0.75;
			} else {
				totalBill = 100 * 0.5 + 50 * 0.75 + (this.numberofUnitsConsumed - 150) * 1;
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return totalBill;
	}
}
