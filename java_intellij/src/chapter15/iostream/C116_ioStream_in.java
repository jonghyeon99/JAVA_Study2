package chapter15.iostream;

import java.io.FileInputStream;

public class C116_ioStream_in {

    public static void main(String[] args) throws Exception{
        FileInputStream in = new FileInputStream("test.txt");
        int data;
        for (;;) {
            // FileInputStream에서 한 바이트를 읽어 data 변수에 저장
            data = in.read();
            // data가 -1이면 파일의 끝에 도달한 것이므로 루프를 종료
            // (-1은 파일 읽기 스트림에서 파일의 끝을 나타내는 표준 값)
            if (data == -1)
                break;
            System.out.print(data);
        }
        in.close();

        // 2
        try (FileInputStream in2 = new FileInputStream("test.txt")) {
            int data2;
            for (;;) {
                data2 = in2.read();
                if (data2 == -1)
                    break;
                System.out.println(data2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
