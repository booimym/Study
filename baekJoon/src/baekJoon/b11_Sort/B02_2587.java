package baekJoon.b11_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 	- 산술평균 : N개의 수들의 합을 N으로 나눈 값
	- 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
	- 최빈값 : N개의 수들 중 가장 많이 나타나는 값
	- 범위 : N개의 수들 중 최댓값과 최솟값의 차이
 *
 */
public class B02_2587 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int average = 0;	// 산술평균
		int medium = 0;		// 중앙값
		
		for(int i = 0 ; i < 5 ; i++) {
			int num = Integer.parseInt(br.readLine());
			average += num;
			//불필요...왜냐면 5/2하면 되니까...
			if(i == 2) {
				medium = num; // 중앙값
			}
		}
		
		int count = 0; 		// 최빈값
		
		average = average/5; // 산술평균
		
		// ----------------------------------------------------------------------------------------
		
		
		
	}
}
