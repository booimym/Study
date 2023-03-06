package practice2;

public class CompareTo_Test {

	public static void main(String[] args) {

		String a = "im";
		String b = "it";
		String c = "no";
		
		System.out.println(a.compareTo(b)); //-7 a보다 b가 더 뒤면 음수
		System.out.println(a.compareTo(c)); //-5
		
		
		/*compareTo 함수는 int의 경우 비교값 a, b가 있을 때
			a > b 일 경우 result = 1
			a = b 일 경우 result = 0
			a < b 일 경우 result = -1
		*/
	
	}
}
