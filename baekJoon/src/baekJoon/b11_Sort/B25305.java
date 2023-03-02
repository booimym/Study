package baekJoon.b11_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B25305 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// split()을 써보자
		
		// 응시자 수 & 상을 받는 사람의 수
		String[] arr = br.readLine().split(" ");
		
		int total = Integer.parseInt(arr[0]);
		int prize = Integer.parseInt(arr[1]);
		
		// 학생들의 점수 모음
		String[] arr2 = br.readLine().split(" ");
		// 숫자로 정렬해야 되니까 숫자 배열로 바꿔준다...
		// 방법1
		Integer[] intArr = new Integer[arr2.length];
		for(int i = 0 ; i < intArr.length; i++) {
			intArr[i] = Integer.parseInt(arr2[i]);
			
		}
		//방법2
//		 Integer[] intArr = Stream.of(arr).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);
		
		// 내림차순 정렬
		//Arrays.sort(intArr, Collections.reverseOrder());
		Arrays.sort(intArr);
		
		//System.out.println(Arrays.toString(intArr));
	
		//System.out.println(intArr[Integer.parseInt(arr[1])-1]);
//		System.out.println(intArr[total-prize]);
		System.out.println(intArr[Integer.parseInt(arr[0])-Integer.parseInt(arr[1])]);
	
	

	
		
	}

}
