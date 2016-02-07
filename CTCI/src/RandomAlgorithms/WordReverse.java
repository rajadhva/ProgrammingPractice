package RandomAlgorithms;

import java.util.Scanner;

public class WordReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//String s= sc.next();
		wordReverse("Hello World");

	}
	
	public static void wordReverse(String s){
		
		for(String sub:s.split(" ")){
			System.out.print(new StringBuilder(sub).reverse().toString()+ " "); 	
		}
	}

}
