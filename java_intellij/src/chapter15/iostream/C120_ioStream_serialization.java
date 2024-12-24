package chapter15.iostream;

import java.io.*;

class Person implements Serializable {
    /*
        객체 고유 번호
        serialVersionUID는 직렬화된 클래스의 버전을 나타내는 고유한 ID
        역직려화 할 때 버전 호환성을 확인하는데 사용
        클래스가 수정되면, serialVersionUID 값도 변경되어야 한다.
        동일한 serialVersionUID를 가진 클래스는 동일한 직렬화 버전을 가진다고 간주
     */
    private static final long serialVersionUID = 1L;

    String name;
    String job;
//    transient String job; // 직렬화 대상 제외

    public Person() {}
    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return name + ", " + job;
    }
}

public class C120_ioStream_serialization {

    public static void main(String[] args) {
/*
        직렬화 (Serialization) : 객체를 바이트 스트림으로 변환하는 과정. 이 과정에서 객체의 상태와 구조가 바이트 배열로 변환
        역직렬화 (Deserialization) : 바이트 스트림을 다시 객체로 복원하는 과정. 이 과정에서 바이트 배열을 읽어 객체의 상태와 구조를 복원

        직렬화의 필요성
            - 파일 저장 : 객체의 상태를 파일에 저장하고 나중에 읽어서 복원 가능
            - 네트워크 전송 : 객체를 네트워크를 통해 전송할 때, 객체를 바이트 스트림으로 변환하여 전송 가능
            - 세션 관리 : 웹 어플리케이션에서 세션 상태를 저장하거나 복원할 때 사용

        데이터 직렬화 종류
            - CSV, JSON, XML
            - Binary 직렬화
            - JAVA 직려화
 */

        // 직렬화
        Person personAhn = new Person("안재용", "대표이사");
        Person personKim = new Person("김철수", "상무이사");

        try (FileOutputStream fos = new FileOutputStream("serial.out");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(personAhn);
            oos.writeObject(personKim);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 역직렬화
        try (FileInputStream fis = new FileInputStream("serial.out");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person p1 = (Person) ois.readObject();
            Person p2 = (Person) ois.readObject();

            System.out.println(p1);
            System.out.println(p2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
