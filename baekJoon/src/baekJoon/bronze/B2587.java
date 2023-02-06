package baekJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2587 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int average = 0;
		int medium = 0;
		for(int i = 0 ; i < 5 ; i++) {
			int num = Integer.parseInt(br.readLine());
			average += num;
			//불필요...왜냐면 5/2하면 되니까...
			if(i == 2) {
				medium = num;
			}
		}
		
		average = average/5;
		//평균
		System.out.println(average);
		//중앙값
		System.out.println(medium);
		
	}
}
