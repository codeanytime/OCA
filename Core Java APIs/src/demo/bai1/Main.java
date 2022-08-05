package demo.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Student s = new Student(1, "thanh");
//        System.out.println("Before process: " + s.getName());
//        process(s);
//        System.out.println("After process: " + s.getName());
//        System.out.println(s.hashCode());
//        s.Student();
//        Student s2 = new Student(33);
//        System.out.println(s2.getName());
        List<Student> list = new ArrayList<>();
        list.add(s);
        list.add(new Student(2, "huy"));
        list.add(new Student(10, "an"));

        List<Student> result = list.stream().filter(Student.predicateNameContainsA()).collect(Collectors.toList());

    }

    public static void process(Student s) {
        s = new Student(1, "cat");
        System.out.println(s.hashCode());
        s.setName("Huy");
    }
}
