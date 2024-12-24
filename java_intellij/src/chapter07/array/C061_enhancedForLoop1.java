package chapter07.array;

public class C061_enhancedForLoop1 {

    public static void main(String[] args) {
        // 강화된 for문 = foreach문
        int[] score = { 88, 94, 72, 74, 23 };
        int sum = 0;
        //  (요소   : 반복대상)
        for (int s : score) {
            sum += s;
        }
        System.out.println("총점: " + sum);
        System.out.println("평균: " + (float) sum
                / score.length);


        System.out.println("===============");
        // foreach는 읽기 전용 반복문
        // 요소 s는 배열 요소의 사본일 뿐 원본에 영향X
        int[] score2 = { 88, 94, 72, 74, 23 };
        for (int s : score2) {
            s++;
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println("score2[0]= "
                + score2[0]);

    }

    public static class C065_objectArrayCopy {

        public static void main(String[] args) {
            // 객체 배열 출력
            Book[] bookArray = new Book[3];

            bookArray[0] = new Book("태백산맥", "조정래");
            bookArray[1] = new Book("데미안", "헤르만 헤세");
            bookArray[2] = new Book("어떻게 살 것인가", "유시민");

            for (int i = 0; i < bookArray.length; i++) {
                bookArray[i].showBookInfo();
            }

            System.out.println("========================");
            // 객체 배열 복사
            Book[] bookArray1 = new Book[3];
            Book[] bookArray2 = new Book[3];

            bookArray1[0] = new Book("태백산맥", "조정래");
            bookArray1[1] = new Book("데미안", "헤르만 헤세");
            bookArray1[2] = new Book("어떻게 살 것인가", "유시민");

            // 얕은 복사
            System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
            for (int i = 0; i < bookArray2.length; i++) {
                bookArray2[i].showBookInfo();
            }
            //배열비교
            System.out.println(bookArray1);
            System.out.println(bookArray2);
            //객체비교
            System.out.println(bookArray1[0]);
            System.out.println(bookArray2[0]);




        }

    }
}
