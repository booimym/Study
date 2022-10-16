package baekJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B3502 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] arr = new boolean[41];
		
		for(int i = 0; i < 10 ; i++) {
			
			arr[Integer.parseInt(br.readLine())  % 42] = true;
		}
		int count = 0;
		for(boolean b : arr) {
			
			if(b) {
				count++;
			}
		}
		
	}

}
