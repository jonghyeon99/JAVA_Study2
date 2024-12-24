package chapter06.class_part1;

class Human {
    int age;
    String name;

    void intro() {
        System.out.println("안녕, " + age + "살 " + name + "이라고 해.");
    }
}

public class C043_class_basic2 {

    public static void main(String[] args) {
        Human kim = new Human();
        kim.age = 20;
        kim.name = "김상형";
        kim.intro();

        // 인스턴스 생성
        Human lee = new Human();

        lee.intro();
    }
}
