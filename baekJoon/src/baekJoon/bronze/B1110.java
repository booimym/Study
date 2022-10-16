package baekJoon.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1110 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//홀수줄의 홀수칸에 말이 있으면 count++
		//짝수줄의 짝수칸에 말이 있으면 count++
		
		
		int count = 0;
		for(int i = 0 ; i < 8 ; i++) {
		String line = br.readLine();
			if (i%2 ==1) {
				
				for(int j = 0; j < 8 ; j++) {
					if(j%2 ==1) {
						if(line.charAt(j)=='F') {
							count++;
						}
					}	
				}
			}
			
			if (i%2 ==0) {
				
				for(int j = 0; j < 8 ; j++) {
					if(j%2 ==0) {
						if(line.charAt(j)=='F') {
							count++;
						}
					}
				}
			}
			
		}
		
		System.out.println(count);
	}
}
