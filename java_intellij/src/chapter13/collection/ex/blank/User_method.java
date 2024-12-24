package chapter13.collection.ex.blank;

import java.util.*;

class UserNameComparator implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        return u1.getName().compareTo(u2.getName());
    }
}

public class User_method {
    Scanner scan = new Scanner(System.in);
    // 유저등록 리스트
    List<User> userList = new ArrayList<>();

    public void printMenu() {
        // 메뉴를 출력하는 코드 작성.
        System.out.println("== 유저관리 프로그램 ==\n" +
                            "  1. 유저정보 등록\n" +
                            "  2. 유저정보 조회\n" +
                            "  3. 전체정보 조회\n" +
                            "  0. 종       료\n" +
                            "==================");
        System.out.print("-> 메뉴의 번호 : ");
    }

    public void createUser() {
		/*
			유저정보를 등록하는 코드 작성.
			1. 아이디, 비밀번호, 이름, 핸드폰, 주소를 입력받는다.
			2. User 인스턴스 생성한다.
			3. 유저등록 리스트에 같은 아이디가 존재하는지 확인 후 존재하지 않으면 등록
		 */
        System.out.print("아이디 : ");
        String id = scan.nextLine();
        System.out.print("비밀번호 : ");
        String pw = scan.nextLine();
        System.out.print("이름 : ");
        String name = scan.nextLine();
        System.out.print("핸드폰 : ");
        String phone = scan.nextLine();
        System.out.print("주소 : ");
        String address = scan.nextLine();

        boolean exists = false;
        for (User user : userList) {
            if (user.getId().equals(id)) {
                exists = true;
                break;
            }
        }
        if (exists) {
            System.out.println("이미 같은 아이디가 존재합니다.");
        } else {
            userList.add(new User(id, pw, name, phone, address));
            System.out.println("[등록성공] 유저를 등록합니다.");
        }
    }

    public void selectUser() {
		/*
			유저정보를 조회하는 코드 작성.
			1. 유저등록 리스트에 유저정보가 존재하는지 확인
			2. 조회할 아이디, 확인용 비밀번호 입력 받는다.
			3. 조회할 아이디, 확인용 비밀번호가 유저등록 리스트에 저장된 비밀번호와 일치하면 유저정보 출력.
		 */
        if (userList.isEmpty()){
            System.out.println("유저정보가 존재하지 않습니다.");
        } else {
            System.out.print("아이디를 입력하세요: ");
            String id = scan.nextLine();
            boolean idExists = false;
            for (User user : userList) {
                if (user.getId().equals(id)) {
                    idExists = true;
                    break;
                }
            }
            if (idExists) {
                System.out.print("비밀번호를 입력하세요: ");
                String pw = scan.nextLine();
                boolean pwExists = false;
                for (User user : userList) {
                    if (user.getPw().equals(pw)) {
                        pwExists = true;
                        break;
                    }
                }
                if (pwExists) {
                    for (User user : userList) {
                        if (user.getPw().equals(pw)) {
                            System.out.println(user.toString());
                        }
                    }
                }
            } else {
                System.out.println("존재하지 않는 아이디입니다.");
            }

        }
    }

    public void selectALL() {
		/*
			유저 전체정보를 조회하는 코드 작성.
			1. 유저등록 리스트에 유저정보가 존재하는지 확인
			2. 전체정보를 출력
			   (단, '이름순'으로 정렬하여 출력할 것)
		 */
        if (userList.isEmpty()){
            System.out.println("유저정보가 존재하지 않습니다.");
        } else {
            Collections.sort(userList, new UserNameComparator());
            for (User u : userList) {
//                String result = String.format(
//                        "아이디: %s, 비밀번호: %s, 이름: %s, 핸드폰: %s, 주소: %s"
//                        , u.getId()
//                        , u.getPw()
//                        , u.getName()
//                        , u.getPhone()
//                        , u.getAddress()
//                );
                String result = u.toString();
                System.out.println(result);
            }
        }
    }
}
