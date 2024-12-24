package chapter04.loop;

public class C032_while2 {

    public static void main(String[] args) {
        // 1~100합
        int sum = 0;
        int i = 1;

        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}
