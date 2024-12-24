package chapter07.array;

import java.util.Scanner;

public class Theater_Method {
    // 멤버변수
    private int[][] seats = new int [7][7];
    private final Scanner scan = new Scanner(System.in);



    // 멤버 메서드
    public void printMenu() {
        String result = """
				메뉴의 번호를 선택해주세요.
				==================
				1. 좌석 확인
				2. 좌석 예약
				0. 종료
				==================
				번호를 선택하세요 :
				""";
        System.out.print(result);
    }
    public void seatInfo() {
        System.out.println();
        System.out.println("* 좌석 예약 정보 *");
        System.out.println("=================");
        System.out.println("   1 2 3 4 5 6 7");
        System.out.println("=================");
        for (int i = 0; i < seats.length; i++) {
            System.out.print((i+1) + "| ");
            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public int inputCnt() {
        System.out.print("예약할 좌석의 수를 입력하세요: ");
        int num = scan.nextInt();
        return num;
    }
    public void reservationSeats(int cnt) {
        for (int i = 0; i < cnt; i++) {
            System.out.print("예약할 좌석의 행: ");
            int row = scan.nextInt();
            System.out.print("예약할 좌석의 열: ");
            int col = scan.nextInt();

            if (seats[row-1][col-1] != 1) {
                seats[row-1][col-1] = 1;
                System.out.println("예약되었습니다.");
            } else {
                System.out.println(row + "행 " + col + "열은 이미 예약된 좌석입니다.");
                i--;
            }
        }
    }
    public void printText(int num) {
        switch(num) {
            case 1:
                System.out.println("프로그램을 종료합니다.");
                break;
            case 2:
                System.out.println("번호를 잘못 입력하셨습니다.");
                break;
        }
    }
}
