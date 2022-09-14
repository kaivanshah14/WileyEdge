public class Main {
	public static void main(String args[]) {
		BankAccount b1 = new BankAccount(101, "Ram", 100);
		b1.getAccountInfo();
		System.out.print("\n");

		BankAccount b2 = new BankAccount(102, "Akash", 6000);
		b2.depositAmount(1000);
		b2.getAccountInfo();

		System.out.print("\n");
		System.out.println("------------");
		BankAccount.displayTotalBalance();
		System.out.println("------------");
		System.out.print("\n");

		BankAccount b3 = new BankAccount(103, "Vivek", 9000);
		b3.withdrawAmount(9000);
		b3.getAccountInfo();

		System.out.print("\n");
		System.out.println("------------");
		BankAccount.displayTotalBalance();
		System.out.println("------------");
		System.out.print("\n");

		BankAccount b4 = new BankAccount(104, "Sid", 23456);
		b4.depositAmount(-95);
		b4.depositAmount(2345.45);
		b4.getAccountInfo();

		System.out.print("\n");
		b4.withdrawAmount(75851.7);
		b4.getAccountInfo();

		System.out.print("\n");
		System.out.println("------------");
		BankAccount.displayTotalBalance();
		System.out.println("------------");
	}
}