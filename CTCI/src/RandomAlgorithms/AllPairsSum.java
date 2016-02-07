package RandomAlgorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class AllPairsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a sum value");

		int n = sc.nextInt();

		int arr[] = { 4, 8, 2, 5, 13, 7 };

		Arrays.sort(arr);

		// System.out.println(Arrays.toString(arr));
		printSum(arr, n);
		linearSum(arr, n);
	}

	// sort array and keep two pointers to find all pairs.
	public static void printSum(int[] arr, int sum) {

		int pointer1 = 0;
		int pointer2 = arr.length - 1;

		while (pointer1 < pointer2) {
			if (arr[pointer1] + arr[pointer2] == sum) {
				System.out.println(arr[pointer1] + "," + arr[pointer2]);
				pointer1++;
				pointer2--;

			} else if (arr[pointer1] + arr[pointer2] < sum) {
				pointer1++;
			} else {
				pointer2--;
			}
		}
	}

	public static void linearSum(int arr[], int sum) {
		HashSet<Integer> set = new HashSet();
		// HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (!set.contains(arr[i])) {
				set.add(arr[i]);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			int value = sum - arr[i];
			if(value!=arr[i]){
			if (set.contains(new Integer(value)) && set.contains(new Integer(arr[i]))) {

				System.out.println("Pair is" + arr[i] + ":" + value);
				set.remove(value);
			}
			}
		}
	}
}
