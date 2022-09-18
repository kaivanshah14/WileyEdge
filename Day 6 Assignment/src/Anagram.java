//  6. Write a program if the two given strings are anagram or not. 

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "Race";
		String s2 = "Care";

		String str1 = s1.toLowerCase();
		String str2 = s2.toLowerCase();

		if (str1.length() == str2.length()) {

			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			boolean result = Arrays.equals(charArray1, charArray2);

			if (result)
				System.out.println(s1 + " and " + s2 + " are anagram.");
			else
				System.out.println(s1 + " and " + s2 + " are not anagram.");

		} else
			System.out.println(s1 + " and " + s2 + " are not anagram.");

	}
}
