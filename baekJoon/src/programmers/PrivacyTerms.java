package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 개인정보 수집 유효기간
 *
 */
public class PrivacyTerms {
	public static int[] solution(String today, String[] terms, String[] privacies) {
		
	    
		Map<String, Integer> map = new HashMap<>();
		for(String term : terms) {
		   //month니까 28을 곱해준다
		   map.put(term.split(" ")[0],Integer.parseInt(term.split(" ")[1])*28);
		}
		int todayYear = Integer.parseInt(today.split("\\.")[0]);
		int todayMonth = Integer.parseInt(today.split("\\.")[1]);
		int todayDate = Integer.parseInt(today.split("\\.")[2]);
		int todayNumber = todayYear*28*12 + todayMonth*28 + todayDate ;
	   
		List<Integer> expireList = new ArrayList<>();
		
	   
		for(int i = 0; i < privacies.length; i++) {
		   
		   int year = Integer.parseInt(privacies[i].split(" |\\.")[0]);
		   int month =  Integer.parseInt(privacies[i].split(" |\\.")[1]);
		   int day =  Integer.parseInt(privacies[i].split(" |\\.")[2]);
		   
		   int total = year*28*12 + month*28 + day + map.get(privacies[i].split(" |\\.")[3]);
		   
		   
		   if(todayNumber >= total) {
			   //파기해야 할 리스트
			   expireList.add(i+1);
		   }
		   
		   
		}
		
		//list를 배열로 바꾸기
		//int[] answer = expireList.toArray(new int[0]);
		
		int[] answer = new int[expireList.size()];
		    for (int i = 0 ; i < expireList.size() ; i++) { 
		    	answer[i] = expireList.get(i).intValue();
		    }
		return answer;
    }

	public static void main(String[] args) {
		
		String today = "2020.01.01";
		String[] terms = {"Z 3", "D 5"};
		String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
		
		
		
		solution(today,terms,privacies);
	}

}
