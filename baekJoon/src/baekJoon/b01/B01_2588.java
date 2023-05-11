package baekJoon.b01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class B01_2588 {

	public static void main(String[] args) throws IOException {

		//for문 돌릴 때마다 *10 을 해주는 걸로 짜면 될 것 같은데?
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input1 = Integer.parseInt(br.readLine());
		
		String[] inpArr = br.readLine().split("");
		
		for(int i = 0 ; i < 2 ; i++) {
			
			int num3 = input1 * (Integer.parseInt(inpArr[i])*10^i);
			System.out.println("num3 : "+ num3);
			
			
		}
		
		
		
		
		
	}

}
