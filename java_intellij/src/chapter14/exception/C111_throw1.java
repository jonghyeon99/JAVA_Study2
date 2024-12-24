package chapter14.exception;

public class C111_throw1 {

    public static void main(String[] args) {
//        String name = "빌게이츠";
        String name = null;
        printScore(name);
    }

    static void printScore(String name) {
//        System.out.println(name.length());
        try {
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("이름이 무효합니다.");
        }
    }
}
