package chapter03.condition;

import java.util.Scanner;

public class If_Example04 {

    public static void main(String[] args) {
/*
        등급 나누기
        점수(0~100 사이의 정수)를 입력받아 등급을 출력한다.
        등급은 수, 우, 미, 양, 가 로 구분한다.
        단, 0~100 이외의 숫자를 입력시 "잘못 입력했습니다" 문구를 출력하고, 프로그램을 종료한다.
        System.exit(0); // 프로그램 종료시키는 메서드
        출력 결과 :
            점수 입력 : 87
            우
 */
        Scanner scan = new Scanner(System.in);

        System.out.print("점수 입력 : ");
        int num = scan.nextInt();

        if (num < 0 || 100 < num) {
            System.out.println("잘못 입력했습니다.");
        } else if (90 <= num && num <= 100) {
            System.out.println("수 ");
        } else if (80 <= num && num < 90) {
            System.out.println("우");
        } else if (70 <= num && num < 80) {
            System.out.println("미");
        } else if (60 <= num && num < 70) {
            System.out.println("양");
        } else {
            System.out.println("가");
        }
        System.exit(0);

//        if (num < 0 || 100 < num) {
//            System.out.println("잘못 입력했습니다.");
//        } else if (90 <= num) {
//            System.out.println("수 ");
//        } else if (80 <= num) {
//            System.out.println("우");
//        } else if (70 <= num) {
//            System.out.println("미");
//        } else if (60 <= num) {
//            System.out.println("양");
//        } else {
//            System.out.println("가");
//        }
    }
}
