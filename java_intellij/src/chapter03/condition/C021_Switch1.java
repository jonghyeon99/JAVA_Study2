package chapter03.condition;

public class C021_Switch1 {

    public static void main(String[] args) {
        // Switch - case 문
        int ranking = 2;

        switch (ranking) {
            case 1:
                System.out.println("금메달");
                break;
            case 2:
                System.out.println("은메달");
                break;
            case 3:
                System.out.println("동메달");
                break;
            default:
                System.out.println("참가상");
                break;
        }
    }
}
