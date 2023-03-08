package practice2;

public class CompareTo_Test {

	/*
	 * a-
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {

		String a = "im";
		String b = "it";
		String c = "no";
		
		System.out.println(a.compareTo(b)); //-7 a < b이면 음수 반환 -> a보다 b가 사전순으로 더 뒤이면 음수 반환
		System.out.println(a.compareTo(c)); //-5
		
		
		/*compareTo 메소드 : 두 개의 문자열을 (*사전적으로) 비교하고 int형 값을 반환하는 메소드
			a > b 일 경우 양수를 반환
			a = b 일 경우 0을 반환
			a < b 일 경우 음수를 반환
			
			*사전적*의 의미
			1. 두 개의 String의 길이가 다를 때
			2. 서로 다른 문자가 문자열 중에 있을 때
		*/
		
		System.out.println("abce".compareTo("zdce"));
		
		Integer one = 1;
		Integer two = 2;
		
		System.out.println(one.compareTo(two));
		//------------------------------------------------------------------------------------------------------------------
		/* compareTo의 정렬 기준
		 * 
		 * 1. compareTo의 리턴 결과가 양수 	-> 정렬 순서가 바뀜
		 * 2. compareTo의 리턴 결과가 0 	-> 정렬 유지
		 * 3. compareTo의 리턴 결과가 음수 	-> 정렬 유지
		 * 
		 * */
	}
}
