package RandomAlgorithms;

import java.util.Scanner;

public class StringPermutations {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");
		String input = sc.next();

		permute("", input);

	}

	public static void permute(String soFar, String rest) {

		if (rest.isEmpty()) {
			System.out.println("Permutation:" + soFar);
		} else {
			for (int i = 0; i < rest.length(); i++) {
				String subString = soFar + rest.charAt(i);
				// System.out.println("You are here");
				String remaining = rest.substring(0, i) + rest.substring(i + 1);
				permute(subString, remaining);
			}
		}

	}
}
