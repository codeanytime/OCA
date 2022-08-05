package chapter_4.access_modifier.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        FunctionalInterfaceExample fc = (a, b) -> a;
        System.out.println(fc.max(3, 4));
        List<Student> list = new ArrayList();
        list.add(new Student(1, "thanh"));
        list.add(new Student(-2, "huy"));
        list.add(new Student(3, "cat"));
        list.forEach(s -> {
            s.setName(s.getName() + " after iterate");
            System.out.println(s.getName());
        });
//        List<Student> result = list.stream().filter(s -> s.getId() > 0).collect(Collectors.toList());
//        QueryStudent queryStudent = () -> result;
//        System.out.println(queryStudent.containsIdGreaterThanZero());
//        List<String> listStr = Arrays.asList("java", "c", "php", "python");
//        Collections.sort(listStr, String::compareTo);
//        System.out.println(listStr);
//
//        QueryStudent q = () -> list;
//        System.out.println(q.containsIdGreaterThanZero().size());


//        MathUtils math = (a, b) -> a + b;
//        System.out.println(math.add(1, 10));
//        System.out.println(math.add(10, 20));
//
//        MathUtils math2 = (a, b) -> a - b;
//
//        System.out.println(math2.add(20, 5));
//
//        Runnable r1 = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread 1 start");
//            }
//        };
//
//        Runnable r2 = () -> System.out.println("Thread 2 start");
//        r1.run();
//        r2.run();
        List<String> strList = Stream.of("thanh", "huy")
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(strList);
    }
}
