package baekJoon.b11_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * 좌표 정렬하기 2 (병합 정렬 & 퀵 정렬로 풀어보자!)
 *
 */
public class B11651 {
	
	static int[][] copyArr;
	
	public static void divide(int[][] arr , int start, int end) {
		
		//1. 분할하기
		
		if(start==end) {
			return;
		}
		
		// ▲ 실수 : 1트 : arr.length /2
		// 2트 end /2 
		int mid = (start + end) / 2 ;
		
		divide(arr, start, mid );
		divide(arr, mid + 1 , end);
		merge(arr, start, mid, end);
		
	}
	
	public static void merge(int[][] arr , int start, int mid, int end) {
		
		int left = start;
		int right = mid+1;
		// ▲ 실수 : index = 0이라고 씀...
		int index = start;
		
		// ▲ 실수 : left <= mid || right <= end 라고 씀....
		// 그러면 둘 중 하나가 넘어가도 집어넣어진다는 거니까...안돼...
		while (left <= mid && right <= end) {
			
			
			if(arr[left][1] > arr[right][1]) {
				copyArr[index][0] = arr[right][0];
				copyArr[index][1] = arr[right][1];
				index++;
				right++;
			} else if (arr[left][1] < arr[right][1]) {
				copyArr[index][0] = arr[left][0];
				copyArr[index][1] = arr[left][1];
				index++;
				left++;
			} else { //같을 경우 이제 [1]을 비교해야 함
				
				if(arr[left][0] > arr[right][0]) {
					copyArr[index][0] = arr[right][0];
					copyArr[index][1] = arr[right][1];
					index++;
					right++;
				} else {
					copyArr[index][0] = arr[left][0];
					copyArr[index][1] = arr[left][1];
					index++;
					left++;
				}
			}
		}
		
		//한 쪽만 먼저 다 찼을 경우... 나머지 넣어주기...
		if(left > mid && right <= end) {
			
			for(int i = right ; i <= end ; i++) {
				copyArr[index][0] = arr[right][0];
				copyArr[index][1] = arr[right][1];
				index++;
				right++;
			}
			
		} else {
			for(int i = left ; i <= mid ; i++) {
				copyArr[index][0] = arr[left][0];
				copyArr[index][1] = arr[left][1];
				index++;
				left++;
			}
		}
		
		//정렬된 copyArr를 arr에 다시 넣어주기
		
		for(int i = start; i <= end ; i++) {
			arr[i][0] = copyArr[i][0];
			arr[i][1] = copyArr[i][1];
		}
		
		
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 정렬되기 전 배열 만들기
		int arrLength = Integer.parseInt(br.readLine());
		
		// (1) 2차원 배열 선언
		int arr[][] = new int[arrLength][2];
		
		// (2) 배열 초기화
		for(int i = 0 ; i < arrLength ; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			
		}
		
		//---------------------------------------------------------------------
		// ▲ 길이 할당해줘야 함...
		copyArr = new int[arr.length][2];
		
		//1. 합병정렬로 풀기
		divide(arr,0,arr.length-1);
		
		//---------------------------------------------------------------------
		
		// 출력하기
		for(int i = 0 ; i < arrLength ; i++) {
			
			bw.write(String.valueOf(arr[i][0])+" "+String.valueOf(arr[i][1])+"\n");
			
		}
		bw.close();
		
	}

}
