package baekJoon.b11_Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;


public class B2750 {
	
	static int[] myFirstSelectSort(int[] arr) {
		
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
	
	static int[] myFirstInsertSort(int[] arr) {
		
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
		
		return arr;
	}

	static int[] myFistBubbleSort(int[] arr) {
		
		//(1) 위치[n]부터 [2]자리가 정렬될 때까지 반복하니까?
		for(int i = 0; i < arr.length-1; i++) {
			System.out.println("---------"+i+"턴 --------------");
			//(2) 다음 턴이 될수록, 반복되는 횟수는 하나씩 적어짐(뒤에 있는 위치부터 정렬되니까)
			for(int j = 0; j < arr.length-1 -i ;j++) {
				System.out.println(j+"와"+(j+1)+" 비교");
				if(arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					System.out.println("바뀌었습니다.");
				}
				System.out.println(Arrays.toString(arr));
			}
			
		}
		
		return arr;
	}
	
	static int[] myFirstQuickSort(int[] arr , int start, int end) {
		
//		int pivot = 0;
//		int left = pivot + 1;
//		int right = arr.length-1;
		System.out.println("start : " + start);
		System.out.println("end : " + end);
		int pivot = start;
		int left = start + 1;
		int right = end;
		
		//분할 후 원소가 하나일 경우는 정렬하지 않는다.
		if(start>=end) {
			System.out.println("원소가 하나라서... 종료합니다잉");
			quickSortExplaination(arr);
			return arr;
		};
		while(left <= right) {
//			System.out.println("-------------------------------------------------");
//			System.out.println("현재 left인 인덱스 ["+left+"]의 값은"+arr[left]+"입니다.");
//			System.out.println("현재 right인 인덱스["+right+"]의 값은"+arr[right]+"입니다.");
			
			
			//left가 아닐 경우 안 멈춤
			//■ point 0 :  if문이 아니라 while문이 되어야 됨. 왜냐면 서로 switch 전까지 "계속" 안 멈춰야하거든..
			//             멈출 때 비로소 switch를 하기 때문에 무한 반복을 걸어야 됨...
			
			//■ point : pivot의 값이 left보다 크면 끝도 없이 올라갈 수가 있군...
			// left가 더 커지지 않게 제한 걸어줘야겠구나...
			// 왜.... <=가 아니면 무한반복이 걸리는 거지????????
			
			while(left <= end && arr[pivot] > arr[left]) {
				left++;
				System.out.println("left++");
				System.out.println("현재 left인 인덱스["+left+"]의 값은"+arr[left]+"입니다.");
			}
			System.out.println("---"+arr[left]+">"+arr[pivot]+"이기 때문에 left는 멈추었다.---"); //설명용 주석(▲나중에 지우기▲)
			//right가 아닐 경우 안 멈춤
			while(right > start && arr[right] > arr[pivot]) {
				right--;
				System.out.println("right--");
				System.out.println("현재 right인 인덱스["+right+"]의 값은"+arr[right]+"입니다.");
			}
			System.out.println("---"+arr[right]+"<"+arr[pivot]+"이기 때문에 right는 멈추었다.---"); //설명용 주석(▲나중에 지우기▲)
			
			//둘 다 멈출 경우, switch
			//if((arr[pivot] < arr[left] && arr[right] < arr[pivot]) {
			//■point1 : left <= right 해줘야됨
			//■point1 이유 : 서로 멈추었을 때, left > right이 되어버렸으면 switch를 해야될 게 아니라
			//              반복 끝내고 arr[pivot]과 arr[right]을 switch 해야되기 때문임.
			System.out.println("---드디어 둘 다 멈추었다.----");
			if((left <= right && arr[pivot] < arr[left] && arr[right] < arr[pivot])) {
				System.out.println("---조건이 만족하기 때문에, switch를 할 것임---");
				System.out.println("현재 left인 인덱스["+left+"]의 값은"+arr[left]+"입니다.");
				System.out.println("현재 right인 인덱스["+right+"]의 값은"+arr[right]+"입니다.");
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				System.out.println("switch가 이루어졌습니다.");
				System.out.println("현재 left인 인덱스["+left+"]의 값은"+arr[left]+"입니다.");
				System.out.println("현재 right인 인덱스["+right+"]의 값은"+arr[right]+"입니다.");
				System.out.println("------[switch가 이루어진 후의 배열]------");
				quickSortExplaination(arr);
				//■ point2 : left++; right--; 해줘야됨
				//■ point2 이유 : 서로 바꾸면 이제 기존 while문 조건 충족이 되는 거니까 while문 내에서처럼 내려줘야지.
				left++;
				System.out.println("left++");
				System.out.println("현재 left인 인덱스["+left+"]의 값은"+arr[left]+"입니다.");
				right--;
				System.out.println("right--");
				System.out.println("현재 right인 인덱스["+right+"]의 값은"+arr[right]+"입니다.");
			}
			//System.out.println(Arrays.toString(arr));
			
			
		}
		System.out.println("left > right이기 떄문에 while반복문을 빠져나옴. 이제 pivot과 right을 바꿔줄 차례임!");		
		System.out.println("현재 left인 인덱스 ["+left+"]의 값은"+arr[left]+"입니다.");
		System.out.println("현재 right인 인덱스 ["+right+"]의 값은"+arr[right]+"입니다.");
		//switch
		int temp = arr[pivot];
		//■ point3  : pivot에다가 자꾸 입력하니까 안 되지...
		arr[start] = arr[right];
		arr[right] = temp;
		System.out.println("arr[right] :" + arr[right]);
		System.out.println("arr[pivot] :" + arr[pivot]);
		
		quickSortExplaination(arr);
		System.out.println("☆★이제 분할한다잉☆★");
		System.out.println("☆★왼쪽 정렬☆★");
		myFirstQuickSort( arr , start ,  right-1) ;
		System.out.println("☆★오른쪽 정렬☆★");
		myFirstQuickSort( arr , right+1,  end) ;
		
		
		
		
		//정렬된 배열을 return해줘야 하나?
		return arr;
	}
	
	//설명용이니까 return값 없어도 될 듯?
	static void quickSortExplaination(int[] arr) {
		//System.out.println("----------[정렬되기 전 기존 배열]----------");
		//1. [기존 배열]의 인덱스를 하나의 문자열로 만들어줌.
		StringBuilder indexSB = new StringBuilder();
		for(int i = 0; i <arr.length; i++) {
			indexSB.append("["+	i+"]");
		}
		System.out.println(indexSB.toString());
		//2. 기존 배열
		StringBuilder beforeSB = new StringBuilder();
		for(int i = 0; i <arr.length; i++) {
			beforeSB.append("["+ arr[i] +"]");
		}
		System.out.println(beforeSB.toString());
		System.out.println("--------------------------------------");
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
		
		//설명용 주석(▲나중에 지우기▲)
			//일단 기존 배열 보자...
			System.out.println("----------[정렬되기 전 기존 배열]----------");
//			//1. [기존 배열]의 인덱스를 하나의 문자열로 만들어줌.
//			StringBuilder indexSB = new StringBuilder();
//			for(int i = 0; i <arr.length; i++) {
//				indexSB.append("["+	i+"]");
//			}
//			System.out.println(indexSB.toString());
//			//2. 기존 배열
//			StringBuilder beforeSB = new StringBuilder();
//			for(int i = 0; i <arr.length; i++) {
//				beforeSB.append("["+ arr[i] +"]");
//			}
//			System.out.println(beforeSB.toString());
//			System.out.println("--------------------------------------");
		quickSortExplaination(arr);
		//
		//System.out.println(Arrays.toString(arr));
		
		// 3-1. 오름차순 정렬 [방법1] 주어진 함수 쓰기
		//Arrays.sort(arr);
		
		// 3-2. 오름차순 정렬 [방법2] 선택 정렬
		//myFirstSelectSort(arr);
		
		// 3-3. 오름차순 정렬 [방법3] 삽입 정렬
		//myFirstInsertSort(arr);
		
		// 3-4. 오름차순 정렬 [방법4] 버블 정렬
		//myFistBubbleSort(arr);
		
		// 3-5. 오름차순 정렬 [방법5] 퀵 정렬
		//myFirstQuickSort(arr);
		
		
		myFirstQuickSort(arr , 0 , arr.length-1);
	
		
		// 4. 정렬된 배열 원소들을 하나씩 꺼낸다.
		for(int i = 0; i<number;i++) {
			System.out.println(arr[i]);
		}
		

			
		
		
		
		
		
		
		
		
	}

}
