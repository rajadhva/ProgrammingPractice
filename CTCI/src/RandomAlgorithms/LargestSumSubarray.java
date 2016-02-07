package RandomAlgorithms;

import java.util.HashSet;
import java.util.Set;

public class LargestSumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 4, 10, 5, -13, 50,9 };
		largestSumSubarray(arr);
	}
	
	public static void largestSumSubarray(int arr[]){
	    HashSet temp=new HashSet();
		HashSet<Set> largestSubArray=new HashSet<Set>();	
		int currentSum=arr[0];
		int maxSum=arr[0];
		boolean flag=false;
	for(int i=1;i<arr.length;i++){
		currentSum=Math.max(arr[i],currentSum+arr[i]);
        maxSum=Math.max(currentSum,maxSum);
	}
	
	System.out.println("The maxSum is " + maxSum);
	}
	

}
