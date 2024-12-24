package chapter03.condition;

import java.util.Scanner;

public class If_Example01 {

    public static void main(String[] args) {
/*
        사각혀의 넓이 구하기
        가로, 세로의 길이를 입력받아 넓이를 구하시오.
        단, 가로와 세로의 길이를 비교하여 정사각형 or 직사각형을 출력한다.
        출력 결과 :
            가로 입력 : 5
            세로 입력 : 4
            직사각형의 넓이는 20입니다.
 */
        Scanner scan = new Scanner(System.in);

        System.out.print("가로 입력 : ");
        int width = scan.nextInt();
        System.out.print("세로 입력 : ");
        int height  = scan.nextInt();
        int area = width * height ;
        String square = "";

        if (width <= 1 || height <= 1) {
            System.out.println("1 이상의 변을 입력해주세요.");
        } else if (width == height ){
            square = "정사각형";
        } else {
            square = "직사각형";
        }

        System.out.println(square + "의 넓이는 " + area + "입니다.");
    }
}
