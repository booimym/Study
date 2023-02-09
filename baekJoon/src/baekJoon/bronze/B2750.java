package baekJoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;


public class B2750 {
	
	static int[] selectSort(int[] arr) {
		
		// 1~(n-1)번째 위치의 값과 나머지를 비교할 것임(n번째 위치는 나머지가 없으니까...)
		for(int i = 0; i < arr.length-1 ; i++) {
					
					//int temp_i = arr[i]; //배열 i번째 위치의 초기값
					System.out.println("-------------------------------");
					System.out.println(i+"번째 위치의 초기값은"+arr[i]);
					//System.out.println(i+"번째 위치의 초기값은"+arr[i]);
					//int tempNum;
					
					
					// ■ 실수1: arr.length까지 비교를 해야하는데, arr.length-1로 해서 맨 뒤의 원소는 비교를 못했었다.
					for(int j = i+1; j < arr.length ; j++) {
						
						if(arr[j] < arr[i]) {
							System.out.println("만약 뒤의 원소"+arr[j]+"들이 " + i + "번째 위치의 초기값" +  arr[i] + "보다 작을 경우 나옵니다.");
							//System.out.println("아 근데"+ arr[i]+"이랑"+temp_i+"는 값이 같지?");
							//먼저 arr[i]값을 임시변수에다가 저장해놓고
							//tempNum = temp_i;
							//System.out.println("임시 변수에다가 넣는  " +i+"번째 위치의 초기값" + tempNum);
							//
							
							//■ 실수 2 : 임시변수를 이상하게 설정해놔서...
							int temp_i = arr[i];
							arr[i] = arr[j];
							arr[j] = temp_i;
							System.out.println("이제 " + i +"번째 인덱스의 값은" + arr[i]);
							System.out.println("이제 " + j +"번째 인덱스의 값은" + arr[j]);
							
							
						} else {
							System.out.println("만약 뒤의 원소"+arr[j]+"들이 " + i + "번째 위치의 초기값" + arr[i] + "보다 클 경우 나옵니다.");
						}
					
						System.out.println(Arrays.toString(arr));
					}
				}
				
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
		
		//일단 기존 배열 보자...
		System.out.println(Arrays.toString(arr));
		
		// 3-1. 오름차순 정렬 [방법1] 주어진 함수 쓰기
		//Arrays.sort(arr);
		
		// 3-2. 오름차순 정렬 [방법2] 선택 정렬
		//selectSort(arr);
		
		// 3-3. 오름차순 정렬 [방법3] 삽입 정렬
		
		// (1) 2번째 위치 ~ n번째 위치일 때, 앞 원소들과 비교해서 올바른 위치에 넣는다.
		// 2번째 위치일 때는 1번 비교
		// n번째 위치일 때는 (n-1)번 비교겠지...
		for(int i = 1; i < arr.length ; i++ ) {
			
			
			System.out.println("-----------------");
			System.out.println(i+"번째 위치일 때");
			
			//i가 내려가면서 j(점점 앞 원소로 감)과 비교해야 되기 때문에... 임시변수 설정해줌
			int temp_i = i;
			//(2) 앞 원소들 돌아가면서 비교해야 하니까 0부터 시작해서 i보다 하나 앞까지 돌아가면서 비교...
			for(int j = i-1 ; j >=  0 ; j--) {
				System.out.println(j+"번째 원소와 비교할 거예요. 그 값은 " + arr[j] + "입니다.");
				//(3) 앞 원소의 값이 뒤 원소의 값보다 크면, 뒤 원소의 값을 삽입하고, 앞 원소의 값은 하나 뒤로 보낸다.
				if(arr[j] > arr[temp_i]) {
					
					int temp = arr[temp_i];
					arr[j+1] = arr[j];
					arr[temp_i-1] = temp;
					System.out.println(temp);
					System.out.println(arr[temp_i-1]);
					temp_i--;
					
				}
				System.out.println(Arrays.toString(arr));
				
			}
		}
		
		
		
		
		
		
		
		
		// 4. 정렬된 배열 원소들을 하나씩 꺼낸다.
		for(int i = 0; i<number;i++) {
			System.out.println(arr[i]);
		}
		

			
		
		
		
		
		
		
		
		
	}

}
