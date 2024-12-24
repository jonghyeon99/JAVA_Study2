package chapter14.exception;

public class C113_throw3 {

    public static void main(String[] args) throws Exception {
        String name = null;
        try {
            printScore(name) ;
        } catch (Exception e) {
            System.out.println("예외 처리");
        }
    }

    static void printScore(String name) throws Exception {  // throws 예외처리를 넘기는, 던지는 키워드
        if (name == null) {
            throw new Exception("이름이 무효합니다.");
        }
        System.out.println(name.length());
    }
}
