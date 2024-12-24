package chapter15.iostream;

import java.io.FileReader;
import java.io.FileWriter;

public class C117_ioStream_letter {

    public static void main(String[] args) throws Exception {
        // 문자 단위 입출력
        String str = "자바 Stream 입출력";
        FileWriter out = new FileWriter("test2.txt");
        out.write(str);
        out.close();
        System.out.println("write success");

        // 한 문자씩 읽기
        FileReader in = new FileReader("test2.txt");
        int ch;
        for (;;) {
            ch = in.read();
            if (ch == -1) break;
            System.out.println((char)ch);
        }
        in.close();
    }
}
