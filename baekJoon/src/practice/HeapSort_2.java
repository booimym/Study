package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class HeapSort_2 {

	public static void heapSort() {
		
	    int size = 6;
	    int[] heap = {3,7,5,4,2,8};
	    
	    //1.  최초 힙 만들기
	    for(int i = 1; i < heap.length; i++) {
	        
	        // 자식 노드 인덱스
	        int child = i;
	        do {
	            // 부모 노드 인덱스
	            int parent = (child - 1) / 2;
	            
	            // 자식 노드가 더 크다면
	            if(heap[parent] < heap[child]) {
	                // 위치 교환
	                int temp = heap[parent];
	                heap[parent] = heap[child];
	                heap[child] = temp;
	            }
	            child = parent;
	        } while(child != 0);
	    }
	    
	    // 크기를 줄여가며 하향 선별을 사용하여 정렬
	    for(int i = size - 1; i >= 0; i--) {
	        // 마지막 노드와 루트 노드의 위치 교환
	        int temp = heap[0];
	        heap[0] = heap[i];
	        heap[i] = temp;
	        int root = 0;
	        int child = 1;
	        
	        do {
	            // 왼쪽 자식 노드의 인덱스 구하기
	            child = root * 2 + 1; // root 가 0 일 때 1부타 시작하기 위한 + 1
	            // 왼쪽 자식 노드 보다 오른쪽이 크다면
	            if(child < i - 1 && heap[child] < heap[child + 1]) {
	                // 오른쪽 자식 노드로 갱신
	                child++;
	            }
	            
	            // 자식 노드가 루트노드보다 크다면
	            if(child < i && heap[root] < heap[child]) {
	                // 위치 교환
	                temp = heap[root];
	                heap[root] = heap[child];
	                heap[child] = temp;
	            }
	            // 루트 노드 위치 갱신
	            root = child;
	        } while(child < i);
	    }
	    
	    // 결과 출력
	    for(int i =0; i< heap.length; i++) {
	        System.out.printf("%d ", heap[i]);
	    }
	}
	
	public static void main(String[] args) throws IOException {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		// 정렬되기 전 배열 만들기
//		int arrLength = Integer.parseInt(br.readLine());
//		int[] arr = new int[arrLength];
//		for(int i = 0; i<arrLength;i++) {
//			arr[i] = Integer.parseInt(br.readLine());
//		}
//		
//		
//		
//		for(int i = 0; i<arrLength;i++) {
//			System.out.println(arr[i]);
//		}
		
		heapSort();

	}

}
