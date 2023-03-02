package baekJoon.String;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B9093 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<num ;i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int countTokens = st.countTokens();
			String[] arr = new String[countTokens];
			for(int j= 0 ; j<countTokens ; j++) {
				StringBuilder sb2 = new StringBuilder(st.nextToken());
				
				arr[j]=sb2.reverse().toString();
				sb.append(arr[j]+" ");
			}
		sb.append("\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

}
