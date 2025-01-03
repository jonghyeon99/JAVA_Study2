package chapter04.loop;

public class Loop_Example06 {

    public static void main(String[] args) {
/*
        1번                  2번
        *                   * * * * *
        * *                 * * * *
        * * *               * * *
        * * * *             * *
        * * * * *           *
 */
        // 1번
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("============");

        // 2번
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
