package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요:");
        int count = scan.nextInt();
        int[] arr = new int[count];
        System.out.println(count + "개의 정수를 입력하세요:");
        for (int i = 0; i < count; i++) {
            arr[i] = scan.nextInt();
        }
        int max = 0;
        int min = 0;

        for (int i = 0; i < count; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.println("가장 작은 정수 : " + min);
        System.out.println("가장 큰 정수 : " + max);
    }
}
