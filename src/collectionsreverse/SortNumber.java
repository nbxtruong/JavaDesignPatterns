package collectionsreverse;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class SortNumber {
	private static void printAll(List<Integer> list){
        for (Integer i : list) {
            System.out.println(i);
        }
	}

	private static void printReverseAll(List<Integer> list){
		Collections.reverse(list);

		for (Integer i:list) {
			System.out.println(i);
		}
	}

    public void sortListNumber(){
    	List<Integer> list=new ArrayList<Integer>();
    	List<Integer> listOne=new ArrayList<Integer>();
    	List<Integer> listTwo=new ArrayList<Integer>();
    	
    	for (int i=1 ;i<=10 ;i++ ) {
    		list.add(i);
    	}

    	for (int i=0; i<list.size(); i++) {
    		if (list.get(i)%2==0) {
    			listOne.add(list.get(i));
    		}
    		else{
    			listTwo.add(list.get(i));
    		}
    	}

    	printAll(listOne);

    	printReverseAll(listTwo);
    }
}
