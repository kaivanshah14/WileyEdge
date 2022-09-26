
public class StringBufferBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Hello");
		sb.append(" Java");
		System.out.println(sb);
		
		StringBuffer sbf=new StringBuffer("Hi");
		sbf.append(" World");
		System.out.println(sbf);
		
		 long startTime = System.currentTimeMillis();  
	     StringBuffer sb1 = new StringBuffer("Java");  
	     for (int i=0; i<10000000; i++){  
	            sb1.append("Tpoint");  
	        }
	     System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
	     startTime=System.currentTimeMillis();
	     StringBuilder sb2=new StringBuilder("Java");
	     for(int i=0;i<10000000;i++) {
	    	 sb2.append("Tpoint");
	     }
	     System.out.println("Time taken by StringBuilder: "+ (System.currentTimeMillis() -startTime)+"ms");
	     
	}
}


//	OUTPUT:
// Hello Java
// Hi World
// Time taken by StringBuffer: 275ms
// Time taken by StringBuilder: 189ms