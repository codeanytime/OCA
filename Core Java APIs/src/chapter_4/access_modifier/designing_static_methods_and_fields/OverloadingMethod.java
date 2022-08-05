package chapter_4.access_modifier.designing_static_methods_and_fields;

import static java.lang.System.out;

// in java overload method order: exact match by type > larger primitive type > autobox type > varargs
//method signature = method name + method parameter list
public class OverloadingMethod {
    static void tinhTong(int... a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        out.println("so so hang la: " + a.length);
        out.println("tong la : " + sum);
    }

    static void testMethod(String s) {
        out.println(s);
    }

    void testMethod() {
        out.println("int");
    }

    static void tinhTong(int a,int b) {
        out.println("SUM: " + a + b);
    }

    public static void main(String[] args) {
        tinhTong(1, 2, 3, 4);
        tinhTong(1, 2);
    }
}
