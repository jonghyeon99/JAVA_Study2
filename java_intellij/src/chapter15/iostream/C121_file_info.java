package chapter15.iostream;

import java.io.File;

public class C121_file_info {

    public static void main(String[] args) {
        File f = new File("c:\\intellij_file_directory\\fileTest.txt");
        if (f.exists()) {   // 파일이 존재하는지 안 하는지 여부 체크
            if (f.isFile()) {   // 파일인지를 여부 체크
                System.out.println("파일입니다.");
                System.out.println("파일경로: " + f.getParent());
                System.out.println("파일이름: " + f.getName());
                System.out.println("파일크기: " + f.length());
                System.out.println("숨김파일: " + f.isHidden());
                System.out.println("절대경로: " + f.isAbsolute());
            } else if (f.isDirectory()) {   // 경로인지를 여부 체크
                System.out.println("디렉터리입니다.");
            }
        } else {
            System.out.println("파일이 없습니다.");
        }
    }
}
