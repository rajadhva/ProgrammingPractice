package Arrays;

import java.util.Scanner;

public class StringRotate {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);

		String String1 = sc.next();
		String String2 = sc.next();
		boolean decider = rotationcheck(String1, String2);
		
		if(decider==true){
			System.out.println("Is a rotation");
			}
		else{
			System.out.println("Is not a rotation");
		}
	}

	public static boolean rotationcheck(String s1, String s2) {
	if(s1==null || s2==null) //if any string is null
		return false;
	if(s1.length()!=s2.length()) //if lengths are not equal
		return false;
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	if(isSubstring(s1+s1,s2))
		return true;
	else
		return false;
	
	}
	
//if it's a rotation it will be contained if we take that string twice.	
	public static boolean isSubstring(String s1,String s2)
	{
		if(s1.indexOf(s2)!=-1)
			return true;
		else
			return false;
	}
}
