package baekJoon.b01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B01_10430 {
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		
		StringTokenizer st = new StringTokenizer(input," ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		bw.write(((a+b)%c)+"\n"+(((a%c)+(b%c))%c)+"\n"
				+((a*b)%c)+"\n"+(((a%c)*(b%c))%c));
		bw.close();
	}	
}
