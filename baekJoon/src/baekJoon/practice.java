package baekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class practice {

	public static void main(String[] args) throws IOException{
		
		// 선언
				BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
				
				//첫번째 입력이 제대로 되었는지를 가늠하는 FLAG 변수
				//IF 2개가 입력이 되었다면, 반복 안하고 바로 다음으로 넘어가고, 2개가 아니면 2개 입력될 때까지 반복함.
				// 1이면 잘못됨(반복) 0이면 잘 됨(반복끝)
				int inputLength=1;
				
				do {
					
					System.out.println("N전체인원, K상받을인원");
					String input[] = bf.readLine().split(" ");
					
					if (input.length ==2) {

						String num = "^[0-9]*$";
						
						String data1 =  input[0];
						String data2 =  input[1];
						
						//2개가 입력이 되었지만, 숫자로 입력이 되었는지를 확인하는 flag
						boolean result1 = Pattern.matches(num,data1);
						boolean result2 = Pattern.matches(num,data2);
						
						int memberAll=0;
						int memberAward=0;
						
						// 정규표현식 검사 
						if (result1== true && result2==true) {
							
							//숫자로 입력이 되었다면 얘를 숫자변수로 바꿔준다.
							 memberAll = Integer.parseInt(input[0]);
							 memberAward = Integer.parseInt(input[1]);
							inputLength=0;

							
						}else {
							inputLength=1;
						}
						

						// 제한 조건
						if (1 <= memberAll && memberAll <= 1000 && 1<=memberAward && memberAward <= memberAll) {
							
							
							int check=1;
							
							do {
								
								System.out.println("X점수를 입력하세요");
								String[] scoreIdx = bf.readLine().split(" ");
								
								//이거 위치를 바꿔줘야 에러가 안나는거 같아
								// 전체인원 수 만큼 인덱스 길이 설정
								//scoreIdx[] = new String[memberAll] ;
								int[] score = new int[scoreIdx.length];
							
								for(int i = 0 ; i < scoreIdx.length;i++) {
									//string배열에 담겨있는 애를 각각 검사해서 숫자일 경우 숫자 배열에 넣어준다.
									boolean resulti = Pattern.matches(num, scoreIdx[i]);
									System.out.println(resulti);
									if (resulti) {
										score[i] = Integer.parseInt(scoreIdx[i]);
									} else {
										check = 1;
									}
								} 
								
								
								
								
								
								
								
								// string배열을 int배열로 변환
//								int[] score = Stream.of(scoreIdx).mapToInt(Integer::parseInt).toArray();
								
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
									
									// 내림차순
									Arrays.sort(score);
									
									// 출력
									System.out.println(score[memberAll-memberAward]);
								}else {
									System.out.println("[!] 인원수에 맞게 점수를 입력해주세요");
									check=1;
								}
								
								
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


