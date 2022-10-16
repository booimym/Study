package baekJoon.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B1259 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	
		while(true) {
			
			String str = br.readLine();
			if(Integer.parseInt(str) != 0) {
				StringBuilder sb = new StringBuilder(str);
				if(sb.toString().equals(sb.reverse().toString())) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}
				
			}else {
				break;
			}
		}
	
	
	}

}
