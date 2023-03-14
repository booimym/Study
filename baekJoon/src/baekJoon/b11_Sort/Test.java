package baekJoon.b11_Sort;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		
		int arr[] = { 6, 5, 1, 3, 0, 4 };

		for (int index = 1; index < arr.length; index++) { // 1.
			int temp = arr[index];
			int prev = index - 1;
			while ((prev >= 0) && (arr[prev] > temp)) {      // 2.
				arr[prev + 1] = arr[prev];
				prev--;
			}
			arr[prev + 1] = temp;                            // 3.
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
