package baekJoon.b11_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class B1181_2 {

	static String[] stringArr;
	//static String[] copyArr;
	
	static void divide(String[] arr, int start, int end , String[] copyArr) {
		//System.out.println("분할");
			
			if(start == end) {
				return;
			}
			
			int mid = (start + end)/2;
			divide(arr,start,mid,copyArr);
			divide(arr,mid+1,end,copyArr);
			
			merge(arr,start,mid,end,copyArr);
			
		}
	
	static void merge(String[] arr, int start, int mid, int end,String[] copyArr) {
		//System.out.println("합병");
		int left = start;
		int right = mid+1;
		int index = start;
		
		while (left <= mid && right <= end) {
			
			//오름차순일 경우
			if(arr[left].length() > arr[right].length()) {
			//내림차순일 경우
			//if(arr[left]<arr[right]) {
				
				copyArr[index] = arr[right];
				right++;
				index++;
				//System.out.println();
			}else if(arr[left].length() < arr[right].length()) {
				copyArr[index] = arr[left];
				left++;
				index++;
				
			//같을 경우!!
			}else {
				System.out.println("같을 경우");
				System.out.println(stringArr[left]);
				System.out.println(stringArr[right]);
				//arr[left] = arr[right]일 경우....
				char[] leftCharArr = stringArr[left].toCharArray();
				char[] rightCharArr = stringArr[right].toCharArray();
				
				//각각의 char를 int로 변환한 다음 비교하기?
				for(int i = 0 ; i < leftCharArr.length ; i++) {
					System.out.println(i);
					//만약에 left가 더 크다면...
					if(leftCharArr[i] - '0' > rightCharArr[i] - '0') {
						copyArr[index] = arr[right];
						right++;
						index++;
					} else if(leftCharArr[i] - '0' < rightCharArr[i] - '0') {
						copyArr[index] = arr[left];
						left++;
						index++;
					} else {
						//여기서 left든 right든 올라가지 않기 때문에
						//무한반복에 걸리는 거였음...
						
						//System.out.println("이거따문임?");
						continue;
					}
					
					if(i>=leftCharArr.length) {
						///System.out.println("bye...");
						break;
					}
				}
				
				
				
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
		
		//문자열 배열을 만들어서 집어넣고, 글자수 배열도 만들..어???
		int index = Integer.parseInt(br.readLine());
		
		String[] firstArr = new String[index];
		
		for(int i = 0 ; i < index ; i++) {
			
			firstArr[i] = br.readLine();
		}
		
		//배열을 set으로 변환
		Set<String> stringSet = new HashSet<>(Arrays.asList(firstArr));
		
		//set을 배열로 변환
		stringArr = stringSet.toArray(new String[0]);
		String[] copyArr = new String[stringArr.length];
		
//		int[] intArr = new int[stringArr.length];
//		for(int i = 0 ; i < intArr.length; i++) {
//			intArr[i] = stringArr[i].length();
//		}
		System.out.println(Arrays.toString(stringArr));
		//System.out.println(Arrays.toString(intArr));
		
		divide(stringArr,0,stringArr.length-1,copyArr);
		
		//-----------------------------------------------------------------------//
		
		for(int i = 0 ; i < stringArr.length ; i++) {
			bw.write(stringArr[i]+"\n");
		}
		 bw.close();
	}

}
