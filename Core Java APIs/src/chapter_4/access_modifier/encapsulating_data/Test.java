package chapter_4.access_modifier.encapsulating_data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> test = new ArrayList();
        test.add("hello");
        test.add("status");
        test.add("myname");
        test.add("hi");
        List<String> arrList = new ArrayList<>();
        arrList.add("status");
        List<String> re = test.stream().filter(s -> !arrList.contains(s)).collect(Collectors.toList());
        System.out.println(re);
        String s = "%s is myname";
        System.out.println(String.format(s, "thanh"));
    }
}
