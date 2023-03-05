package programmers;

import java.util.Date;

/**
 * 개인정보 수집 유효기간
 *
 */
public class PrivacyTerms {
	public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        
        String[][] terms1 = new String[terms.length][2];
        for(int i = 0; i <terms.length ; i++ ) {
        	terms1[i] = terms[i].split(" "); 
        }
        
        String[][] privacies1 = new String[privacies.length][2];
        for(int i = 0; i <privacies.length ; i++ ) {
    	   privacies1[i] = privacies[i].split(" "); 
       	}
       
        for(int i = 0; i <privacies.length ; i++ ) {
        	
        	for(int j = 0; j <terms.length ; j++ ) {
	     	   if(privacies1[i][1].equals(terms1[j][0])) {
	     		   
	     	   }
        	}
        }
        
        return answer;
    }

	public static void main(String[] args) {
		
		String today = "2022.05.19";
		String[] terms = {"A 6", "B 12", "C 3"};
		String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		
		solution(today,terms,privacies);
	}

}
