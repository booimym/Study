package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class newPractice {

static int[] myFirstQuickSort(int[] arr , int start, int end) {
		
		int pivot = start;
		//System.out.println("태초의 arr[pivot]값은"+arr[pivot]);
		int left = start + 1;
		int right = end;
		
		//분할 후 원소가 하나일 경우는 정렬하지 않는다. (처리안해주면 에러남)
//		if(start>=end) {
//			return arr;
//		};
		while(left <= right) {

			
			while(left <= end && arr[pivot] > arr[left]) {
				left++;
				//System.out.println("left++되어서 left는 " + left);
			}
			while(right > start && arr[right] > arr[pivot]) {
				//System.out.println("arr[right]"+arr[right]);
				//System.out.println("arr[pivot]"+arr[pivot]);
				right--;
				//System.out.println("right--되어서 right은 " + right);
			}
			
			if((left <= right && arr[pivot] < arr[left] && arr[right] < arr[pivot])) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				//System.out.println("----둘다 멈춤----");
				//System.out.println("기존 left인덱스 "+left+"와 right인덱스 "+right);
				left++;
				right--;
				//System.out.println("바뀐 left인덱스 "+left+"와 right인덱스 "+right);
				//System.out.println("-------------------");
			}
			
		}
		//switch
		int temp = arr[pivot];
		//■ point3  : pivot에다가 자꾸 입력하니까 안 되지...
		arr[pivot] = arr[right];
		arr[right] = temp;
		
		myFirstQuickSort( arr , start ,  right-1) ;
		myFirstQuickSort( arr , right+1,  end) ;
		
		
		
		
		//정렬된 배열을 return해줘야 하나?
		return arr;
	}
	
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1. 첫번째 입력값(앞으로 나올 수의 길이)를 정수형으로 바꾸는 작업
		int number = Integer.parseInt(br.readLine());
		
		// 2. int형 배열을 만든 후, 각각의 입력값(String)을 int 배열에 넣어준다.
		int[] arr = new int[number];
		for(int i = 0; i<number;i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		
	
		myFirstQuickSort(arr , 0 , arr.length-1);
	
		
		// 4. 정렬된 배열 원소들을 하나씩 꺼낸다.
		for(int i = 0; i<number;i++) {
			System.out.println(arr[i]);
		}
		

			
		
		
		
		
		
		
		
		
	}

}
