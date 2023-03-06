package programmers;

import java.util.Arrays;
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
        		//ex) A == A라면,
	     	   if(privacies1[i][1].equals(terms1[j][0])) {
	     		  System.out.println(i+"번째");
	     		  System.out.println(privacies1[i][1]);
	     		  System.out.println(terms1[j][0]);
	     		  int month = Integer.parseInt(privacies1[i][0].substring(5, 7));
	     		  int year = Integer.parseInt(privacies1[i][0].substring(0, 4));
	     		  String day = privacies1[i][0].substring(8,10);
	     		  
	     		  if(month + Integer.parseInt(terms1[j][1]) > 12) {
	     			  year ++;
	     			  month = month-12;
	     		  } else {
	     			  month = month + Integer.parseInt(terms1[j][1]);
	     		  }
	     		  if(month<10) {
	     			  //String
	     		  }
	     		 privacies1[i][0] = String.valueOf(year)+"."+String.valueOf(month)+"."+day;
	     		  break;
	     		  //Integer.parseInt(privacies1[i][0]) + Integer.parseInt(terms1[j][1])) ;
	     	   }
        	}
        }
        
        System.out.println(Arrays.toString(privacies1[0]));
        System.out.println(Arrays.toString(privacies1[1]));
        System.out.println(Arrays.toString(privacies1[2]));
        
        return answer;
    }

	public static void main(String[] args) {
		
		String today = "2022.05.19";
		String[] terms = {"A 6", "B 12", "C 3"};
		String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
		
		//----------------------------------------------------------------------
		//substring이해하려고..예시...
		String example = "2021.05.02";
		System.out.println("1");
		System.out.println(example.substring(0, 4)); //substring : a부터 b전까지의 위치의 문자열을 가져온다.
		System.out.println(example.substring(5, 7)); //substring : a부터 b전까지의 위치의 문자열을 가져온다.
		System.out.println(example.substring(8, 10)); //substring : a부터 b전까지의 위치의 문자열을 가져온다.
		solution(today,terms,privacies);
	}

}
