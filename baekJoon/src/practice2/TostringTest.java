package practice2;

public class TostringTest {
	
	int a;
	
	public static void main(String[] args) {
		
		TostringTest t = new TostringTest();
		System.out.println(t);
		System.out.println(t.toString());
		
	}
	
	public String toString() {
		return "a : " + a;
	}

}
