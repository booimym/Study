package baekJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B4101 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		while(true) {
			String line = br.readLine();
			
			if(line.equals("0 0")) {
				break;
			} else {
				StringTokenizer st = new StringTokenizer(line);
				int num1 = Integer.parseInt(st.nextToken());
				int num2 = Integer.parseInt(st.nextToken());
				
				if(num1>num2) {
					sb.append("Yes\n");
				} else {
					sb.append("No\n");
				}
				
			}
			
		}
		
		System.out.println(sb.toString());

	}

}
