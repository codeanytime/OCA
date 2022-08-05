package chapter_4.access_modifier.designing_static_methods_and_fields;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.*;

public class Main {
    private static final int a;
    private static final int b;
    private static int c;

    static {
        a = 1;
        b = 2;
        c = 5;
        c--;
    }

    static String rename(String s) {
        s = "rename";
        return s;
    }
    public static void main(String[] args) {
        Student s1 = new Student("thanh");
        Student s2 = new Student("huy");
        out.println(Student.count);
        out.println(a);
        out.println(c);
        List<String> listStr = Arrays.asList("hello", "world");
        out.println(listStr.get(0));
        out.println(listStr.get(1));
        String s = "test";
        s = rename(s);
        out.println(s);
    }
}
