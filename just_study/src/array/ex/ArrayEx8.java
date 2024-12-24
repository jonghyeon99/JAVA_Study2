package array.ex;

import java.util.Scanner;

public class ArrayEx8 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("학생 수를 입력하세요: ");
        int studentCount = scan.nextInt();

        int[][] scores = new int[studentCount][3];
        String[] subject = {"국어", "영어", "수학"};
        for (int i = 0; i < studentCount; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subject[j] + " 점수: ");
                scores[i][j] = scan.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < scores.length; i++) {
            int total = 0;
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
            double avg = (double) total / scores[i].length;
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + avg);
        }
    }
}
