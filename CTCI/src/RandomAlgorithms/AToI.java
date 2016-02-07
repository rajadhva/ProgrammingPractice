package RandomAlgorithms;

public class AToI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(aToI("-6543"));
	}

	public static int aToI(String s) {

		if (s == null)
			return 0;
		int length = s.length();

		int i = 0;

		char flag = '+';
		if (s.charAt(0) == '-') {
			flag = '-';
			i++;
		} else if (s.charAt(0) == '+') {
			i++;
		}
		int result = 0;
		while (length > i && (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
			result = result * 10 + (s.charAt(i) - '0');
		System.out.println("You are here");
		i++;
		}

		if (flag == '-')
			result = -result;

		return result;
	}
}