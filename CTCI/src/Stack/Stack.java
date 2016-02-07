package Stack;

import java.util.Scanner;

public class Stack {
	private int top;
	private int capacity;
	private int[] arr;
	
	public Stack(int value){
		top=-1;
		this.capacity=value;
		arr=new int[capacity];	
	}
	
	public void push(int x){
		if(top==capacity-1){
			System.out.println("Stack already full");
		}
		else{
		top++;
		arr[top]=x;
		System.out.println(x + " has been added");
		}
			
	}
	
	public void pop(){
		if(top==-1){
			System.out.println("Stack underflow");	
		}
		else{
			top--;
			System.out.println("Pop successful");
		}
	}
	
	public int peek()
	{
		return arr[top];
	}

	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter a capacity");
		int value=sc.nextInt();
		
		Stack myStack= new Stack(value);
		
		myStack.push(5);
		myStack.push(10);
		
		myStack.pop();
		System.out.println(myStack.peek());
	}
	
}
