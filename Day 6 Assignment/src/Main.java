/*
 *  1. Write a program to reverse a String
 *  
 *  2.Create custom/user defined exception to validate the email. 
 *  Sample output1: 
 *  Entered email address : mandarmjog@gmail.com
 *  Your email address is valid.
 *  Sample output2:
 *  Entered email address: wiley@g@.com
 *  Your email address is invalid
 *  Sample output3:
 *  Entered email address: .wi@.gmail@1234
 *  Your email address is invalid
 *  
 *  3.
 *  
 *  4.Write a program to count the occurance of the character in the given String. 
 *  
 *  5.Write a program to test if the first and last element of the array are same. The length of the array must be greater than 5. 
*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "WileyEdge";
		StringBuffer str = new StringBuffer(s);
		System.out.println(str.reverse());

		System.out.println("-----------------");

		String email = "mandarmjog@gmail.com";
		String email2 = "wiley@g@.com";
		String email3 = ".wi@.gmail@1234";
		String regex = "^[a-zA-Z0-9_.]+@[a-zA-Z0-9.]+$";
		boolean result = email.matches(regex);
		if (result)
			System.out.println(email + " is a valid email address ");
		else
			System.out.println(email + " is NOT a valid email address ");
		result = email2.matches(regex);
		if (result)
			System.out.println(email2 + " is a valid email address ");
		else
			System.out.println(email2 + " is NOT a valid email address ");
		result = email3.matches(regex);
		if (result)
			System.out.println(email3 + " is a valid email address ");
		else
			System.out.println(email3 + " is NOT a valid email address ");

		System.out.println("-----------------");

		char c = 'e';
		int count = 0;
		s=s.toLowerCase();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==c) count++;
		}
		System.out.println(c + " appears " + count + " times in " + s);

		System.out.println("-----------------");
		
		int[] arr = new int[]{1,2,3,3,2,1};
		if(arr[0]==arr[arr.length-1]) System.out.println("Yes 1st and last element of array are equal");
		else System.out.println("No 1st and last element of array are not equal");
		
		System.out.println("-----------------");
		
		
	}
	

}
