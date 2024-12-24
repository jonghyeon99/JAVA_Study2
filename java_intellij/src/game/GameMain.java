package game;

import java.util.Scanner;

public class GameMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        GameMain_Method gm = new GameMain_Method();
        Novice character = null;
        Skill skill = null;
        int num = 0;

        while (true) {
            gm.printMenu();
            num = scan.nextInt();
            switch (num) {
                case 1:
                    character = gm.createCharacter();
                    System.out.println(character);
                    break;
                case 2:
                    if (character != null)
                        gm.characterInfo(character);
                    else
                        gm.printText(3);
                    break;
                case 3:
                    if (character != null){
                        int jobNum = gm.numberInput();
                        character = gm.jobSelect(jobNum, character);
                    } else {
                        gm.printText(3);
                    }
                    break;
                case 4:
                    if (character != null)
                        character.attack();
                    else
                        gm.printText(3);
                    break;
                case 5:
                    if (character != null) {
                        skill = gm.skill(character);
                        if (skill != null)
                            skill.skill();
                        else
                            gm.printText(4);
                    } else
                        gm.printText(3);
                    break;
                case 0:
                    gm.printText(1);
                    return;
                default:
                    gm.printText(2);
            }
        }

    }
}
