package practice2;

class Parent {
    protected int num = 10;
    
    public void print() {
        System.out.println("Parent Class");
    }
}

class Child extends Parent {
    private int num = 20;
    
    public void print() { //오버라이딩했네?
    	super.print(); // 부모 클래스의 print() 메서드 호출
        System.out.println("Child Class");
    }
    
    public void printNum() {
        System.out.println(num); // 자식 클래스의 num 출력
        System.out.println(super.num); // 부모 클래스의 num 출력
    }
    public static void main(String[] args) {
    	Child child = new Child();
    	child.print(); // Parent Class \n Child Class 출력
    	child.printNum(); // 20 \n 10 출력
    }
}



