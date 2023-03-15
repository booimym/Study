package practice2;

/**
 * 인터페이스의 다형성 / 인터페이스의 장점을 알아보자! (자바의 정석_예제 연습)
 *
 */
public class Test3 {
	public static void main(String[] args) {
		A a = new A();
		a.methodA(new C());
	}
}

class A {
	public void methodA(I i) { // 인터페이스의 다형성 이용 : 인터페이스를 메소드의 매개변수 타입으로 지정해서, 
							   // I 인터페이스를 구현한 인스턴스들만 들어올 수 있게끔 지정함.
		i.methodI();  // A는 인터페이스의 메서드를 "사용"하는 인터페이스에 "의존"하는 객체!
	}
}
interface I {
	void methodI();
}
class B implements I {
	public void methodI() { //interface의 추상 메서드를 구현함
		System.out.println("나는 B의 메소드야...");
	}
}
class C implements I {
	public void methodI() { //interface의 추상 메서드를 구현함
		System.out.println("나는 C의 메소드야...");
	}
}
