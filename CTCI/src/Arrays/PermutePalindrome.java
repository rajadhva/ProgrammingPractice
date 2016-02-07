package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class PermutePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);

		String String1 = sc.next();

		permutation("", String1);

		//if (indicator == true) {
			//System.out.println("Permutation consists of a palindrome");
		//} else {
			//System.out.println("Permutation doesn't consist of a palindrome");
		//}

	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0) {
			String String2 = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				String2 = String2 + str.charAt(i);
			}

			if (str.equals(String2)) {
				System.out.println("Permutation consists of a palindrome");
			    return;
			}
		} else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1));
		}
		
	}

}