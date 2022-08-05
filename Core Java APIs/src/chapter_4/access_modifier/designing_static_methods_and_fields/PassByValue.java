package chapter_4.access_modifier.designing_static_methods_and_fields;

public class PassByValue {
    public static void main(String[] args) {
        Foo x = new Foo(1);
        Foo y = new Foo(1);

        modify(x, y);
        System.out.println("Num of x: " + x.num);
    }

    static void modify(Foo x, Foo y) {
        x.num++;
        y = new Foo(y.num);
        y.num++;
    }

    static class Foo {
        int num;

        public Foo(int num) {
            this.num = num;
        }
    }
}
