package baekJoon.b07_2D_Array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 색종이 
 *
 */
public class B2563 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int length = Integer.parseInt(br.readLine());
		int[][] arr = new int[100][100];
		
		for(int i = 0; i < length; i++) {
			
			String xy = br.readLine();
			int x = Integer.parseInt(xy.split(" ")[0]);
			int y = Integer.parseInt(xy.split(" ")[1]);
			
			for(int j = x; j < x+10 ; j++) {
				
				for(int k = y; k < y+10; k++) {
					
					//▲ 기존 방법 : 여러번 덮이면 ++해준다음 중복값을 빼준다고 생각햇는데
					//아직 왜인지 모르겠으나 그러면 자꾸 틀림...
					
					// 그래서 몇번을 덮이든 상관없이 덮이기만 하면 1로 고정시킨다음
					// 1의 개수를 세어주는 방법으로 변경
					arr[j][k]=1;
				}
			}
			
		}
		
		//좌표 어케 나오는지 직접 보려고...ㅎㅎㅎ....
		/*
		for(int i = 0; i < 100; i++) {
			
			for(int j=0; j < 100; j++) {
				
				System.out.print(arr[i][j]);
				
			}
			System.out.println();
		}
		*/
		
		//▲원래는 중복값을 지칭하는 변수였으나, 
		//덮인 부분을 세어주는 변수로 바꿈
		int count = 0;
		for(int i = 0; i < 100; i++) {
		
			for(int j=0; j < 100; j++) {
				
				if(arr[i][j] == 1) {
					count++;
				}
				
			}
		}
		//▲기존 방법 : 총 덮인 부분 - 중복값을 해줬으나... 그러면 자꾸 틀리게 나옴... ㅠㅠㅠㅠ왜쥬
		//int answer = (length*100)-count;
		
		bw.write(count+"");
		bw.close();
	}

}
