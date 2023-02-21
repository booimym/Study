package baekJoon.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B1427 {
	static void divide(int[] arr, int start, int end , int[] copyArr) {
			
			if(start == end) {
				return;
			}
			
			int mid = (start + end)/2;
			divide(arr,start,mid,copyArr);
			divide(arr,mid+1,end,copyArr);
			
			merge(arr,start,mid,end,copyArr);
			
		}
	
	static void merge(int[] arr, int start, int mid, int end, int[] copyArr) {

		int left = start;
		int right = mid+1;
		int index = start;
		
		while (left <= mid && right <= end) {
			
		//오름차순일 경우
		//if(arr[left]>arr[right]) {
		//내림차순일 경우
		if(arr[left]<arr[right]) {
				
				copyArr[index] = arr[right];
				right++;
				index++;
				//System.out.println();
			}else {
				copyArr[index] = arr[left];
				left++;
				index++;
			}
			
			//System.out.print("중간 점검 + copyArr배열 : ");
			//System.out.println(Arrays.toString(copyArr));
		}
		
		if(left <= mid ) {
			//System.out.println("오른쪽이 먼저 다 찼을 경우");
			for(int i = left ; i <= mid; i++) {
				copyArr[index] = arr[i];
				index++;
			}
			//System.out.println(Arrays.toString(copyArr));
		}
		
		if(right <= end ) {
			//System.out.println("왼쪽이 먼저 다 찼을 경우");
			for(int i = right ; i <= end; i++) {
				copyArr[index] = arr[i];
				index++;
			}
			//System.out.println(Arrays.toString(copyArr));
		}
		
		//arr에 정렬된만큼 넣어줘야 기존배열 + 기존배열 합병할 때 순서대로 정렬 가능
		for(int i = start; i <= end ; i++) {
			arr[i] = copyArr[i];
		}
		
		
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 정렬되기 전 배열 만들기
		
		String[] stringArr = br.readLine().split("");
		int[] arr = new int[stringArr.length];
		for(int i = 0 ; i < stringArr.length ; i++) {
			
			arr[i] = Integer.parseInt(stringArr[i]);
			
		}
		
		int[] copyArr = new int[arr.length]; 
		
		//-----------------------------------------------------------------------//
		
		divide(arr,0,arr.length-1,copyArr);
		
		for(int i = 0 ; i < arr.length ; i++) {
			bw.write(String.valueOf(arr[i]));
		}
		 bw.close();
	}

}
