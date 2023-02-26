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
			
		/*
		 * 
		 * [ 최빈값 구하기 ]
		 * 
		 * 
		 * */
		
		
		// 정렬되기 전 배열 만들기
		// (1) 배열 길이
		int arrLength = Integer.parseInt(br.readLine());
		// (2) 배열 생성
		int[] arr = new int[arrLength];
		// (3) 배열 초기화
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//---------------------------------------------------------------------
		//입력되는 정수의 절댓값은 4,000을 넘지 않는다.
		int[] counting = new int[8001];
		
		
		
		
	}

}
