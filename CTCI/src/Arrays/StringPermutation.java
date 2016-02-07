package Arrays;

import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class StringPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string1");
		String string1 = sc.next();

		System.out.println("Enter a string2");
		String string2 = sc.next();

		boolean flag = stringpermute(string1, string2);

		if (flag == true) {
			System.out.println("Strings permute");
		} else {
			System.out.println("Strings don't permute");
		}
	}

	public static boolean stringpermute(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;

		Hashtable st = new Hashtable<>();

		for (int i = 0; i < s1.length(); i++) {
			char c1 = s1.charAt(i);
			if (st.containsKey(c1)) {
				int val1 = (int) st.get(c1) + 1;
				st.put(c1, val1);
			} else {
				st.put(c1, 1);
			}
		}
		for (int j = 0; j < s2.length(); j++) {
			char c2 = s2.charAt(j);
			if (st.containsKey(c2)) {
				int val2 = (int) st.get(c2);
				if (val2 == 0) {
					return false;
				}
				val2--;
				st.put(c2, val2);
			} else {
				return false;
			}
		}

		Set<Character> key = st.keySet();
		for (Character k : key) {
			if ((int) st.get(k) != 0) {
				return false;
			}

		}
		return true;
	}

}
