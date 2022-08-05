package chapter_4.access_modifier.designing_static_methods_and_fields;

public class AutoBox {
    static int fly(Integer a) {
        return a*2;
    }

    static int fly(int a) {
        return a*3;
    }
    public static void main(String[] args) {
        System.out.println(fly(new Integer(3)));
    }
}
