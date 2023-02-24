package practice;

public class StaticTest {

	public static void main(String[] args) {
		
		Test t = new Test();
		
		//static메소드는 클래스이름.메서드이름()으로 호출해야해.
		System.out.println(Test.staticMethod());
	}

}
