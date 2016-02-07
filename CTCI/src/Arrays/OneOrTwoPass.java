package Arrays;

import java.util.*;

public class OneOrTwoPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);

		String String1 = sc.next();
		String String2 = sc.next();
		
		boolean decider= passcheck(String1,String2);
	
		if(decider==true){
			System.out.println("Check passed");
			}
		else{
			System.out.println("Check failed");
		}
	}
//checking length or if there are more than 1 different charachters
	public static boolean passcheck(String s1, String s2) {
		int s1_length = s1.length();
		int s2_length = s2.length();
		int count = 0;
		boolean flag = false;
		if (Math.abs(s1_length - s2_length) >= 2) {
			return flag;
		} else {
			if (s1_length > s2_length) {
				s2 = s2 + " ";
			} else {
				s1 = s1 + " ";
			}

			for (int i = 0; i < s1_length; i++) {
				if (s1.charAt(i) != s2.charAt(i))
					count += 1;
				if (count > 1)
					return false;
			}
		}
     return true;
	}
}