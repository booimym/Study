package baekJoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class B2108 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		// 정렬되기 전 배열 만들기
		int arrLength = Integer.parseInt(br.readLine());
		int[] arr = new int[arrLength];
		//int[] counting = new int[arrLength]; 
		//System.out.println(Arrays.toString(counting));
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		System.out.println(Arrays.toString(arr));
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			
			map.push(arr[i],1);
		}
		
		
		
		
		System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.toString(counting));
	}

}
