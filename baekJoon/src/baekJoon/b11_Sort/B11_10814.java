package baekJoon.b11_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashMap;
import java.util.Map;

public class B11_10814 {

	/* 안정 정렬 방법을 쓰면 될 듯??? 
	 *  안정 정렬 = 삽입, 병합, 버블
	 *  불안정 정렬 = 퀵, 선택
	 * */
	//값으로 정렬시키는 경우
	public static void insertSort(String[][] arr) {
		
		for(int i = 1 ; i < arr.length ; i++) {
			//String[] temp = arr[i];
			String temp_1 = arr[i][0];
			String temp_2 = arr[i][1];
			int index = i-1;
			
			// index가 0이상이어야하는데 그건 안 써도 돼? -> 써야 됨...
			
			
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
	
	//주소값으로 정렬시키는 경우
	public static void insertSort_2(String[][] arr) {
		
		for(int i = 1 ; i < arr.length ; i++) {
			String[] temp = arr[i];
			
			int index = i-1;
			System.out.println("-----------------------------------------------------");
			
			//▲ &&의 앞과 뒤를 바꾸니 해결! 컴퓨터는 멍충했다!
			//while(Integer.parseInt(arr[index][0]) > now && index >= 0) {
			while((index >= 0) && (Integer.parseInt(arr[index][0]) > Integer.parseInt(temp[0]) )) {
				System.out.println();
				System.out.println("앞원소 ["+index+"]번째 원소와 비교중임.");
				System.out.println("앞원소의 크기가 더 크구나! 뒤로 보내야겠다.");
				System.out.println("앞원소가 계속 뒤로가는데, temp의 값도 변하는지 궁금해.....");
				System.out.println("이때, temp는 " + temp);
				System.out.println("이때, temp[0]는 " + temp[0]);
				arr[index+1] = arr[index];

				index--;
			}
			// while문을 나온 후에, 값 집어넣기
			arr[index+1] = temp;
			
			System.out.println("-----------------------------------------------------");
			
		}
		
	}
	
	static String[][] copyArr;
	
	//합병정렬
	public static void divide(String[][] arr, int start, int end) {
		
		if(start>=end) {
			return;
		}
		
		int mid = (start + end) / 2;
		
		divide(arr, start, mid);
		divide(arr, mid+1, end);
		merge(arr, start, mid, end);
		
	}
	
	public static void merge(String[][] arr, int start, int mid, int end) {
		
		int left = start;
		int right = mid+1;
		int index = start;
		
		while(left <= mid && right <= end) {
			
			if(Integer.parseInt(arr[left][0]) <= Integer.parseInt(arr[right][0]) ) {
				copyArr[index++] = arr[left++];
			} else {
				copyArr[index++] = arr[right++];
			}
			
		}
		
		if(left > mid) {
			while(right <= end) {
				copyArr[index++] = arr[right++];
			}
		}
		
		if(right > end) {
			while(left <= mid) {
				copyArr[index++] = arr[left++];
			}
		}
		
		for(int i = start ; i <= end; i++) {
			arr[i] = copyArr[i];
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
		
		//삽입으로 풀어보자!
		//insertSort(arr);
		//insertSort_2(arr);
		
		
		copyArr = new String[length][2];
		divide(arr, 0, length-1);
		
		for(int i = 0; i < length ; i++) {
			bw.write(arr[i][0]+" "+arr[i][1]+"\n");
		}
		bw.close();
	}

}
