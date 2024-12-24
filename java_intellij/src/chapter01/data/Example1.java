package chapter01.data;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        // int, double, String 타입의 데이터를 입력받아 입력값을 출력하세요.
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력해주세요: ");
        int a = scan.nextInt();
        System.out.println("int: " + a);

        System.out.print("실수를 입력해주세요: ");
        double b = scan.nextDouble();
        System.out.println("double: " + b);
        scan.nextLine();

        System.out.print("문자열을 입력해주세요: ");
        String c = scan.nextLine(); // Enter 치기 전 입력받은 모든 문자열 출력
        System.out.println("StringLine: " + c);

        System.out.print("문자열을 입력해주세요: ");
        String d = scan.next(); // 공백 전까지의 단어를 출력(문자 전 공백은 무시)
        System.out.println("String: " + d);

    }

}
