package programmers;

import java.util.Arrays;

/**
 * LV1. 성격 유형 검사하기(2022 카카오 인턴십 문제)
 *
 */
public class Kakao_MBTI {
	
	 public static String solution(String[] survey, int[] choices) {
	        String answer = "";
	        
	        int[][] mbti = new int[4][2];
	        for(int i = 0; i < 4; i++) {
		        System.out.println(Arrays.toString(mbti[i]));
		        }
	        
	        //질문마다 점수 부여
	        for(int i = 0; i < survey.length; i++) {
	        	
	        	//String front = survey[i].split("")[0];
	        	//String back = survey[i].split("")[1];

	        	
//	        	switch(choices[i]) {
//	        	case 1 : mbti[j][1]+=3; break;
//	        	case 2 : mbti[j][1]+=2; break;
//	        	case 3 : mbti[j][1]+=1; break;
//	        	case 4 : ; break;
//	        	case 5 : mbti[j][0]+=1; break;
//	        	case 6 : mbti[j][0]+=2; break;
//	        	case 7 : mbti[j][0]+=3; break;
//	        	
//	        	}
	        	
	        }
	        for(int i = 0; i < 4; i++) {
	        System.out.println(Arrays.toString(mbti[i]));
	        }
	        return answer;
	    }

	public static void main(String[] args) {
		
		// i+1번 질문의 비동의/동의 관련 선택지를 선택하면 받는 성격 유형
		String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
		/* 
		 * 1 : 비동의 3점
		 * 2 : 비동의 2점
		 * 3 : 비동의 1점
		 * 4 : 0점
		 * 5 : 동의 1점
		 * 6 : 동의 2점
		 * 7 : 동의 3점
		 */
		int[] choices = {5, 3, 2, 7, 5};
		
		
		solution(survey,choices);
	}

}
  