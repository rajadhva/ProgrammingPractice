package RandomAlgorithms;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int numbers[]={3,4,2,1,7,8};
       selectionSort(numbers);
	}

	public static void selectionSort(int num[]) {
		int i, j;
		for (i=0; i <num.length-1; i++) {
			int swap = i;
			for (j = i+1; j < num.length; j++) {
				if (num[j] < num[swap])
					swap = j;
			}
			int temp = num[swap];
			num[swap] = num[i];
			num[i] = temp;
		}
		for(int k=0;k<num.length;k++)
			System.out.println(num[k]);
	}
}
