package chapter08.ingeritance;

class AAA {
    final static double PI = 3.14;

    final void finalMethod() {
        System.out.println("final method");
    }
}

final class BBB extends AAA {
//    @Override
//    final void finalMethod() {  // override 금지 err
//        System.out.println("final method");
//    }
}

//class CCC extends BBB {}  // 상속 금지 err

public class C071_final {

    public static void main(String[] args) {
/*
        final
            - final 변수 : 상수, 값 변경 불가
            - final 메서드 : override 불가
            - final 클래스 : 상속 불가
 */
        AAA a = new AAA();
        // a.PI = 10;  // 값 변경 불가 err
        a.finalMethod();
    }
}
