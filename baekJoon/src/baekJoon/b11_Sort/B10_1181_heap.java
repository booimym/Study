package baekJoon.b11_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B10_1181_heap {

	// 중복 제거된 배열 선언
	static String arr[];

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int inputN = Integer.parseInt(br.readLine());

		// 중복 된 값 넣는 배열 선언
		String inputArr[] = new String[inputN];

		// 중복여부
		boolean duplicate = false;
		// 중복 갯수 카운트
		int count = 0;
		// 배열길이 구하는용도
		int indexN = 0;

		// 배열의 길이만큼 값 넣어주기
		for (int i = 0; i < inputArr.length; i++) {
			inputArr[i] = br.readLine();

			// 배열에 값 넣을때 중복 값 갯수 구하기
			for (int j = 0; j < i; j++) {

				// 중복일시 카운트 증가
				if (inputArr[i].equals(inputArr[j])) {
					count++;
					break;
				}
			}
		}

		// 중복 제거된 배열 길이 할당
		arr = new String[inputN - count];

		// 중복 제거
		for (int x = 0; x < inputArr.length; x++) {

			// 0번 인덱스 비교할 값이 없으므로 0번 인덱스 아닐때 조건 추가
			if (x != 0) {

				for (int j = 0; j < x; j++) {

					// 중복일때
					if (inputArr[x].equals(inputArr[j])) {
						duplicate = true;
						indexN--;
						break;

					} else { // 중복이 아닐때
						duplicate = false;
					}
				}
				indexN++;
			}
			if (duplicate == false) {
				arr[indexN] = inputArr[x];
			}
		}

		// 힙정렬 코드
		// 아스키코드 이용하여 비교
		// 길이가 짧은것부터
		// 길이가 같으면 사전순

		// 문자열 charat으로 하나씩잘라서 길이 확인
		// 길이가 같다면 아스키 코드로변환 앞자리부터 비교
		heapsort();

		System.out.println("---------");

		// 출력문
		for (int i = 0; i < arr.length; i++) {
			bw.write(arr[i] + "\n");
		}
		// 출력 후 스트림 닫기
		bw.close();
	}
	
	/** 힙 정렬
	 * 
	 */
	public static void heapsort() {
		
		int size =arr.length;
		
		// 예외처리
		if (size <2) {
			return;
		}
		
		// 마지막 인덱스 부모 구하기
		int parentIdx = ((size-1)-1)/2;
		
		// 힙만들기
		for (int i = parentIdx; i >=0; i--) {
			// 부모노드(i)를 1씩 줄이면서 힙조건 만족되도록 구성하기
			heapify(i, size-1);
		}
		
		// 힙정렬하기
		for (int i = size -1; i >0; i--) {
			swap(0, i);
			heapify(0, i-1);
		}
	}


	/** 힙 만들기
	 * @param parentIdx
	 * @param lastIdx
	 */
	private static void heapify(int parentIdx, int lastIdx) {
		// 자식 노드 구하기
		int leftChildIdx = 2 * parentIdx + 1;
		int rightChildIdx = 2 * parentIdx + 2;
		// 비교용 값 선언
		int largestIdx = parentIdx;
		
		// leftChild노드 와 비교
		if (leftChildIdx<=lastIdx && arr[leftChildIdx].length() >= arr[largestIdx].length()) {
			
			// 문자열 길이가 같을때
			if(arr[leftChildIdx].length() == arr[largestIdx].length()) {
				
				// compareTo 를 이용하여  leftChildIdx 값이 더 작다면
				if (arr[leftChildIdx].compareTo(arr[largestIdx])<arr[largestIdx].compareTo(arr[leftChildIdx])) {

				}else {
					largestIdx=leftChildIdx;
				}
			}else { // 문자열 길이가 같지 않을때
				largestIdx=leftChildIdx;
			}
			
		}
		
		// rightChild노드 와 비교
		if (rightChildIdx<=lastIdx && arr[rightChildIdx].length() >= arr[largestIdx].length()) {
			
			// 문자열 길이가 같을때
			if(arr[rightChildIdx].length() == arr[largestIdx].length()) {
				
				if (arr[rightChildIdx].compareTo(arr[largestIdx])<arr[largestIdx].compareTo(arr[rightChildIdx])) {
					
				}else {
					largestIdx = rightChildIdx;
				}
			}else { // 문자열 길이가 같지 않을때
				largestIdx = rightChildIdx;
			}
		}
		
		
		// largestIdx 원소가 변경 됬다면 스위치 
		if (largestIdx != parentIdx) {
			swap(largestIdx, parentIdx);
			heapify(largestIdx, lastIdx);
		}
		
	}

	/** 인덱스 원소 바꾸기
	 * @param largestIdx
	 * @param parentIdx
	 */
	private static void swap(int i, int j) {
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	} 
	
}
