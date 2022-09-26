
public class Practice {
	public static void main(String[] args) {
		
		String a="ABC";
		String b=new String("ABC");
		String c=new String("ABC");
		String d="ABC";
		System.out.println("-------------Before-------------");
		System.out.println("a: " + a + " " + a.hashCode());
		System.out.println("b: " + b + " " + b.hashCode());
		System.out.println("c: " + c+" "+c.hashCode());
		System.out.println("d: " + d+" "+d.hashCode());
		
		if(a == b)
			System.out.println("a == b -> true");
		else System.out.println("a == b -> false");
		
		if(a == c)
			System.out.println("a == c -> true");
		else 
			System.out.println("a == c -> false");
		
		if(c == d)
			System.out.println("c == d -> true");
		else 
			System.out.println("c == d -> false");
		
		a=a+"ac";
		b=b+"c";
		c=c+"d";
		
		System.out.println("-------------After-------------");
		System.out.println("a: " + a + " " + a.hashCode());
		System.out.println("b: " + b + " " + b.hashCode());
		System.out.println("c: " + c+" "+c.hashCode());
		System.out.println("d: " + d+" "+d.hashCode());
		
		System.out.println("---------------------------");
		
		String s1="ab";
		String s2="ab";
		System.out.println("s1: " + s1 + " " + s1.hashCode());
		System.out.println("s2: " + s2 + " " + s2.hashCode());
		
		if(s1==s2)
			System.out.println("s1 == s2 -> true");
		else
			System.out.println("s1 == s2 -> false");
		
		System.out.print("Changing s2: ");
		s2=s2.charAt(0)+"B";
		System.out.println("s2 = " + s2 + " " + s2.hashCode());
		
		if(s1.equals(s2))
			System.out.println("s1.equals(s2) -> true");
		else
			System.out.println("s1.equals(s2) -> false");
		
		
		System.out.println("--------------------------");
		
		StringBuffer sb =new StringBuffer("abc");
		System.out.println("sb: " + sb + " " + sb.hashCode());
		sb.toString();
		
		StringBuilder sr=new StringBuilder("abc");
		System.out.println("sr: " + sr + " " + sr.hashCode());
		
		String loc=new String("Jamshedpur");
		String loc2=loc;
		if(loc==loc2)
			System.out.println("Yes loc and loc2 are equal");
		else
			System.out.println("No loc and loc2 are not equal");
		
		
		System.out.println();
		
		String str1="Hello";
		String str2="Hello";
		String str3=str1;
		
		System.out.println("str1: " + str1 + " " + str1.hashCode());
		System.out.println("str2: " + str2 + " " + str2.hashCode());
		System.out.println("str3: " + str3 + " " + str3.hashCode());
		
		System.out.println();
		System.out.print("Modifying str1 -> ");
		str1=str1+" Buddy";
		
		System.out.println("str1: " + str1 + " " + str1.hashCode());
		System.out.println("str2: " + str2 + " " + str2.hashCode());
		System.out.println("str3: " + str3 + " " + str3.hashCode());
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}