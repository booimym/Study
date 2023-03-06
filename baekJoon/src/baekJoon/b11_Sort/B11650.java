package baekJoon.b11_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 좌표 정렬하기 (힙정렬로 품)
 *
 */
public class B11650 {
	
	public static void sort(int[][] arr) {
	
		if(arr.length < 2) {
			return;
		}
		
		//최대 힙 만들기의 기준 노드 : 제일 끝 노드의 부모 노드
		int parentNode = ((arr.length-1)-1)/2;
		//[과정1] 최대 힙 만들기!
		for(int i = parentNode ; i >= 0 ; i--) {
			heapify(arr, i, arr.length-1);
		}
		//--------------------------------------------------------------------
		
		//[과정2] 오름차순 정렬하자
		for(int i = arr.length-1 ; i >= 1 ; i--) {
			swap(arr,0,i);
			heapify(arr,0,i-1);
		}
		
	}

	//최대 힙 만들기
	public static void heapify(int[][] arr,int parentNode, int lastIdx) {
		
		int leftIdx = parentNode * 2 + 1 ; 
		int rightIdx = parentNode * 2 + 2 ; 
		int largestIdx = parentNode;
		
		
		if(leftIdx <= lastIdx && arr[leftIdx][0] >= arr[parentNode][0] ) {
			
			if(arr[leftIdx][0] == arr[parentNode][0]) {
				
				if(arr[leftIdx][1] > arr[parentNode][1]) {
					largestIdx = leftIdx;
				}
				
			} else {
				largestIdx = leftIdx;
			}
			
		}
		
		if(rightIdx <= lastIdx && arr[rightIdx][0] >= arr[largestIdx][0] ) {
					
			if(arr[rightIdx][0] == arr[largestIdx][0]) {
				
				if(arr[rightIdx][1] > arr[largestIdx][1]) {
					largestIdx = rightIdx;
				}
				
			} else {
				largestIdx = rightIdx;
			}
					
		}
		
		if(parentNode != largestIdx) {
			swap(arr,largestIdx,parentNode);
			heapify(arr,largestIdx,lastIdx);
		}
		
	}
	public static void swap(int[][] arr, int a, int b) {
		
		//(1) x좌표값 바꿔 주기
		int temp0 = arr[a][0];
		arr[a][0] = arr[b][0];
		arr[b][0] = temp0;
		//-----------------------------
		//(2) y좌표값 바꿔 주기
		int temp1 = arr[a][1];
		arr[a][1] = arr[b][1];
		arr[b][1] = temp1;
		
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
		sort(arr);
		
		//---------------------------------------------------------------------
		
		// 출력하기
		for(int i = 0 ; i < arrLength ; i++) {
			
			bw.write(String.valueOf(arr[i][0])+" "+String.valueOf(arr[i][1])+"\n");
			
		}
		bw.close();
	}

}
