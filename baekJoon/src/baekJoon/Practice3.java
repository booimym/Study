package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

//김효동 코드
public class Practice3 {
	
	public static void main(String[] args) throws IOException{
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	
	int inputLength=1;
	
	do {
		
		System.out.println("N전체인원, K상받을인원1");
		String input[] = bf.readLine().split(" ");
		
		if (input.length ==2) {

			// 정규표현식 숫자만 
			String num = "^[0-9]*$";
			
			String data1 =  input[0];
			String data2 =  input[1];
			boolean result1 = Pattern.matches(num,data1);
			boolean result2 = Pattern.matches(num,data2);
			
			int memberAll=0;
			int memberAward=0;
			
			// 정규표현식 검사 
			if (result1== true && result2==true) {
				 memberAll = Integer.parseInt(input[0]);
				 memberAward = Integer.parseInt(input[1]);
				inputLength=0;

				
			}else {
				inputLength=1;
			}
			

			// 제한 조건
			if (1 <= memberAll && memberAll <= 1000 && 1<=memberAward && memberAward <= memberAll) {
				
				// 전체인원 수 만큼 인덱스 길이 설정
				String scoreIdx[] = new String[memberAll] ;
				System.out.println("string배열도 초기값 지정되나? null로?");
				System.out.println(Arrays.toString(scoreIdx));
				
				int check=1;
				
				do {
					
					System.out.println("X점수를 입력하세요");
					scoreIdx = bf.readLine().split(" ");
					
					// string 를 int 변환
					int[] score = Stream.of(scoreIdx).mapToInt(Integer::parseInt).toArray();
					System.out.println("int배열 초기화되니?");
					System.out.println(Arrays.toString(score));
					// 전체인원수 와 점수 수량이 맞는지 확인
					if (scoreIdx.length == memberAll) {
						
						// 값 하나하나 조건 확인
						for (int i = 0; i < score.length; i++) {
							
							if (0<=score[i] && score[i]<=10000) {
								
								check=0;
								
							} else {
								System.out.println("[!] 점수값이 잘못되었습니다.");
								check=1;
								break;
							}
						}
						
					}else {
						System.out.println("[!] 인원수에 맞게 점수를 입력해주세요");
						check=1;
					}
					
					// 내림차순
					Arrays.sort(score);
					
					// 출력
					System.out.println(score[memberAll-memberAward]);
					
				} while (check==1);
				
			} else {
				System.out.println("[!] 입력범위가 잘못됬습니다.");
			}
			
		}else {
			inputLength=1;
			System.out.println("[!] 값을 2개 작성해 주세요");

		}
		
	} while (inputLength == 1);
}
}
