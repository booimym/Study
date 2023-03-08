package practice2;

public class Test1 {
	
	private int a = 10;
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void test() {
		
	}
	
	public static void main(String[] args) {
		
		Test1 t = new Test1();
		
		t.test();
		System.out.println(t.getA());
		
	}

}
