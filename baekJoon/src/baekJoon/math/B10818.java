package baekJoon.math;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B10818 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int countTokens = st.countTokens();
		int[] arr = new int[countTokens];
		
		for(int i = 0; i < countTokens ; i++ ) {
			
			arr[i] = Integer.parseInt(st.nextToken());
			
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < countTokens ; i++ ) {
			
			if(arr[i]> max) max = arr[i];
			
			if(arr[i]< min) min = arr[i];
			
		}
		
		System.out.println(min + " " + max);
		
		
		
	}	
	
}
