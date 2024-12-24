package chapter03.condition;

import java.util.Scanner;

public class If_Example02 {

    public static void main(String[] args) {
/*
        세 개의 정수를 입력받아,
        If문을 활용하여 가장 큰 수를 출력한다.
        출력 결과:
            숫자1: 3
            숫자2: 1
            숫자3: 2
            최대값: 3
 */
        Scanner scan = new Scanner(System.in);

        System.out.print("숫자1 : ");
        int num1 = scan.nextInt();
        System.out.print("숫자2 : ");
        int num2 = scan.nextInt();
        System.out.print("숫자3 : ");
        int num3 = scan.nextInt();
        int max;

        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num1 && num2 > num3) {
            max = num2;
        } else {
            max = num3;
        }
        System.out.println("최대값 : " + max);
    }
}
