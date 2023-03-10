package baekJoon.b11_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public class B10814 {

	/*값을 일단 맵에다가 담아야지...그래야 가입순으로 순서를 기억하지.....
	 * 
	 * 
	 * 
	 * 
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
