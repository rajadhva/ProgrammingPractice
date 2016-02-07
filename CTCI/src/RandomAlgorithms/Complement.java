package RandomAlgorithms;

import java.util.Arrays;

import org.omg.Messaging.SyncScopeHelper;

public class Complement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        complement("110100");
	}

	public static void complement(String s){
		char arr[]=s.toCharArray();
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]=='1')
				arr[i]='0';
			else
				arr[i]='1';
		}
	
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		
		char temparr[]=Arrays.copyOf(arr,arr.length);
		
		char temp='1';
		for(int i=temparr.length-1;0<=i;i--)
		{
			if(temp=='1' && temparr[i]=='1'){
				temparr[i]='0';
				temp='1';
			}
			else
			{
				temparr[i]=(char)temp;
				break;
			}
		}
		System.out.println();
		for(int i=0;i<arr.length;i++)
			System.out.print(temparr[i] + " ");
		
		
	}
	
	
}
