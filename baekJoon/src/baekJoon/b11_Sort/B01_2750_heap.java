package baekJoon.b11_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B01_2750_heap {
	
	
	public static void sort(int[] arr, int arrLength) {
		
		if(arrLength < 2) {
			return;
		}
		
		//마지막 인덱스의 부모 노드 찾기
		int parentNode = (arrLength-1)-1/2;
		
		//[과정 1] 최대힙 만들기
		//트리의 밑에서부터 정렬 들어간다.
		for(int i = parentNode ; i >= 0; i--) {
			//▲ 틀린 부분  : heapify(arr,parentNode,arrLength-1);			
			heapify(arr,i,arrLength-1);			
		}
		
		//[과정 2] 오름차순 정렬하기
		/*	최대 힙은 항상 root노드(최상위 노드)는 최댓값을 갖고있다는 것이다. 
			이를 이용하여 최댓값을 하나씩 삭제하면서 배열의 맨 뒤부터 채워나가면된다.*/
		for(int i = arr.length-1 ; i >= 1 ; i--) {
			
			/*(1) 	배열의 root노드(0)에 있는 값과 배열 맨 끝에 있는 값을 바꾼다.
					그러면 배열 맨 끝 값 == 최대값이 되겠지? */
			swap(arr, i,0);
			
			/*(2) 	맨 끝 값을 제외한 다음, 그러면 이제 최대 힙이 깨졌으니까 다시 최대 힙을 만들기!
				 	근데 인덱스[0]에 있는 값만 바뀐 거니까 (아래부분은 다 정렬이 되어있기 때문에)
				 	0을 루트 노드로 하는 힙만 최대 힙으로 만들면 됨. */
			//▲ 틀린 부분  : heapify(arr, i, arr.length - 1);
			heapify(arr, 0, i - 1);
		}
		
	}
	
	/**
	 * 값 바꾸는 메소드
	 */
	public static void swap(int[] arr,int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	/**
	 * 최대힙 만드는 메소드 (기존 배열, 루트 노드, 배열의 마지막 인덱스)
	 */
	public static void heapify(int[] arr, int parentNode, int lastIdx) {
		
		int leftChildIdx = parentNode * 2 + 1;
		int rightChildIdx = parentNode * 2 + 2;
		int largestIdx = parentNode;
		
		/* 최대인덱스를 벗어나면 안된다는 조건 & 
		 자식 인덱스의 값이 더 크면 값을 바꾼 후, (그럼 자식 인덱스에 그 작은 값이 들어가겠지?)
		 그러면 작은 값을 갖게 된 <<그 자식 인덱스>>를 기준으로 또다시 정렬 들어가야 되니까
		 largestIdx라는 변수에다가 자식 인덱스를 넣어주기 */
		if(leftChildIdx <= lastIdx && arr[leftChildIdx] > arr[largestIdx]) {
			largestIdx = leftChildIdx;
		}
		if(rightChildIdx <= lastIdx && arr[rightChildIdx] > arr[largestIdx]) {
			largestIdx = rightChildIdx;
		}
		
		//★★ if문 넣어주기! ★★ //
		/*  <<자식인덱스의 값이 더 큰 경우에만!!>>
			(1) 값을 바꾸고, (2) 자식인덱스를 기준으로 정렬들어가야 됨 */
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
		
		//출력
		for(int i = 0; i<arrLength;i++) {
			System.out.println(arr[i]);
		}
			
	}

}
