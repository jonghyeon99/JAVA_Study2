package chapter13.collection;

import java.util.*;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person {name='" + name + '\'' + ", age=" + age + '}';
    }
}

class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.name.compareTo(p2.name);
    }
}

public class Comparator_Example {

    public static void main(String[] args) {
/*
        Comparator : 두 매개변수 객체를 비교
 */
        // 1. Comparator를 구현한 클래스를 이용한 방법
        List<Person> list = new ArrayList<>();
        list.add(new Person("홍길동", 30));
        list.add(new Person("강감찬", 80));
        list.add(new Person("이순신", 45));

        Collections.sort(list, new PersonNameComparator());

        for (Person p : list) {
            System.out.println(p);
        }

        // 2. 익명객체를 이용한 방법
        Set<Person> set  = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.name.compareTo(p2.name);
            }
        });
        set.add(new Person("홍길동", 30));
        set.add(new Person("강감찬", 80));
        set.add(new Person("이순신", 45));

        for (Person p : set) {
            System.out.println(p);
        }
    }
}
