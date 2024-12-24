package game;

public class Magician extends Novice implements Skill{

    public Magician(String name, int strength, int dexterity, int intelligence) {
        super(name, strength, dexterity, intelligence);
    }

    @Override
    public void attack() {
        System.out.println("매직 에로우");
    }

    @Override
    public void skill() {
        System.out.println("매직 클로");
    }
}
