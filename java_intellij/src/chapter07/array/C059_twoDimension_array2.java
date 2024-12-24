package chapter07.array;

public class C059_twoDimension_array2 {

    public static void main(String[] args) {
        int[][] score = {
                { 77, 56, 70, 82 },
                { 99, 96, 89, 88 },
                { 81, 69, 62, 80 }
        };

        int classSum = 0;
        for (int student=0; student< score.length; student++) {
            int sum = 0;
            for (int subject=0; subject < score[0].length;
                 subject++) {
                sum += score[student][subject];
            }
            System.out.println((student+1) + "번 > 총점: "
                    + sum + ", 평균: " + (float)sum / score[0].length);
            classSum += sum;
        }
        System.out.print("학급 전체 평균: "
                + (float) classSum / (score.length * score[0].length));
    }

    public static class C066_shallowCopy {

        public static void main(String[] args) {
            // 얕은 복사
            Book[] bookArray1 = new Book[3];
            Book[] bookArray2 = new Book[3];
            Book[] bookArray3 = bookArray1;

            bookArray1[0] = new Book("태백산맥", "조정래");
            bookArray1[1] = new Book("데미안", "헤르만 헤세");
            bookArray1[2] = new Book("어떻게 살것인가", "유시민");

            System.arraycopy(bookArray1, 0, bookArray2, 0, 3);

            System.out.println("주소값1: " + bookArray1);
            System.out.println("주소값2: " + bookArray2);
            System.out.println("주소값3: " + bookArray3);

            bookArray1[0].setAuthor("박완서");
            bookArray1[0].setBookName("나목");

            System.out.println("=== bookArray1 ===");
            for (int i = 0; i < bookArray1.length; i++) {
                bookArray1[i].showBookInfo();
                System.out.println(bookArray1[i]);
            }
            System.out.println("=== bookArray2 ===");
            for (int i = 0; i < bookArray2.length; i++) {
                bookArray2[i].showBookInfo();
                System.out.println(bookArray2[i]);
            }
            System.out.println("=== bookArray3 ===");
            for (int i = 0; i < bookArray3.length; i++) {
                bookArray3[i].showBookInfo();
                System.out.println(bookArray3[i]);
            }
        }

    }
}
