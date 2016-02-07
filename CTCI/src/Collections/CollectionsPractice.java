package Collections;
import java.util.*;
public class CollectionsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> testSet=new HashSet<Integer>();
		testSet.add(20);
		testSet.add(35);
		System.out.println(testSet.contains(1));
		
		Iterator it=testSet.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		for(Integer i:testSet)
			System.out.println(i);
			
		//testSet.clear(); //removes all the elements
		
		
		HashMap testMap=new HashMap();
        testMap.put(1, "Vaibhav");
        int z=5;
        testMap.put(z, "Dhaval");
        
        //iterate over a hasmap using keys
        Set keys =testMap.keySet();
        for(Object key:keys)
        	System.out.println(testMap.get(key));
        
        LinkedList testList=new LinkedList(testSet);
		
        testList.addLast("Rushi");
        

        
        
		
	}

}
