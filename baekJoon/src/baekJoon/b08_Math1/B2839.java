package baekJoon.b08_Math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		switch(input%5) {
		
		case 0 : count = input/5 ; break;
		case 1 : count = (input-6)/5 +2 ;break;
		case 2 :
			if(input == 2 || input == 7) {
				count = -1;
			} else {
				count = (input-12)/5+4;
			}
			break;
		case 3 : count = (input-3)/5+1;break;
		case 4 : if(input == 4) {
			count = -1;
			} else {
			count = (input-9)/5+3;
			}
			break;
		
		}
		
		System.out.println(count);
	}

}
