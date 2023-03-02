package baekJoon.b11_Sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 단어 정렬 문제 (최종 답안) + 김효동이 쓴 compareTo메소드를 이용해보자!
 *
 */
public class B1181_4 {

	static String[] stringArr;
	static String[] copyArr;
	
	
	static void divide(String[] arr, int start, int end ) {
		//System.out.println("분할");
			
			if(start == end) {
				return;
			}
			
			int mid = (start + end)/2;
			divide(arr,start,mid);
			divide(arr,mid+1,end);
			
			merge(arr,start,mid,end);
			
		}
	
	static void merge(String[] arr, int start, int mid, int end) {
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
			} else if(arr[left].length() < arr[right].length()) {
				copyArr[index] = arr[left];
				left++;
				index++;
				
			//같을 경우!!
			} else { // arr[left].length() == arr[right].length()인 경우!
			//-----------------------------------------------------------------------
				int compare = stringArr[left].compareTo(stringArr[right]);
				System.out.println("왼쪽은"+stringArr[left]);
				System.out.println("오른쪽은"+stringArr[right]);
				
				//만약에 left가 더 크다면...
				if(compare > 0) {
					copyArr[index] = arr[right];
					right++;
					index++;
					
				} else  {
					copyArr[index] = arr[left];
					left++;
					index++;
				}	
					
				
			//------------------------------------------------------------------------
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
		int count = 0;
		for(int i = 0 ; i < index ; i++) {
			
			firstArr[i] = br.readLine();
			//System.out.println(i+"번째 for문이 돌아갑니당...");
			//----------------------------------------------------
			if(i == 0) {
			} else {
				//기존것들과 비교?
				for(int j = 0 ; j < i ; j++ ) {
					//System.out.println("현재 " +firstArr[j]+"와"+firstArr[i]+"를 비교");
					//기존것과 같다면, 
					if(firstArr[j].equals(firstArr[i])) {
						//System.out.println("같을 경우");
						count++;
						break;
					} else {
						//System.out.println("다를 경우");
					}
				}
				//System.out.println(i+"의 for문 끝");
			}
			//System.out.println("gd");
			//----------------------------------------------------
		}
//		System.out.println(count);
//		System.out.println("문자열...");
		//(1) 배열을 set으로 변환
		//Set<String> stringSet = new HashSet<>(Arrays.asList(firstArr));
		//set을 배열로 변환
		//stringArr = stringSet.toArray(new String[0]);
		
		//(2) Stream을 이용...
		//stringArr = Arrays.stream(firstArr).distinct().toArray(String[]::new);
		
		//(3) for문을 이용해 중복없는 새로운 배열을 만들어보자!
		stringArr = new String[index-count];
		boolean flag = false;
		//새로운 배열에 집어 넣을 때, 중복된 값은 집어넣지 않도록 하는 용도.
		int k = 0; 
		for(int i = 0 ; i < index ; i++) {
			
			if(i == 0) {
				flag = true;
			} else {
				//기존것들과 비교?
				for(int j = 0 ; j < i ; j++ ) {
					//System.out.println("현재 " +firstArr[j]+"와"+firstArr[i]+"를 비교");
					//기존것과 같다면, 
					if(firstArr[j].equals(firstArr[i])) {
						//System.out.println("같을 경우");
						flag = false;
						k--;
						break;
					} else {
						//System.out.println("다를 경우");
						//stringArr[i] = firstArr[i];
						flag = true;
					}
				}
				k++;
			}
			if(flag) {
				//System.out.println("k는 " + k);
				stringArr[k] = firstArr[i];
				//System.out.println("stringArr 집어넣어진 값  :" + stringArr[k]);
			}
		}
		 
		//System.out.println(Arrays.toString(stringArr));
		copyArr = new String[stringArr.length];
		
//		int[] intArr = new int[stringArr.length];
//		for(int i = 0 ; i < intArr.length; i++) {
//			intArr[i] = stringArr[i].length();
//		}
		//System.out.println(Arrays.toString(stringArr));
		//System.out.println(Arrays.toString(intArr));
		
		divide(stringArr,0,stringArr.length-1);
		
		
		
		
		
		
		//-----------------------------------------------------------------------//
		
		for(int i = 0 ; i < stringArr.length ; i++) {
			bw.write(stringArr[i]+"\n");
		}
		 bw.close();
	}

}
