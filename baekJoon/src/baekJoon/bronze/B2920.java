package baekJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2920 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		if (br.readLine().equals("1 2 3 4 5 6 7 8")) {
			
			System.out.println("ascending");
		} else if (br.readLine().equals("8 7 6 5 4 3 2 1")) {
			
			System.out.println("descending");
		} else {
			System.out.println("mixed");
		}
	}

}
