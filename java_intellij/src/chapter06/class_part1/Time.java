package chapter06.class_part1;

import java.time.LocalTime;

public class Time {
    boolean am;
    int hour;
    int minute;
    int second;

    // 초기화 블럭
    {
        System.out.println("초기화 블럭 실행");

        LocalTime now = LocalTime.now();
        hour = now.getHour();
        if (hour >= 12) {
            hour -= 12;
            am = false;
        } else {
            am = true;
        }
        minute = now.getMinute();
        second = now.getSecond();
    }

    // 기본 생성자
    Time() {
        System.out.println("기본 생성자 생성");
    }

    // 명시적 생생저
    Time(boolean am, int hour, int minute, int second) {
/*
        this
        - 클래스 내부에서는 해당 인스턴스를 부를 이름이 없음.
        - 인스턴스 이름이 각자 다르기 때문에 this를 사용해서 지금 다루는 데이터가 그 자신을 가리키도록 사용
        - 생성된 인스턴스 스스로를 가리키는 예약어(참조 변수)
 */
//        this.am = am;
//        this.hour = hour;
//        this.minute = minute;
        this(am, hour, minute);
        this.second = second;
        System.out.println("명시적 생성자4 실행");
    }

    Time(boolean am, int hour, int minute) {
        this(hour, minute);
        this.am = am;
//        this.hour = hour;
//        this.minute = minute;
        this.second = 0;
        System.out.println("명시적 생성자3 실행");
    }

    Time(int hour, int minute) {
        this.am = hour < 12;
        this.hour = hour = hour % 12;
        this.minute = minute;
        this.second = 0;
        System.out.println("명시적 생성자2 실행");
    }

    void whatTime() {
        System.out.println(am ? "오전" : "오후");
        System.out.println(hour + "시" + minute + "분" + second + "초");
    }
}
