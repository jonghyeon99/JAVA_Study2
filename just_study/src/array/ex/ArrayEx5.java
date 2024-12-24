package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("입력받을 정수의 개수를 입력하세요: ");
        int count = scan.nextInt();


        int[] arr = new int[count];
        int total = 0;
        System.out.println(count + "개의 정수를 입력하세요.");
        for (int i = 0; i < count; i++) {
            arr[i] = scan.nextInt();
            total += arr[i];
        }
        double avg = (double) total / count;
        System.out.println("입력한 정수의 합게: " + total);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
