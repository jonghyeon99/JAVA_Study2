package chapter06.class_part1;

public class C051_static2 {
    // 정적 메서드, 멤버 메서드
    public static int add(int x, int y) {
        return x + y;
    }
    // 인스턴스 메서드, 멤버 메서드
    public int minus(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        int sum = C051_static2.add(10, 20);
        System.out.println(sum);

        C051_static2 instance = new C051_static2();
        int result = instance.minus(20, 10);
        System.out.println(result);

        int sum2 = instance.add(10, 20);
        System.out.println(sum2);
    }
}
