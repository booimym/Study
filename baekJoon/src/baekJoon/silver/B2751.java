package baekJoon.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B2751 {

	static void divide(int[] arr, int start, int end , int[] copyArr) {
		
		if(start == end) {
			System.out.println("[원소가 하나니.. 리턴] = 인덱스 ["+start+"]의 원소는 : " +arr[start]);
			return;
		}
		
		int mid = (start + end)/2;
		System.out.println("분할!");
		System.out.println("start :" + start);
		System.out.println("mid :" + mid);
		System.out.println("end :" + end);
		divide(arr,start,mid,copyArr);
		divide(arr,mid+1,end,copyArr);
		
		merge(arr,start,mid,end,copyArr);
		
	}
	static void merge(int[] arr, int start, int mid, int end, int[] copyArr) {
		System.out.print("left배열 : ");
		for(int i = start; i <= mid ; i++) {
			System.out.print(arr[i]);
			if(i != mid) {
				System.out.print(",");
			}else {
				System.out.println();
			}
		}
		System.out.print("right배열 : ");
		for(int i = mid+1; i <= end ; i++) {
			System.out.print(arr[i]);
			if(i != end) {
				System.out.print(",");
			}else {
				System.out.println();
			}
		}
		//System.out.println(Arrays.toString(arr));
		int left = start;
		int right = mid+1;
		int index = start;
		
		while (left <= mid && right <= end) {
			
			if(arr[left]>arr[right]) {
				
				copyArr[index] = arr[right];
				right++;
				index++;
				System.out.println();
			}else {
				copyArr[index] = arr[left];
				left++;
				index++;
			}
			
			System.out.print("중간 점검 + copyArr배열 : ");
			System.out.println(Arrays.toString(copyArr));
		}
		
		if(left <= mid ) {
			System.out.println("오른쪽이 먼저 다 찼을 경우");
			for(int i = left ; i <= mid; i++) {
				copyArr[index] = arr[i];
				index++;
			}
			System.out.println(Arrays.toString(copyArr));
		}
		
		if(right <= end ) {
			System.out.println("왼쪽이 먼저 다 찼을 경우");
			for(int i = right ; i <= end; i++) {
				copyArr[index] = arr[i];
				index++;
			}
			System.out.println(Arrays.toString(copyArr));
		}
		
		//arr에 정렬된만큼 넣어줘야 기존배열 + 기존배열 합병할 때 순서대로 정렬 가능
		for(int i = start; i <= end ; i++) {
			arr[i] = copyArr[i];
		}
		
		
	}
	
	static void mergeTry_fail(int[] arr, int start, int mid, int end, int[] copyArr) {
		System.out.println("-----이제 합병들어갑니다.-----");
		int arr1start = start;
		int arr1end = mid;
		int arr2start = mid+1;
		int arr2end = end;
		int ii = start;
		
//		while(arr[arr1start]>arr[arr2start] && arr2start<=arr2end) {
//			System.out.println("[오른쪽 배열의 ");
//			copyArr[i] = arr[arr2start];
//			i++;
//			arr2start++;
//		}
//		
//		while(arr[arr2start]>arr[arr1start] && arr1start<=arr1end) {
//			copyArr[i] = arr[arr1start];
//			i++;
//			arr1start++;
//		}
		
		//----------------------------------------------------------------//
		
		StringBuilder sb1 = new StringBuilder();
		sb1.append("왼쪽 배열 :");
		for(int i = start; i <= mid ; i++) {
			sb1.append(arr[i]+",");
		}
		System.out.println(sb1.toString());
		StringBuilder sb2 = new StringBuilder();
		sb2.append("오른쪽 배열 :");
		for(int i = mid+1; i <= end ; i++) {
			sb2.append(arr[i]+",");
		}
		System.out.println(sb2.toString());
		
		//시도 1 - 실패
//		while(ii<=end) {
//			System.out.println("ㅎㅇ");
//			if(arr[arr1start]>arr[arr2start]) {
//				copyArr[ii] = arr[arr2start];
//				System.out.println("오른쪽 배열값 ("+arr[arr2start]+")이 인덱스 ["+ii+"]에 들어갑니다.");
//				ii++;
//				arr2start++;
//			} else {
//				copyArr[ii] = arr[arr1start];
//				System.out.println("왼쪽 배열값 ("+arr[arr1start]+")이 인덱스 ["+ii+"]에 들어갑니다.");
//				ii++;
//				arr1start++;
//			}
			
//			if(arr[arr2start]>arr[arr1start]) {
//				
//			}
			
//		}
		
		for (ii = start; ii <=end ; ii++) {
			System.out.println("------------------");
			System.out.println("현재 arr1start :" + arr1start);
			System.out.println("현재 arr1start의 값 :" + arr[arr1start]);
			System.out.println("현재 arr1end :"+ arr1end);
			System.out.println("현재 arr1end의 값 :" + arr[arr1end]);
			System.out.println("현재 arr2start :"+ arr2start);
			System.out.println("현재 arr2start의 값 :" + arr[arr2start]);
			System.out.println("현재 arr2end :" + arr2end);
			System.out.println("현재 arr2end의 값 :" + arr[arr2end]);
			System.out.println("------------------");
			System.out.println("------------------");
			
			if(arr[arr1start]>arr[arr2start] && arr2start<=arr2end) {
				copyArr[ii] = arr[arr2start];
				System.out.println("오른쪽 배열의 인덱스 "+arr2start+"값 ("+arr[arr2start]+")이 인덱스 ["+ii+"]에 들어갑니다.");
				//ii++;
				arr2start++;
				System.out.println("arr2start 증가...");
			} 
			
			if(arr[arr2start]>arr[arr1start] && arr1start<=arr1end) {
				copyArr[ii] = arr[arr1start];
				System.out.println("왼쪽 배열의 인덱스 "+arr1start+"값 ("+arr[arr1start]+")이 인덱스 ["+ii+"]에 들어갑니다.");
				//ii++;
				arr1start++;
				System.out.println("arr1start 증가...");
			}
		}	
			//만약에 오른쪽 배열이 먼저 다 채워졌을 경우...
			if(arr2start>arr2end) {
				copyArr[ii] = arr[arr1start];
				System.out.println("왼쪽 배열의 인덱스 "+arr1start+"값 ("+arr[arr1start]+")이 인덱스 ["+ii+"]에 들어갑니다.");
				//ii++;
				arr1start++;
				System.out.println("arr1start 증가...");
			}
			
			//만약에 왼쪽 배열이 먼저 다 채워졌을 경우...
			if(arr1start>arr1end) {
				copyArr[ii] = arr[arr2start];
				System.out.println("오른쪽 배열의 인덱스 "+arr2start+"값 ("+arr[arr2start]+")이 인덱스 ["+ii+"]에 들어갑니다.");
				//ii++;
				arr2start++;
				System.out.println("arr2start 증가...");
			}
			

			
		
		
		
		
		
		System.out.println(Arrays.toString(copyArr));
		System.out.println("----합병 끝----");
		
	}
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 정렬되기 전 배열 만들기
		int arrLength = Integer.parseInt(br.readLine());
		int[] arr = new int[arrLength];
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int[] copyArr = new int[arrLength]; 
		//-----------------------------------------------------------------------//
		
		divide(arr,0,arrLength-1,copyArr);
		System.out.println("답");
		for(int i = 0 ; i < arr.length ; i++) {
			bw.write(arr[i]+"\n");
		}
		 bw.close();
	}

}
