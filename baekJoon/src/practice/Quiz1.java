package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

class Data3 {int x;}


public class Quiz1 {

	public static int solution(String[] bakery_schedule, String current_time, int k) {
		
		int answer = -1;
		/*(1) 빵나오는 시간 & (2) 빵 개수를 2차원 숫자 배열에 담을 거야*/
		
		//1. 담을 숫자 배열 생성
		//int[][] inputArr = new int[2][bakery_schedule.length];
		int[][] inputArr = new int[bakery_schedule.length][2];
		
		for(int i = 0 ; i <bakery_schedule.length ; i++) {
			
			// 2. 각각을 일단 분리해줌!
			String[] stringI =bakery_schedule[i].split(" ");
			
			
			// 3-1. (1) 빵 나오는 시간을 숫자 형태로 바꿈
			String h = ""+ stringI[0].charAt(0)+stringI[0].charAt(1);
			String m = ""+stringI[0].charAt(3)+stringI[0].charAt(4);
			inputArr[i][0] = Integer.parseInt(h)*60 + Integer.parseInt(m);
			System.out.println(inputArr[i][0]);
			
			// 3-2. (2) 빵 개수를 숫자 형태로 바꿈
			inputArr[i][1] = Integer.parseInt(stringI[1]);
			System.out.println(inputArr[i][1]);
			
		}
	
		/*현재 시간을 숫자로 만들기!*/
		String ct_h = ""+ current_time.charAt(0)+current_time.charAt(1);
		String ct_m = ""+current_time.charAt(3)+current_time.charAt(4);
		int ct = Integer.parseInt(ct_h)*60 + Integer.parseInt(ct_m);
		System.out.println("ct는 "+ ct);
		int count = 0;
		for(int i = 0 ; i <bakery_schedule.length ; i++) {
			
			//빵 나오는 시간이 현재시간보다 같거나 더 뒤이면 빵 개수를 세준다!
			if(ct <= inputArr[i][0]) {
				count += inputArr[i][1];
				
				if(count >= k) {
					System.out.println(inputArr[i][0]);
					System.out.println("ct는 "+ ct);
					answer = inputArr[i][0] - ct;
					break;
				}
			}
		}
		
		  
		return answer;
	}
	
	public static void main(String[] args) {
		//빵 나오는 시간 / 주어진 시각 / 빵 k개 판매
	      //int result = solution(new String[]{"09:05 10","12:20 5","13:25 6","14:24 5"},"12:05",10);
	      //int result = solution(new String[]{"12:00 10"},"12:00",10);
	      int result = solution(new String[]{"12:00 10"},"12:00",11);
	      System.out.println(result);
	      
	}

	
}
