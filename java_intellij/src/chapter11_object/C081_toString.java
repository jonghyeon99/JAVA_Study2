package chapter11_object;

public class C081_toString {

    public static void main(String[] args) {

        int i = 100;
        System.out.println(i);

        Human kim = new Human(29, "김상형");
        System.out.println(kim);
        System.out.println(kim.toString());
    }

}
