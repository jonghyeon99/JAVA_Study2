package chapter04.loop;

public class Loop_Example08 {

    public static void main(String[] args) {
/*
        1번                  2번
            *               *********
           ***               *******
          *****               *****
         *******               ***
        *********               *
 */
        // 1번 (1)
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i +1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // 1번 (2)
        for(int i = 1; i <= 5; ++i) {
            for(int j = 1; j < 5 + i; ++j) {
                if (j <= 5 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

        // 1번 (3)
        for (int i = 1; i <= 5; i++) {
            String spaces = " ".repeat(5-i);
            String stars = "*".repeat(2*i-1);
            System.out.println(spaces + stars);
        }
        System.out.println();

        // 2번 (1)
        for (int i = 5; i > 0; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // 2번 (2)
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j < 5+ i; j++) {
                if (j <= 5 - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();

        // 2번 (3)
        for (int i = 5; i >= i; i--) {
            String spaces = " ".repeat(5 - i);
            String stars = "*".repeat(2 * i - 1);
            System.out.println(spaces + stars);
        }
    }
}
