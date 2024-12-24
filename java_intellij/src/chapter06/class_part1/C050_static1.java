package chapter06.class_part1;

class Test1 {
    // 인스턴스 변수, 멤버 변수
    private String name1 = "홍길동";
    // 정적 변수, 멤버 변수
    public static final String name2 = "고길동";

    public void printName() {
        System.out.println(this.name1);
    }
}

public class C050_static1 {

    public static void main(String[] args) {
        Test1 ex = new Test1();
//        System.out.println(ex.name1);
        ex.printName();
        System.out.println(ex.name2);
        // 정적 변수는 인스턴스의 생성없이 클래스의 이름으로 호출 가능
        System.out.println(Test1.name2);
        
//        Test1.name2 = "이순신"; final은 상수
    }
}
