package baekJoon.b11_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class B2108 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		/*
		 * 
		 * [ 최빈값 구하기 ]
		 * 
		 * 
		 * */
		
		int average = 0; 	// (1) 산술평균
		int median = 0;		// (2) 중앙값
		int max = -4001;
		int min = 40001;
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
				median = arr[i];		// (2) 중앙값
			}
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
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
		
		int modeMax = 0; // (3) 최빈값
		boolean flag = false;
		int mode = -4001;
		for(int i = 0 ; i < counting.length ; i++) {
			
			if(counting[i] > 0) {
				
				
				
				
				if (counting[i] > modeMax ) {
					modeMax = counting[i];
					flag = true;
					mode = i - 4000;
				} else if(counting[i] == modeMax && flag == true) {
					mode = i - 4000;
					flag = false;
				}
				
			}
			
			
		}
		
		bw.write(average + "\n"+median+"\n"+mode+"\n"+(max-min));
		bw.close();
		
	}

}
