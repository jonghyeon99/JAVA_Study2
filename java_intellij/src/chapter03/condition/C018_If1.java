package chapter03.condition;

public class C018_If1 {

    public static void main(String[] args) {
        // if 문
        int age = 15;

        if (age > 19) {
            System.out.println("성인입니다.");
            System.out.println("출력1");
        }

        // 명령어 1줄은 조건문에  포함
        if (age > 19)
            System.out.println("성인입니다.");
            System.out.println("출력1");

        // if - else 문
        if (age > 19) {
            System.out.println("성인입니다.");
        } else {    // age < 19
            System.out.println("어린이입니다.");
        }

        // if - elseif - else 문
        if (age > 19) {
            System.out.println("성인입니다.");
        } else if (age > 12) {
            System.out.println("청소년입니다.");
        } else {
            System.out.println("어린이입니다.");
        }

        // if - else if
        if (age >= 19) {
            System.out.println("성인입니다.");
        } else if (age > 12) {
            System.out.println("청소년입니다");
        } else if (age > 5) {
            System.out.println("유아입니다.");
        }
    }
}
