package chapter04.loop;

import java.util.Scanner;

public class C030_nestLoop2 {

    public static void main(String[] args) {
        // 숫자 맞추기
        Scanner scan = new Scanner(System.in);
        // 1~10 난수 발생
        int num = (int) (Math.random() * 10) + 1;

        for (;;) {
            System.out.print("숫자를 맞춰보세요 (1~10) : ");
            int input = scan.nextInt();
            if (input == num) {
                System.out.println("정답");
                break;
            } else if (input > num) {
                System.out.println(input + "보다 작음");
            } else {
                System.out.println(input + "보다 큼");
            }
        }
    }
}
