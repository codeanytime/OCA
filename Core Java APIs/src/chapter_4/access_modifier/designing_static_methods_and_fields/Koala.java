package chapter_4.access_modifier.designing_static_methods_and_fields;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Koala {
    private static int count;
    private static final List<Integer> arrList = new ArrayList();

    private static void testStaticMethod() {
        count++;
    }

    private void instanceMethod() {
        count++;
        testStaticMethod();
    }

    private static void callInstanceMethodFromStaticMethod() {
        new Koala().instanceMethod();
    }

    public static void main(String[] args) {
        Koala k1 = new Koala();
        System.out.println(Koala.count);
        Koala k2 = new Koala();
        k2.count = 5;
        System.out.println(Koala.count);
        k2 = null;
        System.out.println(Koala.count);
        System.out.println(k2.count);
        System.out.println(arrList);
        List<Integer> test = Arrays.asList(1, 2);
        List<Integer> test1 = test.stream().map(integer -> integer + 1).collect(Collectors.toList());
        System.out.println(test1);
    }
}
