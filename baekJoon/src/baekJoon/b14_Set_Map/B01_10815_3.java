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

public class B01_10815_3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//1. 상근이의 카드의 개수
		int sangNum = Integer.parseInt(br.readLine());
		
		//2. 상근이의 카드를 set에 담는다.
		Set<Integer> set1 = new HashSet<>();
		//int[] arr = new int[sangNum];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for(int i = 0; i < sangNum; i++) {
			//arr[i] = Integer.parseInt(st1.nextToken());
			set1.add(Integer.parseInt(st1.nextToken()));
			
		}
		
		//3. 특정한 숫자카드를 입력받음과 동시에 상근이의 카드와의 일치여부를 비교하는 for문을 작성해보기!
		Map<Integer, Integer> map = new HashMap<>();
		
		//3-1. 총 카드의 개수
		int randomCard = Integer.parseInt(br.readLine());
		//int[] arr2 =   new int[randomCard];
		
		//3-2. 입력을 받는다.  
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		boolean flag = false;
		for(int i = 0; i < randomCard; i++) {
			
			//만약 입력을 받은 수가, arr배열의 수 중 하나와 일치한다면, map에다가 담는다.
			//배열에도...담아야하나...???????????????????
			int a = Integer.parseInt(st2.nextToken());
			//arr2[i] = a;
			
			
		}
		
		for(int i = 0; i < randomCard; i++) {
			//bw.write(map.get(arr2[i])+" ");
		}
		bw.close();
	}

}
