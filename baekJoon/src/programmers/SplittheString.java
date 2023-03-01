package programmers;

/**
 * LV1. 문자열 나누기
 *
 */
public class SplittheString {
	
	 public static int solution(String s) {
		 
	        int answer = 0;
	 
	        String[] ss = s.split("");
	        
	        //첫글자
	        String first = null ;
	        //첫글자 여부를 판별해주는 flag
	        boolean firstFlag = true;
	        //첫글자의 개수
	        int countX = 0;
	        //나머지의 개수
	        int countY = 0;
	        
	        for(int i =0 ; i < s.length(); i++) {
	        	
	        	//첫번째 글자라면,
	        	if(firstFlag) {
	        		first = ss[i];
	        		countX++;
	        	//아니라면,
	        	}else {
	        		if(first.equals(ss[i])) {
	        			countX++;
	        		}else {
	        			countY++;
	        		}
	        	}
	        	
	        	if(countX == countY) {
	        		answer++;
	        		firstFlag=true;
	        	}else {
	        		if(i==s.length()-1) {
	        			answer++;
	        		}
	        		firstFlag=false;
	        	}
	        	
	        	
	        }
	        
	        return answer;
	    }

	public static void main(String[] args) {
		
		String s = "abracadabra";
		
		System.out.println(solution(s));
		
	}

}
