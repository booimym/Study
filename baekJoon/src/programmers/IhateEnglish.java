package programmers;

public class IhateEnglish {


	public static long solution(String numbers) {
	        String[] matchNumbers = {
	                "zero", "one", "two"
	                , "three", "four", "five"
	                , "six", "seven", "eight", "nine"};

	        for (int i = 0; i < matchNumbers.length; i++) {
	            numbers = numbers.replaceAll(matchNumbers[i], String.valueOf(i));
	            System.out.println(numbers);
	        }
	        return Long.parseLong(numbers);
    }
	
	
	public static void main(String[] args) {
		
		String s = "onetwothreefourfivesixseveneightninenine";
		String ss = "onefourzerosixseven";
		System.out.println(solution(ss));
		
		
	}

}
