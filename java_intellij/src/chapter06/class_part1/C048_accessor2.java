package chapter06.class_part1;

class Time2 {
    private boolean am;
    private int hour;
    private int minute;
    private int second;

    Time2 (int hour, int minute, int second) {  // 명시적 생성자
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {return hour;}
    public void setHour(int hour) {
        if (0 <= hour && hour <= 23) {
            this.am = hour < 12;
            this.hour = hour % 12;
            if (this.hour == 0)
                this.hour = 12;
        }
    }

    public int getMinute() {return minute;}
    public void setMinute(int minute) {
        if (0 <= minute && minute <= 59) {
            this.minute = minute;
        }
    }

    public int getSecond() {return second;}
    public void setSecond(int second) {
         if (0 <= second && second <= 59) {
             this.second = second;
         }
    }

    void whatTime2() {
        System.out.println(am ? "오전 " : "오후 ");
        System.out.println(hour + "시 " + minute + "분 " + second + "초");
    }
}

public class C048_accessor2 {

    public static void main(String[] args) {
        Time2 now = new Time2(12, 34, 56);
//        System.out.println(now.hour);
        now.whatTime2();
        System.out.println(now.getHour());
        now.setHour(34);    // 변경 거부
        System.out.println(now.getHour());
        now.setHour(10);    // 변경 가능
        now.setMinute(10);  // 변경 가능
        now.setSecond(10);  // 변경 가능
        now.whatTime2();
    }
}
