package chapter15.iostream;

import java.io.BufferedReader;
import java.io.FileReader;

public class C118_ioStream_buffer {

    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new FileReader("test2.txt"));
        char[] text = new char[20];
        int num = in.read(text);
        System.out.println("읽은 문자 개수 : " + num);
        System.out.println(text);
        in.close();
    }
}
