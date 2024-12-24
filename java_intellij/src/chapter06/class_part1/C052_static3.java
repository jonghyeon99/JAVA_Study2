package chapter06.class_part1;

class Student {
    public static int serialNum;
    public String StudentName;

    static {    // 클래스 초기화 블럭
        serialNum = 1000;
    }

    {   // 인스턴스 초기화 블럭
        serialNum++;
    }

    // 기본 생성자
    public Student() {
    }
    // 명시적 생성자
    public Student(String name) {
        this.StudentName = name;
    }
    // getter / setter
    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }
}

public class C052_static3 {

    public static void main(String[] args) {
        System.out.println(Student.serialNum);

        Student studentLee = new Student();
        studentLee.setStudentName("이지원");
        System.out.println("이지원의 학번 : " + studentLee.serialNum);
        System.out.println(Student.serialNum);

        Student studentSon = new Student();
        studentLee.setStudentName("손수경");
        System.out.println("손수경의 학번 : " + studentSon.serialNum);
        System.out.println(Student.serialNum);

        Student studentPark = new Student("박미경");
        System.out.println("박미경의 학번 : " + studentPark.serialNum);
        System.out.println(Student.serialNum);
    }
}
