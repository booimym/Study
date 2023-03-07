package baekJoon.b11_Sort;

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
		
		int average = 0; 	// (1) 산술평균
		int medium = 0;		// (2) 중앙값
		
		// 정렬되기 전 배열 만들기
		// (1) 배열 길이
		int arrLength = Integer.parseInt(br.readLine());
		// (2) 배열 생성
		int[] arr = new int[arrLength];
		// (3) 배열 초기화
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			average += arr[i];
			//불필요...왜냐면 5/2하면 되니까...
			if(i == arr.length/2) {
				medium = arr[i];		// (2) 중앙값
			}
		}
		
		average = average / arr.length; // (1) 산술평균
		
		//---------------------------------------------------------------------
		//입력되는 정수의 절댓값은 4,000을 넘지 않는다.
		int[] counting = new int[8001];
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			// 음수일 경우도 배열에 넣어지도록.... 4000을 더해준다!
			counting[arr[i]+4000]++;
			
		}
		
		int count = 0; // (3) 최빈값
		
		for(int i = 0 ; i < counting.length ; i++) {
			
			
			
		}
		
	}

}
