package chapter04.loop;

public class C026_for1 {

    public static void main(String[] args) {
        // for 문
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "번 학생 성적 처리");
        }

        // 1~100 합
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);

        // 1~100 짝수 합
        int sum2 = 0;
        for (int i = 0; i <= 100; i += 2) {
            sum2 += i;
        }
        System.out.println(sum2);

        int sum3 = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            } else {
                sum3 += i;
            }
        }
        System.out.println(sum3);
    }
}
