package chapter12.generic;

/*
    타입 한정 키워드 extends
    <T extends [제한 타입]> : 상한 제한
 */
class Calculator<T extends Number> {
    void add(T a, T b) {}
    void min(T a, T b) {}
    void mul(T a, T b) {}
    void div(T a, T b) {}
}

public class C096_generic_range1 {

    public static void main(String[] args) {
        Calculator<Number> cal1 = new Calculator<>();
        Calculator<Integer> cal2 = new Calculator<>();
        Calculator<Double> cal3 = new Calculator<>();
        // 상한선으로 Number 까지라 컴파일 에러
        // Calculator<String> cal4 = new Calculator<>();
        // Calculator<Object> cal5 = new Calculator<>();
    }
}
