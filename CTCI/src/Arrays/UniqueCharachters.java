package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueCharachters {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");
		String input = sc.next();
		if (uniquevalidator(input) == true) {
			System.out.println("The string has all unique charachters");
		} else {
			System.out.println("The string doesn't have all unique charachters");
		}

	}

	public static boolean uniquevalidator(String input) {
		if (input.length() > 26)
			return false;

		HashSet<Character> characters = new HashSet();
		boolean flag = false;

		for (int i = 0; i <input.length(); i++) {
			flag = characters.add(input.charAt(i));
			if (flag == false)
				return false;
		}
		return true;
	}

}
