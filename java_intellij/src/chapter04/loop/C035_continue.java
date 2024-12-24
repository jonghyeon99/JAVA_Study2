package chapter04.loop;

public class C035_continue {

    public static void main(String[] args) {
        // continue
        for (int i = 1; i < 10; i++) {
            if (i == 7) {
                continue;
            }
            System.out.println("반복회차 : " + i);
        }

        // 1~100 짝수 합 구하기
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println(sum);

        // 1~100 짝수 합 > while, do-while

        int num2 = 0;
        int sum2 = 0;

        while (num2 <= 100) {
            if (num2 % 2 == 0) {
                sum2 += num2;
                num2 += 2;
            }
        }
        System.out.println(sum2);

        int num3 = 0;
        int sum3 = 0;

        do {
            sum3 += num3;
            num3 += 2;
        } while (num3 <= 100);
        System.out.println(sum3);
    }
}
