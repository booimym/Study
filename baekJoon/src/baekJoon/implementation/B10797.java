package baekJoon.implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10797 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();

		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		String[] tokenArr = new String[st.countTokens()];
		int count = 0;
		int countTokens = st.countTokens();
		//오 왜인지 모르겠지만,,,!!!!!!! int형에 집어넣으면 다 출력된다
		//바로 st.countTokens까지 돌린다고 하면 중간만 출력됨..args.
		for(int i = 0; i< countTokens;i++) {
			
			tokenArr[i] = st.nextToken(); // tokenArr에 모든 숫자들을 담았다.
//			System.out.println(tokenArr[i]);
			if (tokenArr[i].equals(input)) {
				count++;
			}
		} 
		
		System.out.println(count);
		
		
	}

}
