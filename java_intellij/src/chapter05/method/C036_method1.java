package chapter05.method;

public class C036_method1 {

    public static void main(String[] args) {
        // 1~10 합
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1~10 = " + sum);
        // 메서드 호출 부분
        System.out.println("1~10 = " + calcSum(1, 10));
        System.out.println("15~100 = " + calcSum(15, 100));
    }
    // 메서드 정의 부분
    public static int calcSum(int from, int to) {
        int sum = 0;
        for (int i = from; i <= to; i++) {
            sum += i;
        }
        return sum;
    }
}
