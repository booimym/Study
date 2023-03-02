package baekJoon.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2908 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		StringBuilder sb1 = new StringBuilder(st.nextToken());
		StringBuilder sb2 = new StringBuilder(st.nextToken());
		
		int rev1 = Integer.parseInt(sb1.reverse().toString());
		int rev2 = Integer.parseInt(sb2.reverse().toString());
		
		if(rev1 > rev2) System.out.println(rev1);
		else System.out.println(rev2);
	}

}
