package chapter06.class_part1;

public class Character {

    // 캐릭터  정보
    private String id;  // id
    private String job; // 직업
    private int level;  // 레벨
    private int str;    // 힘 스텟
    private int dex;    // 민첩 스텟
    private int intel;  // 지능 스텟

/*
    1. level, str, dex, intel 은 인스턴스 생성시 1로 초기화한다.
    2. 명시적 생성자 생성
        - id, job을 파라미터로 가지는 생성자
        - id, job, level, str, dex, intel 을 파라미터로 가지는 생성자
    3.skill() public 메서드 생성
        - 인스턴스의 job이 "마법사" 면 "파이어볼" 출력
        - 인스턴스의 job이 "전사" 면 "배쉬" 출력
        - 인스턴스의 job이 "궁수" 면 "크리티컬" 출력
        - 그 외 "기본공격" 출력
    4. 해당 인스턴스의 정보를 출력하는 메서드 생성
        - 출력형식
        [고구마(궁수) Lv5]님의 스탯: str(3), dex(11), intel(2)
 */
    {
        level = 1;
        str = 1;
        dex = 1;
        intel = 1;
    }
    public Character(String id, String job) {
        this.id = id;
        this.job = job;
    }
    public Character(String id, String job, int level, int str, int dex, int intel) {
        this.id = id;
        this.job = job;
        this.level = level;
        this.str = str;
        this.dex = dex;
        this.intel = intel;
    }
    public String getId() {
        return id;
    }
    public String getJob() {
        return job;
    }
    public void skill(String job) {
        if (job.equals("마법사")) {
            System.out.println("파이어볼러");
        } else if (job.equals("전사")) {
            System.out.println("배쉬");
        } else if (job.equals("궁수")) {
            System.out.println("크리티컬");
        } else {
            System.out.println("기본공격");
        }
    }
    public void stat() {
        System.out.printf("[%s(%s) Lv%d]님의 스탯: str(%d), dex(%d), intel(%d)%n", id, job, level, str, dex, intel);
    }
    public static void main(String[] args) {
        Character char1 = new Character("고구마", "궁수");
        char1.stat();
    }
}
