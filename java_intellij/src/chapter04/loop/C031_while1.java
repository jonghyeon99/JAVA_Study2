package chapter04.loop;

public class C031_while1 {

    public static void main(String[] args) {
        // while 문
        int filesize = 720;
        int download = 0;

        while (download < filesize) {
            download += 120;
            System.out.println(download + " K 다운로드 중...");
        }
        System.out.println("다운로드 완료");
    }
}
