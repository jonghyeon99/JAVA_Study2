package chapter12.generic;
/*
    ?
    - 불특정한 타입을 가리키는 와일드카드

    <?> : Unbounded Wildcards (제한 없음)
    모든 클래스나 인터페이스 타입이 올 수 있음

    <? extends 상위타입> : Upper Bounded Wildcards (상위클래스 제한)
    상위 타입이나 상위 타입의 하위타입만 올 수 있음 - 상한선

    <? super 하위타입> : Lower Bounded Wildcards (하위클래스 제한)
    하위 타입이나 하위 타입의 상위타입만 올 수 있음 - 하한선
 */

class Human {
    void intro() {
        System.out.println("나 사람");
    }
}
class Student extends Human {
    void intro() {
        System.out.println("나 학생");
    }
}
class Room<T> {
    T value;
    Room(T value) {
        this.value = value;
    }
    T get() {
        return value;
    }
    void set(T value) {
        this.value = value;
    }
}
public class C098_generic_wildcards {

    static void printMan (Room<? extends Human> room) {
        // Human 클래스와 그 하위 클래스만
        room.get().intro();
    }

    static void printMan2 (Room<? super Human> room) {
        Object obj = room.get();

        if (obj instanceof Human) {
            Human h = (Human) obj;
            h.intro();
        } else {
            System.out.println("Human 또는 그 하위 타입입니다.");
        }
    }

    static void printMan3 (Room<?> room) {
        // 제네릭타입에 제한 없음
        Object obj = room.get();

        if (obj instanceof Human) {
            Human h = (Human) obj;
            h.intro();
        } else {
            System.out.println("Human 타입이 아닙니다.");
        }
    }

    public static void main(String[] args) {
        Human h = new Human();
        Room<Human> rh = new Room<>(h);
        printMan(rh);
        printMan2(rh);
        printMan3(rh);

        Student s = new Student();
        Room<Student> rs = new Room<>(s);
        printMan(rs);
        // printMan2(rs);  // err, student가 human보다 하위라 불가
        printMan3(rs);
    }
}
