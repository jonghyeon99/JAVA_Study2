package chapter09.polymorphism;

class Animal {
    void move() {
        System.out.println("동물이 움직입니다.");
    }
}
class Human extends Animal {
    @Override
    void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }
}
class Tiger extends Animal {
    @Override
    void move() {
        System.out.println("호랑이가 네 발로 뜁니다.");
    }
}
class Eagle extends Animal {
    @Override
    void move() {
        System.out.println("독수리가 하늘을 납니다.");
    }
}
public class C074_polymorphism {
    public static void main(String[] args) {
//        moveHuman(new Human());
//        moveTiger(new Tiger());
//        moveEagle(new Eagle());
        move(new Human());  // Animal a = new Human();
        move(new Tiger());  // Animal b = new Tiger();
        move(new Eagle());  // Animal c = new Eagle();
    }
    public static void move(Animal animal) {
        animal.move();
    }
//    public static void moveHuman(Human human) {
//        human.move();
//    }
//    public static void moveTiger(Tiger tiger) {
//        tiger.move();
//    }
//    public static void moveEagle(Eagle eagle) {
//        eagle.move();
//    }
}
