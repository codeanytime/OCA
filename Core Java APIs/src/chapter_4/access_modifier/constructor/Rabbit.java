package chapter_4.access_modifier.constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Rabbit {
    int age;
    String name;

    public Rabbit(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public Rabbit(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Rabbit r = new Rabbit(20);
        System.out.println(r.age);
        Rabbit r1 = new Rabbit(1, "Mickey");
        System.out.println(r1.name);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> test = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.println(test);
    }
}
