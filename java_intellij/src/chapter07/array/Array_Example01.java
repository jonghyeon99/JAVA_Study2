package chapter07.array;

import java.util.Scanner;

public class Array_Example01 {

    public static void main(String[] args) {
/*
		Original : 10 20 30 40 50 60 70 80 90 100
		변경하고 싶은 위치1을 입력하세요
		1
		변경하고 싶은 위치2를 입력하세요
		10
		New : 100 20 30 40 50 60 70 80 90 10
*/
        Scanner scan = new Scanner(System.in);
        int arr[] = {10,20,30,40,50,60,70,80,90,100};

        System.out.print("Original: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("변경하고 싶은 위치1: ");
        int before = scan.nextInt();
        System.out.print("변경하고 싶은 위치2:");
        int after = scan.nextInt();
        int temp;

        temp = arr[before-1];
        arr[before-1] = arr[after-1];
        arr[after-1] = temp;

        System.out.print("new: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
