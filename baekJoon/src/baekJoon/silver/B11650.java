package baekJoon.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11650 {
	
	static void divide(int[][] arr, int start, int end) {
		
		
		
	}
	
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 정렬되기 전 배열 만들기
		int arrLength = Integer.parseInt(br.readLine());
		
		// (1) 2차원 배열 선언
		int arr[][] = new int[arrLength][2];
		
		// (2) 배열 초기화
		for(int i = 0 ; i < arrLength ; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			
		}
		
		//---------------------------------------------------------------------
		
		
		
		
		
		
		
		
		
		
		//---------------------------------------------------------------------
		
		// 출력하기
		for(int i = 0 ; i < arrLength ; i++) {
			
			bw.write(String.valueOf(arr[i][0])+" "+String.valueOf(arr[i][1])+"\n");
			
		}
		bw.close();
	}

}
