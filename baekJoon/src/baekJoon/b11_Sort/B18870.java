package baekJoon.b11_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B18870 {
	
	//병합정렬에 이용할 배열
	static int[] copyArr;
	
	public static void swap (int[] arr, int a , int b) {
		
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
	
	public static void divide(int[] arr, int start, int end) {
		
		if(start == end) {
			return;
		}
		
		int mid = (start + end ) / 2 ;
		
		divide(arr, start , mid);
		divide(arr, mid+1 , end);
		merge(arr, start, mid, end);
		
	}

	public static void merge(int[] arr, int start, int mid, int end) {
		
		int left = start;
		int right = mid+1;
		int index = start;
		
		// ▲ 실수 : left <= mid || right <= end 라고 씀....
		// 그러면 둘 중 하나가 넘어가도 집어넣어진다는 거니까...안돼...
		while (left <= mid && right <= end) {
			
			if(arr[left] > arr[right]) {
				copyArr[index++] = arr[right++];
			} else {
				copyArr[index++] = arr[left++];
			}
			
		}
		
		if(left > mid ) {
			while(right <= end) {
				copyArr[index++] = arr[right++];
			}
		}
		
		if(right > end) {
			while(left <= mid) {
				copyArr[index++] = arr[left++];
			}
		}
		
		for(int i = start ; i <= end ; i++) {
			arr[i] = copyArr[i];
		}
		
		
	}
	
	/*
	 *  퀵으로 풀어봐야징
	 * 
	 * */
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int length = Integer.parseInt(br.readLine());
		//정렬할 배열
		int[] sortedArr = new int[length];
		//정렬 안 된 배열
		int[] newArr = new int[length];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		//배열에 입력받음.
		//궁금한 점 : 왜 for(int i = 0 ; i < st.countTokens(); i++) { 이라고 쓰면 3개밖에 안꺼내질까?
		for(int i = 0 ; i < length; i++) {
			sortedArr[i] = Integer.parseInt(st.nextToken());
			newArr[i] = sortedArr[i];
			//System.out.println(sortedArr[i]);
		}
		//-----------------------------------------------------------------------------------
		
		// 퀵 정렬 ㅠㅠ 까먹었어... 일단 다른 정렬로 풀어보겠어
		// 힙!! 병합!!
		
		//병합정렬로 풀기
		copyArr = new int[length];
		
		divide(sortedArr, 0 , length-1);
		
		Map<Integer, Integer> map = new HashMap<>();
		int index = 0;
		for(int i = 0; i < length ; i++) {
			
			
			if(i == 0) {
				map.put(sortedArr[i], index++ );
			} else {
				if(sortedArr[i-1] == sortedArr[i]) {
				} else {
					map.put(sortedArr[i], index++ );
				}
			}
			//System.out.println("sortedArr["+i+"]"+sortedArr[i]);
			//System.out.println("index는?" + index);
		}
		
//		for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
//			  System.out.println(String.format("Key (name) is: %s, Value (age) is : %s", pair.getKey(), pair.getValue()));
//			}
		
		
		
		
		
		
		
		
		//-----------------------------------------------------------------------------------
		//출력
		for(int i = 0; i < length ; i++) {
			//System.out.println("newArr[i]"+newArr[i]);
			bw.write(map.get(newArr[i])+" ");
		}
		bw.close();
	}

}
