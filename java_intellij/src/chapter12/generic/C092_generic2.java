package chapter12.generic;

import java.util.ArrayList;

public class C092_generic2 {
    /*
        제네릭
        - 데이터 타입의 다형성
        - 참조형 데이터 타입만 가능

        장점
        - 클래스 외부에서 타입을 지정해주기 때문에 따로 타입을 체크하고 변환할 필요X
        - 컴파일 시에 의도하지 않은 타입이 들어오는 걸 막을 수 있음 (타입 안정성)
        - 코드의 재사용성이 높아짐
     */
    public static void main(String[] args) {
        // 제네릭타입을 명시하지 않았을 경우 컴파일 단계에서 에러를 알 수 없음
        ArrayList arNum = new ArrayList();
        arNum.add(1);
        arNum.add("문자열");

        int value = (int) arNum.get(0);
        // int temp = (int) arNum.get(1); // err

        // 제네릭타입 사용
        ArrayList<Integer> arNum2 = new ArrayList();
        arNum2.add(1);
        // arNum2.add("문자열");
    }
}
