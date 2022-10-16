package baekJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1546 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int countTokens = st.countTokens();
		double[] arr = new double[countTokens];
		
		for(int i = 0 ; i<countTokens;i++) {
			
			arr[i] = Integer.parseInt(st.nextToken());
			
		}
		double max = arr[0];
		
		for(int i = 0 ; i<countTokens;i++) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
			
		}
		
		double sum = 0;
		for(int i = 0 ; i<countTokens;i++) {
			
			arr[i] = arr[i]/max * 100.0;
			sum += arr[i];
		}
		
		System.out.println(sum/countTokens);
		
		
	}

}
