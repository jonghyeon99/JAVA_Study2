package chapter14.exception;

public class C109_exception2 {

    public static void main(String[] args) {
        // 다중 예외 처리
        int a, b, c;
        a = 5;
        b = 2;
        int[] ar = {1, 2, 3, 4, 5};

/*
        Exception 상위관계
        Throwable
        Exception
        (런타임 시점)                (컴파일 시점)
        RuntimeException            IOException
        IndexOutOfBoundsException   FileNotFoundException
        ...                         ...
 */

        try {
            c = a / b;
            System.out.println("c = " + c);
            ar[5] = 100;
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누기 예외 발생");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("첨자가 배열 범위를 넘어섰습니다.");
        } catch (Exception e) { // 얘는 가장 마지막에
            // Exception e = new ArithmeticException();
            // 프로그램의 현재 실행 위치와 오류가 발생한 위치를 알려줌
            e.printStackTrace();
            // 예외에 대한 상세 메시지를 반환
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램 실행 완료");
    }
}
