package chapter00.basic;

public class C003_PrintTest {

    public static void main(String[] args) {
        // 출력을 도와주는 메서드
        System.out.println("안녕");	// 줄바꿈(개행) O
        System.out.print("안녕");		// 줄바꿈(개행) X
        System.out.println("하세요");

        // 문자
        System.out.println('가');
        char char1 = '가';
        System.out.println(char1);

        System.out.println("가나다라");
        String char2 = "가나다라";
        System.out.println(char2);

        // 숫자
        System.out.println(1234);
        int num1 = 1234;
        System.out.println(num1);

        System.out.println(3.14);
        double num2 = 3.14;
        System.out.println(num2);
    }

}
