package array.ex;

import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("다섯 개의 정수를 입력하세요:");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        System.out.println("출력");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i  > 0)
                System.out.print(", ");
        }
    }
}
