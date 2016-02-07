package RandomAlgorithms;
import java.util.*;
public class FindOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 4, 5, 5, 13, 4,4 };
		int num=identify(arr);
		System.out.println("Odd man out" + "," + num);
	}

	public static int identify(int arr[]){
		HashMap<Integer,Integer> nums=new HashMap<Integer,Integer>();
		int result=0;
		for (int num:arr){
			if(nums.containsKey(num)){
				Integer temp=nums.get(num);
				temp++;
				nums.put(num,temp);
			}
			else{
				nums.put(num, 1);
			}
			
		}	
		
		for(Map.Entry<Integer,Integer> entry:nums.entrySet()){
			System.out.println(entry.getKey()+ ","+ entry.getValue());
		}
		
		for(Map.Entry<Integer,Integer> entry:nums.entrySet()){
			result=(int)entry.getKey();
			int temp1=(int)entry.getValue();
			if(temp1%2==1){
				break;
			}
		}
			return result;
		}
		
		
		
	
}
