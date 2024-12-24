package chapter05.method;

public class C041_overloading {

    public static void main(String[] args) {
/*
    오버로딩(Overloading) - ex. print, println 메서드
    하나의 이름으로 여러 처리를 한다. (다형성)
    1. 메서드의 이름이 같아야 한다. (필수)
    2. 파라미터 개수가 달라야 한다.
    3. 파라미터 타입이 달라야 한다.
    4. 파라미터 순서가 달라야 한다.
 */
        getMax(5);
        getMax(5, 3.14);
        getMax(3.14, 5);
        System.out.println(getMax(10, 20));
        System.out.println(getMax(10.5, 45.7));
    }

    public static void getMax(int a) {
        System.out.println(a);
    }

    // 파라미터 개수 차이
    public static void getMax(int a, double b) {
        System.out.println(a + b);
    }

    // 파라미터 순서 차이
    public static void getMax(double a, int b) {
        System.out.println(a * b);
    }

    // 파라미터 타입 차이
    public static int getMax(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public static double getMax(double a, double b) {
        if (a > b)
            return a;
        else
            return b;
    }
}
