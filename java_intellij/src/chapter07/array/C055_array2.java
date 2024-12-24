package chapter07.array;

public class C055_array2 {

    public static void main(String[] args) {
        int[] score = new int[5];
        //데이터 할당을 위해서는 각 방에 접근해야 한다
        score[0] = 88;
        score[1] = 99;
        score[2] = 70;
        score[3] = 55;
        score[4] = 100;

        for (int i = 0; i < score.length; i++) {
            System.out.println((i+1) + "번 학생 성적:"
                    + score[i]);
        }

        //초기화
        int[] score2 = new int[] {88, 99, 70, 55, 100};

        for (int i = 0; i < score2.length; i++) {
            System.out.println((i+1) + "번 학생 성적:"
                    + score2[i]);
        }

    }

}