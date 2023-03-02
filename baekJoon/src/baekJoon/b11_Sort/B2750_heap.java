package baekJoon.b11_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2750_heap {
	
	
	public static void sort(int[] arr, int arrLength) {
		
		//마지막 인덱스의 부모 노드 찾기
		int parentNode = (arrLength-1)-1/2;
		
		
		
		heapify(arr,parentNode,arrLength-1);
		
		
		
	}
	
	public static void swap(int[] arr,int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	
	/**
	 * 최대힙 만드는 메소드
	 */
	public static void heapify(int[] arr, int parentNode, int lastIdx) {
		
		int leftChildIdx = parentNode * 2 + 1;
		int rightChildIdx = parentNode * 2 + 2;
		int largestIdx = parentNode;
		
		if(leftChildIdx <= lastIdx && arr[leftChildIdx] > arr[largestIdx]) {
			largestIdx = leftChildIdx;
		}
		if(rightChildIdx <= lastIdx && arr[rightChildIdx] > arr[largestIdx]) {
			largestIdx = rightChildIdx;
		}
		
		if(largestIdx != parentNode) {
			swap(arr,largestIdx,parentNode);
			heapify(arr,largestIdx,lastIdx);
		}
		
		
	}
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		// 1. 첫번째 입력값(앞으로 나올 수의 길이)를 정수형으로 바꾸는 작업
		int arrLength = Integer.parseInt(br.readLine());
		
		// 2. int형 배열을 만든 후, 각각의 입력값(String)을 int 배열에 넣어준다.
		int[] arr = new int[arrLength];
		for(int i = 0; i<arrLength;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//정렬되기 전 배열! arr임
		sort(arr,arrLength);
			
	}

}
