package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCompress {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);

		String String1 = sc.next();
		String compressed = stringCompress(String1);
		
		System.out.println("The final String is " + compressed);
	}

	public static String stringCompress(String s1) {
		if (s1 == null)
			return "";

		s1 = s1.toLowerCase();
		StringBuilder random = new StringBuilder();
		char temp;
		int count = 1;
		for (int i = 1; i < s1.length(); i++) {
           //if charachters are equal and charachter not last one
			if (i < s1.length() - 1 && s1.charAt(i - 1) == s1.charAt(i)) {
				count++;
			} 
			//if last character equal to its previous ones.
			else if (i == s1.length() - 1 && s1.charAt(i - 1) == s1.charAt(i)) {
				count++;
				random.append(s1.charAt(i));
				random.append(count);
			} 
			//if last character not equal to its previous ones.
			else if (i == s1.length() - 1 && s1.charAt(i - 1) != s1.charAt(i)) {
				random.append(s1.charAt(i - 1));
				random.append(count);
				count++;
				random.append(s1.charAt(i));
				random.append(count);
			}
		//if not equal
			else {
				random.append(s1.charAt(i - 1));
				random.append(count);
				count=1;
			}
		}

		String compressed_string=random.toString();
		
		if(compressed_string.length()<s1.length())
			return compressed_string;
		else
			return s1;
		
	}
}
