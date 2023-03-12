package baekJoon.b07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10798 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[][] arr = new String[5][15];
		
		for(int i = 0; i < 5 ; i++) {
				
			String[] arr_i = br.readLine().split("");
			int length = arr_i.length;
			
			for(int j = 0; j < 15; j++) {
				
				arr[i][j] = arr_i[j];
				if(j>=length) {
					arr[i][j] = "-1";
				}
				
			}
		}
		
		
		for(int i = 0; i < 5 ; i++) {
			
			
			for(int j = 0; j < 15; j++) {
				
				bw.write(arr[i][j]);
				
			}
		}
		
		bw.close();
			
	}

}
