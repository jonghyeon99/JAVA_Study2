package chapter14.exception;

public class C112_throw2 {

    public static void main(String[] args) {
        String name = null;
//        printScore(name);
//        System.out.println("프로그램 실행 완료");

        try {
            System.out.println(1);
            printScore(name);
            System.out.println(2);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("프로그램 실행 완료");
    }

    static void printScore(String name) {
        if (name == null) {
            // 예외를 강제로 발생
            throw new NullPointerException("이름이 무효합니다.");
        }
        System.out.println(name.length());
    }
}
