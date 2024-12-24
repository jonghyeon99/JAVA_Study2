package chapter01.data;

public class Example3 {

    public static void main(String[] args) {
/*
 		변수의 교환
 		(직접적인 값의 대입이 아닌 변수를 통한 값 이동할 것)
 		출력 결과 :
 			교환 전
 			x = 100
 			y = 200
 			교환 후
 			x = 200
 			y = 100
 */
        int x = 100;
        int y = 200;
        int z;
        System.out.println("교환 전");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        z = x;
        x = y;
        y = z;
        System.out.println("교환 후");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

}
