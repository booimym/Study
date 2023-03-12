package baekJoon.b07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 행렬 덧셈
 *
 */
public class B2738 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] length = br.readLine().split(" ");
		int row = Integer.parseInt(length[0]);
		int column = Integer.parseInt(length[1]);
		
		int[][] arr = new int[row][column];
		for(int i = 0; i < (row+row) ; i++) {
			
			String[] arr_i = br.readLine().split(" ");
			
			for(int j = 0; j < column; j++) {
				
				if(i >= row) {
					arr[i-row][j] += Integer.parseInt(arr_i[j]);
				} else {
					arr[i][j] =  Integer.parseInt(arr_i[j]);
				}
				
			}
		}
		
		for(int i = 0; i < row ; i++) {
			for(int j = 0; j < column; j++) {
				bw.write(arr[i][j]+" ");
			}
			bw.write("\n");
		}
		bw.close();
	}

}
