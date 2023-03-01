package programmers;

/**
 * LV1. 숫자 문자열과 영단어(2021 카카오 인턴십)
 *
 */
public class kakao_oneTo1 {

	public static int solution(String s) {
        int answer = 0;
        
        String[] englishNumberArr = {"zero", "one", "two"
                , "three", "four", "five"
                , "six", "seven", "eight", "nine"};
        
        for(int i =0 ; i < englishNumberArr.length ; i++) {
        	
        	s = s.replaceAll(englishNumberArr[i],String.valueOf(i));
        }
        
        answer = Integer.parseInt(s);
        
        
        return answer;
    }
	public static void main(String[] args) {

		String s = "2three45sixseven";
		System.out.println(solution(s));
	}

}
