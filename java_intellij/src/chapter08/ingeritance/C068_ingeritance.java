package chapter08.ingeritance;
// 부모클래스, 슈퍼클래스, 상위클래스
class A {
    String name;
    private int age;


    public void method() {
        System.out.println(name + " 메서드 출력");
    }
}
// 자식클래스, 서브클래스, 하위클래스
class B extends A { // 상속

}

public class C068_ingeritance {

    public static void main(String[] args) {
        A a = new A();
        a.name = "홍길동";
//      a.age = 31; //err
        a.method();

        B b = new B();
        b.name = "이순신";
        b.method();
    }
}
