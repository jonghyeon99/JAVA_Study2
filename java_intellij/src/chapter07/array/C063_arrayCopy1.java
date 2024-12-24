package chapter07.array;

public class C063_arrayCopy1 {

    public static void main(String[] args) {
        int i = 123, i2 = 123;
        int[] ar = {1 , 2, 3}, ar2 = {1, 2, 3};
        int[] ar3 = ar;

        // 배열의 이름과 해시 코드가 포함된 문자열이 출력
        System.out.println("i와 i2 : " + (i == i2 ? "같다" : "다르다"));
        System.out.println("ar과 ar2 : "+ (ar == ar2 ?"같다":"다르다"));
        System.out.println(ar);
        System.out.println(ar2);
        System.out.println("ar과 ar3 : "+ (ar == ar3 ?"같다":"다르다"));
        System.out.println(ar);
        System.out.println(ar3);

    }

}
