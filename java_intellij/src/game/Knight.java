package game;

// 기사
public class Knight extends Novice implements Skill {

    public Knight(String name, int strength, int dexterity, int intelligence) {
        super(name, strength, dexterity, intelligence);
    }

    @Override
    public void attack() {
        System.out.println("베쉬 공격");
    }

    @Override
    public void skill() {
        System.out.println("파워 스트라이크");
    }
}
