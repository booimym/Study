package baekJoon.silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class B1181 {
	
	static String[] stringArr;
	static int[] copyArr;
	
	static void divide(int[] arr, int start, int end ) {
		System.out.println("분할");
			
			if(start == end) {
				return;
			}
			
			int mid = (start + end)/2;
			divide(arr,start,mid);
			divide(arr,mid+1,end);
			
			merge(arr,start,mid,end);
			
		}
	
	static void merge(int[] arr, int start, int mid, int end) {

		int left = start;
		int right = mid+1;
		int index = start;
		
		while (left <= mid && right <= end) {
			
			//오름차순일 경우
			if(arr[left] > arr[right]) {
			//내림차순일 경우
			//if(arr[left]<arr[right]) {
				
				copyArr[index] = arr[right];
				right++;
				index++;
				//System.out.println();
			}else if(arr[left] < arr[right]) {
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
						
						System.out.println("이거따문임?");
						continue;
					}
					
					if(i>=leftCharArr.length) {
						System.out.println("bye...");
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
		
		stringArr = new String[index];
		int[] intArr = new int[index];
		for(int i = 0 ; i < index ; i++) {
			String temp =  br.readLine();
			//입력받을 때, 같으면 입력 ㄴㄴㄴㄴ
			System.out.println("포문 i값 ="+i);
			
			if(i==0) {
				stringArr[i] = temp;
				System.out.println("배열 확인 "+Arrays.toString(stringArr));
			} else {
				
				for(int j = 0 ; j < i ; j++ ) {
					
					if(stringArr[j].equals(temp)) {
						System.out.println("----------if");
						System.out.println("포문 j값 ="+j);
						break;
					} else {
						System.out.println("----------elses");
						stringArr[i] = temp;
						intArr[i] = stringArr[i].length();
					}
						
				}
				System.out.println("배열 확인 "+Arrays.toString(stringArr));
			}
			
			
		}
		System.out.println("배열 확인 "+Arrays.toString(stringArr));
		//병합으로 일단 풀까?
		//글자 수가 같을 경우, 사전 순으로 정렬하기
		
		copyArr = new int[intArr.length]; 
		
		divide(intArr,0,intArr.length-1);
		
		//-----------------------------------------------------------------------//
		
		for(int i = 0 ; i < intArr.length ; i++) {
			bw.write(intArr[i]);
		}
		 bw.close();
	}

}
