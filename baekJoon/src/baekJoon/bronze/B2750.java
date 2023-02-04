package baekJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class B2750 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int number = Integer.parseInt(br.readLine());
		
		int[] arr = new int[number];
		for(int i = 0; i<number;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		//System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i<number;i++) {
			System.out.println(arr[i]);
		}
		
//		//니가 말한 한번에 split해서 담는 방법
//		String[] arrString = br.readLine().split(" ");
//		//배열의 길이를 찾는 법
//		int num = arrString.length;
//		//System.out.println(num);
//		
//		int[] arrInt = new int[num];
//		
//		for(int i = 0; i < num ; i++) {
//			
//			arrInt[i] = Integer.parseInt(arrString[i]);
//			
//		}
//			System.out.println(Arrays.toString(arrInt));
			
		
		
		
		
		
		
		
		
	}

}
