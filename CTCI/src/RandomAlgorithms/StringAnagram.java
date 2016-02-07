package RandomAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String String1="lavahd";
		String String2="Rohiti";
		System.out.println(checkAnagram(String1,String2));

	}

	public static boolean checkAnagram(String s1,String s2)
	{
		int length1=s1.length();
		int length2=s2.length();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();		
		if(length1!=length2)
			return false;
		
		HashMap<Character,Integer> hs =new HashMap<Character,Integer>();
		
		for(int i=0;i<length1;i++){
			if(hs.containsKey(s1.charAt(i))){
				hs.put(s1.charAt(i), hs.get(s1.charAt(i))+1);
			}
			else{
				hs.put(s1.charAt(i),1);
			}
		}
		for(HashMap.Entry<Character,Integer> it:hs.entrySet()){
			System.out.println("Key is:" + it.getKey() + "Value is:" + it.getValue());
		}
		
		boolean flag=true;
		for(int j=0;j<s2.length();j++){
			if(!hs.containsKey(s2.charAt(j))){
				flag=false;
				System.out.println("Here 1");
				break;
			}
			else{
				hs.put(s2.charAt(j), hs.get(s2.charAt(j))-1);
				System.out.println(hs.get(s2.charAt(j)));
				if(hs.get(s2.charAt(j))<0){
			    flag=false;
				System.out.println("Here 2");	
				break;
				}
			}
		}
		
		if(flag!=false){
		for(HashMap.Entry<Character,Integer> it:hs.entrySet()){
			
			if(it.getValue()!=0){
				flag=false;
			 System.out.println("Here3");
				break;			
			}
		}
			
		}
		
		return flag;
		
	}
}

