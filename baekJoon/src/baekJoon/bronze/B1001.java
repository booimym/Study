package baekJoon.bronze;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B1001 {

	public static void main(String[] args){
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try{
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int input1 = Integer.parseInt(st.nextToken());
			
			int input2 = Integer.parseInt(st.nextToken());
			
			bw.write(String.valueOf(input1 - input2));
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {	
			bw.flush();
			bw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
    }

}
