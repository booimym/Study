package baekJoon.b11_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public class B10814 {

	/* 안정 정렬 방법을 쓰면 될 듯??? 
	 *  안정 정렬 = 삽입, 병합, 버블
	 *  불안정 정렬 = 퀵, 선택
	 * */
	
	public static void insertSort(String[][] arr) {
		
		for(int i = 1 ; i < arr.length ; i++) {
			//String[] temp = arr[i];
			String temp_1 = arr[i][0];
			String temp_2 = arr[i][1];
			int now = Integer.parseInt(arr[i][0]);
			int index = i-1;g
			
			// index가 0이상이어야하는데 그건 안 써도 돼?
			
			
			//▲ &&의 앞과 뒤를 바꾸니 해결! 컴퓨터는 멍충했다!
			//while(Integer.parseInt(arr[index][0]) > now && index >= 0) {
			while((index >= 0) && (Integer.parseInt(arr[index][0]) > Integer.parseInt(temp_1) )) {
				
				// 물어보기!!!!! 왜 이거랑
				//------------------------------
				arr[index+1][0] = arr[index][0];
				arr[index+1][1] = arr[index][1];
				//------------------------------
				// 이거랑 다르게 나와???????????????????????????????????????????????????????????????????
				//arr[index+1] = arr[index];

				index--;
			}
			// while문을 나온 후에, 값 집어넣기
			//arr[index+1] = temp;
			arr[index+1][0] = temp_1;
			arr[index+1][1] = temp_2;
			
			
		}
		
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//길이 입력받기
		int length = Integer.parseInt(br.readLine());
		
		String[][] arr = new String[length][2];
		
		for(int i = 0; i < length ; i++) {
			
			//이러면 바로 0과 1로 나눠지나?
			arr[i] = br.readLine().split(" ");
			

		}
		
		
		System.out.println("배열에 정상적으로 들어갔는지 확인중");
		for(int i = 0; i < length ; i++) {
			
			System.out.println(arr[i][0]+" "+arr[i][1]);
		}
		System.out.println("배열에 정상적으로 들어갔는지 확인중");

		
		//삽입으로 풀어보자!
		insertSort(arr);
		
		for(int i = 0; i < length ; i++) {
			bw.write(arr[i][0]+" "+arr[i][1]+"\n");
		}
		bw.close();
	}

}
