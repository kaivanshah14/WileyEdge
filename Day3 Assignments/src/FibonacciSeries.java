
public class FibonacciSeries {
	private long f0, f1, fib;
	private int n;
	
	public void process() {
		for(int i=0; i<=n; i++) {
			fib = f0 + f1;
			f0 = f1;
			f1 = fib;
			System.out.print(fib + " ");
		}
	}
	
	public FibonacciSeries(int n) {
		f0 = 0;
		f1 = 1;
		this.n = n;
	}
	
	public static void main(String args[]) {
		int n = 10;
		FibonacciSeries f = new FibonacciSeries(n);
		f.process();
	}
}

// 2nd Solution
//public class FibonacciSeries {
//	private long f0, f1, fib;
//	
//	public void process() {
//		fib = f0 + f1;
//		f0 = f1;
//		f1 = fib;
//	}
//	
//	public void display() {
//		System.out.print(fib + " ");
//	}
//	
//	public FibonacciSeries() {
//		// TODO Auto-generated constructor stub
//		f0 = 0;
//		f1 = 1;
//	}
//	
//	public static void main(String args[]) {
//		int n = 10;
//		FibonacciSeries f = new FibonacciSeries();
//		for(int i=0; i<=n; i++) {
//			f.process();
//			f.display();
//		}
//	}
//}
