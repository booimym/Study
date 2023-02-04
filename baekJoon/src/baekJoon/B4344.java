package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B4344 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num1 = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int j = 0 ; j < num1 ; j++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int num2 = Integer.parseInt(st.nextToken()); //첫번째 (앞으로 나올 숫자의 개수)
			int[] arr = new int[num2];
			int sum = 0;
			for(int i = 0 ; i < num2; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				
				sum += arr[i];
			}
			double avg = sum/num2;
			
			double count=0;
			for(int n  : arr) {
				if(n>avg) count++;
			}
			
			double answer = count/num2*100;
			
			sb.append(String.format("%.3f",answer)+"%");
			sb.append("\n");
			
		
		}
		System.out.println(sb.toString());
	}


}
