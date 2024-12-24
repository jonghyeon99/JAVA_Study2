package chapter08.ingeritance;

class Human3 {
    Tool tool;
    Human3 (String toolName) {
        tool = new Tool(toolName);
    }
    void use() {
        System.out.println(tool.name + "을/를 사용한다.");
    }
}
class Tool {
    String name;
    Tool (String name) {
        this.name = name;
    }
}

public class C073_has_a {

    public static void main(String[] args) {
/*
        has a relation
        포함, 구성 관계
 */
        Human3 h = new Human3("파이어 스틸");
        System.out.println(h.tool.name);
        h.use();
    }
}

// has a 관계 부류
// 결합도
// 1. Aggregation(집합 관계) - 약한 소유권
class Car {
    private Engine engine;
    public Car (Engine engine){
        this.engine = engine;
    }
    public void assembleCar(Engine engine) {
        this.engine = engine;
    }
}
class Engine {}

// 2. Composition(구성 관계) - 강한 소유권
class House {
    private Room rooms = new Room();
}
class Room {}

