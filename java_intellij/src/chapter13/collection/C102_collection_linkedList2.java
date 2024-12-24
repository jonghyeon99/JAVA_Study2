package chapter13.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class C102_collection_linkedList2 {

    public static void main(String[] args) {
        List<String> arName = new LinkedList<String>();
        arName.add("장보고");
        arName.add("김유신");
        arName.add("강감찬");
        arName.add("을지문덕");

        for (String s : arName) {
            System.out.print(s + " ");
        }
        System.out.println();
        /*
            Collections : 컬렉션 객체들을 조작하기 위한 유틸리티 클래스
         */
        // 정렬
//        Collections.sort(arName);
        // 역순 정렬
//        Collections.reverse(arName);    // 저장순서 역순
//        arName.sort(Collections.reverseOrder());    // 역순
        // 무작위
        Collections.shuffle(arName);
        for (String s : arName) {
            System.out.print(s + " ");
        }
        System.out.println();

        // 최대값 최소값
        String max = Collections.max(arName);
        String min = Collections.min(arName);
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
