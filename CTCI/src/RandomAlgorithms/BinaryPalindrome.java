package RandomAlgorithms;

public class BinaryPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int x=0b1001;
        System.out.println(x);
        checkPalindrome(x);
	}

	public static void checkPalindrome(int x){
		char binary[]=Integer.toString(x).toCharArray();
        int length=binary.length;
        boolean flag =true;
        for(int i=0,j=binary.length-1;i<j;i++,j--){
        	if(binary[i]!=binary[j])
        		flag=false;
        	    break;
        }
        if (flag==true)
        	System.out.println("Is a palindrome");
        else
        	System.out.println("Isn't a palindrome");
	}
}
