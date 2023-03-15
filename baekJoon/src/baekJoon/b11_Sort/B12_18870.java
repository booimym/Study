package baekJoon.b11_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B12_18870 {
	
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
		//한 쪽만 먼저 다 찼을 경우... 나머지 넣어주기...
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
		//정렬된 copyArr를 arr에 다시 넣어주기
		for(int i = start ; i <= end ; i++) {
			arr[i] = copyArr[i];
		}
		
	}
	
	//----------------------------------------------------
	public static void quickSort(int[] arr, int start, int end) {
		
		
		
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
		
		//------------------------------------------------------------------------------------
		//(1) 병합정렬로 풀기
		copyArr = new int[length];
		//divide(sortedArr, 0 , length-1);
		//------------------------------------------------------------------------------------
		//(2) 퀵정렬로 풀기
		
		//------------------------------------------------------------------------------------
		
		
		//(정렬한 배열, 원소보다 작은 서로 다른 값의 개수)를 map에다가 차곡차곡 담는다.
		Map<Integer, Integer> map = new HashMap<>();
		int index = 0;
		for(int i = 0; i < length ; i++) {
			
			if(i == 0) {
				// 제일 작은 값이기 때문에, 무조건 담는다.
				map.put(sortedArr[i], index++ );
			} else {
				// 만약 앞의 원소와 숫자가 같다면 담지 않는다. (당연히 원소보다 작은 값의 개수도 올라가지 않는다)
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
			
			//newArr의 순서에 따라, 서로 다른 작은 값의 개수를 출력한다.
			bw.write(map.get(newArr[i])+" ");
		}
		bw.close();
	}

}
