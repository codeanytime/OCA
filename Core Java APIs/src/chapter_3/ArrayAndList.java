package chapter_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayAndList {
    public static void main(String[] args) {
        int[] intArr = {10, 3, 1, 7};
        Arrays.sort(intArr);
        for (int i:
             intArr) {
            System.out.println(i);
        }
        System.out.println(Arrays.binarySearch(intArr, 1));
        List<String> listStr = new ArrayList<>();
        listStr.add("hello");
        listStr.add("world");
        listStr.add(2, "List");
        listStr.add(2, "test");
        System.out.println(listStr);
        System.out.println(listStr.get(3));
        System.out.println(listStr.remove("hi"));

        System.out.println("____ARRAYLIST___");
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list2.add("a");
        list2.add(0, "b");
        System.out.println(list1.equals(list2));

        int i = Integer.parseInt("L", 32);
        System.out.println(i);

        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.remove(1);
        System.out.println(list3);

        List<String> listStr2 = new ArrayList<>();
        listStr2.add("Hello");
        listStr2.add("World");
        String[] strArr = listStr2.toArray(new String[0]);
        System.out.println(strArr[0]);

        List<Integer> intList = Arrays.asList(1,2,3,5,4);
        Collections.sort(intList, (x1, x2) -> {
            if (x1 < x2) {
                return 1;
            }
            if (x1 > x2){
                return -1;
            }
            return 0;
        });
        intList.forEach(System.out::println);

        String numbers = "012345678";
        System.out.println(numbers.substring(1, 3));
        System.out.println(numbers.substring(7, 7));
        System.out.println(numbers.substring(7));

        String s = "purr";
        s.toUpperCase();
        s.trim();
        s.substring(1, 3);
        s += " two";
        System.out.println(s);
        System.out.println(s.length());

//        String s6 = "  Hello";
//        s6.trim();
//        s6 = s6.trim();
//        System.out.println(s6);

        String str = "12Hello";
        System.out.println(str.substring(2, 7));
        System.out.println(new String(new char[] {'1', '2', 'H', 'e', 'l', 'l', 'o'}, 2, 5));

        String[] testArr = {"hi", "i'm", "thanh"};
        List<String> test = Arrays.asList(testArr);
        System.out.println(Arrays.hashCode(testArr));
        System.out.println(test.hashCode());
        test.set(0, "ttt");
        System.out.println(test);
        System.out.println(testArr[0]);

    }
}
