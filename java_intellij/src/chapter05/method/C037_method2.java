package chapter05.method;

public class C037_method2 {

/*
    메서드 생성부분(정의부분)
    접근지정자 () 리턴타입 메서드명 (데이터타입 매개변수1, ...) {
        실행할 명령어...
        return 반환할 값;
    }
 */

    public static void main(String[] args) {
        method1();
        String result = method2();
        System.out.println(result);
        method3(10);
        int sum = method4(10, 20);
        System.out.println(sum);
    }

    // 1. 데이터를 받아오지도 데이터를 반환하지도 않는 메서드
    // 파라미터 X, 반환값 X
    public static void method1() {
        System.out.println("단순 명령어 실행, 아무값도 받지 않고, " + "println만 실행했을 뿐 어떤 값도 반환하지 않는다.");
        return; // 메서드를 호출한 곳으로 돌아간다.  = 메서드를 종료한다.
        // return; 생략가능
    }

    // 2. 데이터를 받아오지는 않지만 데이터를 반환하는 메서드
    // 파라미터 X, 반환값 O
    public static String method2() {
        System.out.println("2번째 메서드 출력");
        String result = "ㅋㅋㅋ";
        return result;
    }

    // 3. 데이터를 받아오지만 데이터를 반환하지 않는 메서드
    // 파라미터 O, 반환값 X
    public static void method3(int a) {
        System.out.println("받아온 파라미터 : " + a + "이지만 받아만 왔을 뿐 반환하지는 않는다.");
    }

    // 4. 데이터를 받아오기도 데이터를 반환하기도 하는 메서드
    // 파라미터 O, 반환값 O
    public static int method4(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
