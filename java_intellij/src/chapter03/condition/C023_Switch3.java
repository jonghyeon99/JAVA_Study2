package chapter03.condition;

public class C023_Switch3 {

    public static void main(String[] args) {
        // 문자열
        String country = "China";

        switch (country) {
            case "Korea":
                System.out.println("Seoul");
                break;
            case "China":
                System.out.println("Beijing");
                break;
            case "Japan":
                System.out.println("Tokyo");
                break;
        }

        // String 비교 ( == , equals() )
        String a = "안녕";
        String b = "안녕";
        System.out.println( a == b);

        String c = new String("안녕");
        System.out.println( a == c );

        System.out.println(a.equals(c));
    }
}
