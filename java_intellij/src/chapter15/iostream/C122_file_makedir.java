package chapter15.iostream;

import java.io.File;
import java.io.FileWriter;

public class C122_file_makedir {

    public static void main(String[] args) throws Exception {
        File folder = new File("C:\\intellij_file_directory\\TestFolder");
        // 해당 경로에 실제 폴더를 생성
        if (folder.mkdir()) {
            File file = new File("C:\\intellij_file_directory\\TestFolder\\MyFile.txt");
            // MyFile.txt라는 File 객체를 생성
            if (file.createNewFile()) {
                FileWriter out = new FileWriter(file);
                out.write("테스트 파일");
                out.close();
            }
        }
    }
}
