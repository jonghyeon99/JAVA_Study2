package chapter14.exception;

import java.util.Scanner;

public class C114_finally {

    public static void main(String[] args) {
        System.out.println("접속");
        try {
            System.out.println("전송");
            throw new Exception();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("예외 처리");
        } finally {
            System.out.println("접속 해제");
        }

        // AutoCloseable - 리소스를 사용하는 객체들이 더이상 필요하지 않을 때 자동으로 자원을 해제해줌 자동으로 할당 해제하는 close() 호출
        // try - with - resources 구문
//        Scanner scan = new Scanner(System.in);
//        int num1 = scan.nextInt();
//        System.out.println(num1);
//        scan.close();

        try (Scanner scan2 = new Scanner(System.in)) {
            System.out.print("숫자 입력: ");
            int num2 = scan2.nextInt();
            System.out.println(num2);
        } catch (Exception e) {
            System.out.println("예외처리");
        }
    }
}
