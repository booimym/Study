package practice2;

import java.util.Date;

public class TostringTest {
	
	int a;
	
	public static void main(String[] args) {
		
		TostringTest t = new TostringTest();
		System.out.println(t);
		System.out.println(t.toString());
		
		//java.util.Date today = new java.util.Date();
		Date today = new Date();
		
	}
	
	public String toString() {
		return "a : " + a;
	}

}
