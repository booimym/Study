package baekJoon.b07_2D_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10798 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[][] arr = new String[6][15];
		
		for(int i = 0; i < 5 ; i++) {
			String[] arr_i = br.readLine().split("");
			int length = arr_i.length;
			
			for(int j = 0; j < 15; j++) {
				//한 줄에 최대 15개인데, 그보다 덜 존재할 경우, 빈칸을 "-1"로 채워넣는다.
				if(j>=length) {
					arr[i][j] = "-1";
				} else {
					arr[i][j] = arr_i[j];
				}
				
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < 15; i++) {
			
			for(int j = 0; j < 5; j++) {
				
				// -1이 아닐 경우에만, 읽어들이기
				if(arr[j][i].equals("-1")) {
					
				}else {
					sb.append(arr[j][i]);
				}
			}
		}
		
		
		
		bw.write(sb.toString());
		bw.close();
			
	}

}
