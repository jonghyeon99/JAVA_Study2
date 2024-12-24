package chapter04.loop;

import java.util.Scanner;

public class C033_dowhile {

    public static void main(String[] args) {
        // do-while 문
        Scanner scan = new Scanner(System.in);
        int num;
        int sum = 0;

        do {
            System.out.println("숫자 입력(종료는 0) : ");
            num = scan.nextInt();
            sum += num;
        } while (num != 0);
        System.out.println("총 합계  : " + sum);
    }
}
