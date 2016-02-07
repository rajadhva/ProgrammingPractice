package RandomAlgorithms;

public class StringEdit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(stringEdit("Vaibhav","Vaidhav"));
       System.out.println(stringEdit("Vbhav","Vaidhav"));
 	}

	public static boolean stringEdit(String s1, String s2) {
		int l1 = s1.length();
		int l2 = s2.length();

		if (Math.abs(l1 - l2) > 1)
			return false;
		boolean flag = true;
		int count = 0;
		int templength;
		if (l1 < l2)
			templength = l1;
		else
			templength = l2;

		for (int i = 0; i < templength; i++) {
			if (count > 1) {
				flag = false;
				break;
			}
			if (s1.charAt(i) == s2.charAt(i)) {
				continue;
			} else {
				count++;
			}
		}

		if (flag == true) {
			if(l1!=l2 && count==1)
				flag = false;
			}
	 return flag;	
	}
	}

