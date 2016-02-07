package RandomAlgorithms;

public class MissingAP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int testArray[]={-2,-4,-8,-10,-12};
        missingNum(testArray);
	}

	public static void missingNum(int arr[])
	{
		if(arr.length==0)
			System.out.println("Array empty");
		
		int difference[]=new int[arr.length-1];
		
		
		int first= arr[0];
		int second=arr[1];
		int third=arr[2];
		
		int trueDiff=Math.min(Math.abs(second-first), Math.abs(third-second));
		
		if(second-first<0)
			trueDiff= -1*trueDiff;
		System.out.println(trueDiff);
		for(int i=1;i<arr.length;i++){
			difference[i-1]=arr[i] - arr[i-1];
		}
		
		for(int j=0;j<difference.length;j++){
			if(difference[j]!=trueDiff){
				System.out.print("Missing number is" + ":" + (arr[j]+trueDiff));
				break;
			}
		}
	}
}
