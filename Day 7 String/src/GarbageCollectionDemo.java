
public class GarbageCollectionDemo {
	public static void main(String[] args) {
		GarbageCollectionDemo s1= new GarbageCollectionDemo();
		GarbageCollectionDemo s2= new GarbageCollectionDemo();
		s1=null;
		s2=null;
		System.out.println("s1: " +  s1 +  " s2: " +  s2);
		String s4="java";
		System.out.println("s4 before calling System.gc() -> " + s4);
		System.gc();
		System.out.println("s4 after calling System.gc() -> " + s4);
		
		System.gc();
		
		System.out.println("s4 after calling System.gc() twice -> " + s4);
		display("s4: " + s4);
	}
	public static void display(String s5) {
//		String s3="something";
//		s3=null;
		s5=null;
		
		System.out.println("s4 inside display() method after assigning it to null -> " + s5);
		
		System.gc();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("***Object is garbage Collected***");
	}
	
}