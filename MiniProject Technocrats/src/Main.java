
public class Main {
	public static void main(String[] args) {
		Customer c = new Customer(1, "A", "101", 57);
		Customer c1 = new Customer(2, "B", "102", 120);
		Customer c2 = new Customer(3, "C", "103", 357);
		Customer c3 = new Customer(3, "C", "103", -3);
		System.out.println(c.calculateTotalBill() + " " + c);
		System.out.println(c1.calculateTotalBill() + " " + c1);
		System.out.println(c2.calculateTotalBill() + " " + c2);
		System.out.println(c3.calculateTotalBill() + " " + c3);
	}
}
