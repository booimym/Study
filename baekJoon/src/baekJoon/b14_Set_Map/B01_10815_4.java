package baekJoon.b14_Set_Map;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * 이진탐색을 이용해보겠어요.
 *
 */
public class B01_10815_4 {
	
	//병합정렬에 이용할 배열
	static int[] copyArr;
	
	public static void swap (int[] arr, int a , int b) {
		
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
	
	public static void divide(int[] arr, int start, int end) {
		
		if(start == end) {
			return;
		}
		
		int mid = (start + end ) / 2 ;
		
		divide(arr, start , mid);
		divide(arr, mid+1 , end);
		merge(arr, start, mid, end);
		
	}

	public static void merge(int[] arr, int start, int mid, int end) {
		
		int left = start;
		int right = mid+1;
		int index = start;
		
		// ▲ 실수 : left <= mid || right <= end 라고 씀....
		// 그러면 둘 중 하나가 넘어가도 집어넣어진다는 거니까...안돼...
		while (left <= mid && right <= end) {
			
			if(arr[left] > arr[right]) {
				copyArr[index++] = arr[right++];
			} else {
				copyArr[index++] = arr[left++];
			}
			
		}
		//한 쪽만 먼저 다 찼을 경우... 나머지 넣어주기...
		if(left > mid ) {
			while(right <= end) {
				copyArr[index++] = arr[right++];
			}
		}
		
		if(right > end) {
			while(left <= mid) {
				copyArr[index++] = arr[left++];
			}
		}
		//정렬된 copyArr를 arr에 다시 넣어주기
		for(int i = start ; i <= end ; i++) {
			arr[i] = copyArr[i];
		}
		
	}
	
	//------------------------------------------------------------------------
	
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//1. 상근이의 카드의 개수
		int sangNum = Integer.parseInt(br.readLine());
		
		//2. 상근이의 카드를 배열에 담는다.
		int[] arr = new int[sangNum];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for(int i = 0; i < sangNum; i++) {
			arr[i] = Integer.parseInt(st1.nextToken());
		}
		
		//이진탐색을 이용하기 위해 arr를 정렬한다.
		//[병합정렬] 이용. 
		copyArr = new int[sangNum];
		divide(arr,0,sangNum-1);
		
		//3. 특정한 숫자카드를 입력받음과 동시에 상근이의 카드와의 일치여부를 비교하는 for문을 작성해보기!
		//Map<Integer, Integer> map = new HashMap<>();
		
		//3-1. 총 카드의 개수
		int randomCard = Integer.parseInt(br.readLine());
		int[] arr2 =   new int[randomCard];
		int[] answer = new int[randomCard];
		
		//3-2. 입력을 받는다.  
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i = 0; i < randomCard; i++) {
			arr2[i] = Integer.parseInt(st2.nextToken());
			answer[i] = binarySearch(arr,0,sangNum-1,arr2[i]);
			
		}
		
		for(int i = 0; i < randomCard; i++) {
			bw.write(answer[i]+" ");
		}
		bw.close();
		
	}
	
	//------------------------------------------------------------------------
	
	/**
	 * 이진탐색 메서드
	 */
	public static int binarySearch(int[] arr, int low, int high, int key) {
		//System.out.println(low);
		//System.out.println(high);
		while (low <= high) {
			//System.out.println("while문시작");
		    int mid = low + (high-low) / 2;
		    //System.out.println(mid);
		    if (arr[mid] == key) // 종료 조건1 검색 성공.
		      return 1; 
		    else if (arr[mid] > key) 
		      high = mid - 1;      
		    else 
		      low = mid + 1;
		    //System.out.println("while문끝");
		}
			  
		
		return 0; // 종료 조건2 (low > high) 검색 실패.
	}

}
