package chapter03.condition;

import java.util.Scanner;

public class If_Example06 {

    public static void main(String[] args) {
/*
        BMI 계산하기
        BMI (체질량지수)는 몸무게를 키(미터단위)의 제곱으로 나누어서 계산한다.
        이 계산 결과에 따라 다음과 같이 판단된다.
        - 저체중 : 18.5 미만
        - 정상 : 18.5 이상, 23 미만
        - 과체중 : 23 이상 25 미만
        - 비만 : 25 이상

        키(cm), 몸무게를 입력받아 BMI를 계산하시오.
        출력결과:
            키 : 180.8
            몸무게 : 80.5
            BMI 지수 : 24.626292192027567 (과체중)
 */
        Scanner scan = new Scanner(System.in);

        System.out.print("키 : ");
        float height = scan.nextFloat();

        System.out.print("몸무게 : ");
        float weight = scan.nextFloat();
        float bmi = weight / ((height / 100) * (height / 100));
        //float bmi = weight / Math.pow(height/100, 2);
        String result = "";

        if (bmi < 18.5) {
            result = "저체중";
        } else if (bmi < 23) {
            result = "정상";
        } else if (bmi < 25) {
            result = "과체중";
        } else {
            result = "비만";
        }

        System.out.print("BMI 지수 : " + bmi + " (" + result + ")");
    }
}
