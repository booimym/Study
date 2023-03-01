package programmers;

/**
 * LV 0. 영어가 싫어요
 *
 */
public class IhateEnglish {


	/**
	 * 1. replace 메서드를 사용하는 방법
	 */
	public static long solution1(String numbers) {
		long answer = 0;
		
		numbers = numbers.replace("zero", "0");
		numbers = numbers.replace("one", "1");
		numbers = numbers.replace("two", "2");
		numbers = numbers.replace("three", "3");
		numbers = numbers.replace("four", "4");
		numbers = numbers.replace("five", "5");
		numbers = numbers.replace("six", "6");
		numbers = numbers.replace("seven", "7");
		numbers = numbers.replace("eight", "8");
		numbers = numbers.replace("nine", "9");
		
		answer = Long.parseLong(numbers);
		return answer;
	}
	/**
	 * 2. replaceAll 메서드를 사용하는 방법
	 */
	public static long solution2(String numbers) {
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
		System.out.println(solution1(ss));
		
		
	}

}
