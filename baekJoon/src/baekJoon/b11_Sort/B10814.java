package baekJoon.b11_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public class B10814 {

	/* 안정 정렬 방법을 쓰면 될 듯??? 
	 *  안정 정렬 = 삽입, 병합, 버블
	 *  불안정 정렬 = 퀵, 선택
	 * */
	
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//map 길이
		int length = Integer.parseInt(br.readLine());
		
		Map<Integer, String> map = new LinkedHashMap<>();
		
		for(int i = 0; i < length ; i++) {
			
			
			String[] arr = br.readLine().split(" ");
			
			map.put(Integer.parseInt(arr[0]), arr[1]);
			
		}
		
		
		
	}

}
