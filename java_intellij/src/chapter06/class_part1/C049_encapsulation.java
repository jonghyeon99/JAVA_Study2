package chapter06.class_part1;

/*
        멤버변수의 경우 보통 private를 사용하여 외부로부터 직접적인 접근을 막고
        getter/setter라 부르는 멤버메서드를 만들어 사용함으로써
        내부 데이터에 제한적 접근을 할 수 있도록 한다.
 */

class Member {
    private String id;
    private String pw;
    private String phone;

    public Member(String id, String pw, String phone) {
        this.id = id;
        this.pw = pw;
        this.phone = phone;
    }
    // getter / setter
    public String getId() {
        return id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void memberInfo(String pwCheck) {
        // this.pw == pwCheck
        if (this.pw.equals(pwCheck)) {
            System.out.println("[ 회원 정보 ]");
            System.out.println(" * 아이디 : " + this.id);
            System.out.println(" * 핸드폰 : " + this.phone);
        }
    }
}
public class C049_encapsulation {

    public static void main(String[] args) {
        Member member = new Member("hong", "123", "01012345678");
//        System.out.println(member.id());  // err  직접적인 접근 불가
        System.out.println(member.getId());
        System.out.println(member.getPhone());
        member.memberInfo("123");
    }
}
