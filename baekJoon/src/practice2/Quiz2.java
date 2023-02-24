package practice2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Quiz2 {

	static int solution() {
		
		return 0;
	}
	
	public static void main(String[] args) {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] p = {2,2,-1,1,5,-1,5};
		int[] b = {1,5};
		int[] count = new int[p.length];
		
		for(int i = 0; i<p.length; i++) {
			
			int temp = i;
			
			//System.out.println("현재 temp에 저장된 i는 "+ i+"입니다.");
			
			while(p[i]!=-1) {
				i = p[i];
			}
			
			//System.out.println("while문을 빠져나온 i는"+i+"입니다.");
			count[i]++;
			i = temp;
			
		}
		//System.out.println(Arrays.toString(count));
		int[] solution = new int[b.length];
		for(int i = 0; i < b.length;i++) {
			solution[i] = count[b[i]];
		}
		System.out.println(Arrays.toString(solution));
	}

}
