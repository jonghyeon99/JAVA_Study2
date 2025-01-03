package chapter07.array;

public class C065_objectArrayCopy {

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
