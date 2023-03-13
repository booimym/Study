package baekJoon.b07_2D_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2566 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[][] arr = new int[9][9];
		//▲ 틀린 이유 : max를 0이라고 설정해두면, 만약에 모든 숫자가 0일 때, if문에 해당이 되지 않아서
		//maxRow&maxCol이 0,0이 되어버림...
		//해결방법 (1) max를 아예 해당하지 않는 수로 넣어버리기!
		int max = -1;
		int maxRow = 0;
		int maxCol = 0;
		//해결방법 (2) max를 0으로 둘꺼면, 기본 좌표 설정을 (1,1)로 바꾸기
		/*int max = 0;
		int maxRow = 1;
		int maxCol = 1;*/
		for(int i = 0; i < 9 ; i++) {
			
			String[] arr_i = br.readLine().split(" ");
			
			for(int j = 0; j < 9; j++) {
				
				arr[i][j] =  Integer.parseInt(arr_i[j]);
				if(arr[i][j] > max) {
					max = arr[i][j];
					maxRow = i+1;
					maxCol = j+1;
				}
			}
		}
		
		bw.write(max+"\n"+maxRow+" "+maxCol);
		bw.close();
		
	}

}
