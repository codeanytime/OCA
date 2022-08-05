package chapter_4.access_modifier.different_pakage;

import chapter_4.access_modifier.same_package.Bird;

public class DifferentPackageToBirdClass extends Bird {
    static void testProtected() {
        DifferentPackageToBirdClass diff = new DifferentPackageToBirdClass();
        System.out.println(diff.text);
        diff.floatInWater();
    }

    static void test() {
        Bird bird = new Bird();
        System.out.println("Test method: " + bird.text);
    }

    public static void main(String[] args) {
        testProtected();
        test();
    }
}
