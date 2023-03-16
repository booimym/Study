package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionPractice {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		
		//ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr1));

		String[] strs = {"alpha", "beta", "charlie"};
		List<String> lst = Arrays.asList(strs); 
		
		//------------------------------------
		 List<String> e2st = new ArrayList<String>(Arrays.asList(strs)); 
	}

}
