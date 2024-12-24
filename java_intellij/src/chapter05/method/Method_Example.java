package chapter05.method;

import java.util.Scanner;

public class Method_Example {

    public static void main(String[] args) {
        // 전체 구구단을 출력하는 메서드 작성하기
        // 메서드 호출
        ninenine();
        System.out.println("========================================");

        // 특정 단 출력
        Scanner scan = new Scanner(System.in);
        System.out.print("단 : ");
        int num = scan.nextInt();
        ninenine(num);
    }

    // 메서드 정의
    public static void ninenine() {
        for (int i = 1; i <= 9; i++) {
            System.out.println("* [" + i + "] 단");
            for (int j = 1; j <= 9; j++) {
                System.out.print(i + " X " + j + " = " + i * j + " ");
            }
            System.out.println();
        }
    }

    public static void ninenine(int num) {
        for (int i  = 1; i <= 9; i++) {
            System.out.print(num + " X " + i + " = " + num * i + " ");
        }
    }
}
