package baekJoon.implementation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2562 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] arr = new int[9];
		
		for(int i = 0 ; i < 9 ; i++) {
			
			arr[i] = Integer.parseInt(br.readLine());
			
		
		}
		int max = arr[0];
		int num = 1; 
		// 첫번째 숫자가 max일때의 num도 생각해야되므로 초기화값을 1로 해줘야 함!!!!
		// 내가 원래 0으로 집어넣었더니 반례로
		//99 1 2 3 4 5 6 7 8 넣었더니 num=0이 나왔었음..
		for(int i = 0; i < 9 ; i++ ) {
			
			if(arr[i]> max) {
				max = arr[i];
				num = i+1;
				
			}
			
		}
		
		System.out.println(max + "\n" + num);
		
	}

}
