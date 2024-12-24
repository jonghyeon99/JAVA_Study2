package chapter00.basic;

import java.util.Scanner;

public class C005_InputTest {

    public static void main(String[] args) {
        // 입력
        Scanner scan = new Scanner(System.in);

        System.out.print("byte: ");
        byte a = scan.nextByte();
        System.out.println(a);

        System.out.println("short: ");
        short b = scan.nextShort();
        System.out.println(b);

        System.out.println("int: ");
        int c = scan.nextInt();
        System.out.println(c);

        System.out.println("long: ");
        long d = scan.nextLong();
        System.out.println(d);

        System.out.println("float: ");
        float e = scan.nextFloat();
        System.out.println(e);

        System.out.println("double: ");
        double f = scan.nextDouble();
        System.out.println(f);

        System.out.println("String: ");
        String g = scan.next();
    }

}
