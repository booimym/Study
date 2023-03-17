package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class CollectionPractice {

	public static void main(String[] args) {
		
		//arrayAsListEx();
		iteratorEx();
		
	}
	public static void arrayAsListEx() {
		
		int[] arr1 = {1,2,3,4,5};
		
		//ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr1));

		String[] strs = {"alpha", "beta", "charlie"};
		List<String> lst = Arrays.asList(strs); 
		
		//------------------------------------
		 List<String> e2st = new ArrayList<String>(Arrays.asList(strs)); 
		 
		Iterator it = lst.iterator();
	}
	
	public static void iteratorEx() {
		
		//ArrayList<Integer> list1 = new ArrayList<>();
		HashSet<Integer> list1 = new HashSet<>();
		list1.add(1);
		list1.add(2);
		
		Iterator<Integer> it = list1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		for(int i = 0; i < list1.size(); i++) {
//			int a = list1.get(i);
//			System.out.println(a);
//		}
	}

}
