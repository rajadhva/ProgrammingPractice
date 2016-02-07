package Collections;

import java.util.Arrays;

public class ArrayList {

	private Object[] arrayList;
	private int size;
	
	public ArrayList(){
		arrayList=new Object[10];
	}
	
	public int getSize(){
		return size;
	}
	
	public void add(Object o){
		if(arrayList.length-size<=5){
		  arrayList[size-1]=o; 
		  size++;
		}
		else{				
			arrayList=Arrays.copyOf(arrayList,arrayList.length*2);
			arrayList[size-1]=o;
			size++;
		}
		
	}
	
	public Object remove(int index){
		if(index<size){
			Object temp=arrayList[index];
			arrayList[index]=null;
			while(index<size){
				arrayList[index]=arrayList[index+1];
				arrayList[index+1]=null;
			}
			size--;
			return temp;
			}
		else{
			throw new ArrayIndexOutOfBoundsException();
		}
		}
	
  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
