package chapter01.data;

public class C012_ArithmeticConversion {

    public static void main(String[] args) {
        // 연산 중 형 변환(산술 형변환)
        double dNum = 1.2;
        float fNum = 0.9F;

        int iNum = (int) dNum + (int) fNum;
        int iNum2 = (int) (dNum + fNum);
        double dNum2 = dNum + fNum; // 다른 타입끼리 연산이 이루어지면 더 큰 타입을 따라간다.

        System.out.println(iNum);
        System.out.println(iNum2);
        System.out.println(dNum2);
    }

}
