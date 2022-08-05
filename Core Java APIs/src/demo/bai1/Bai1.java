package demo.bai1;

import java.util.Scanner;
import static java.lang.System.*;

public class Bai1 {
    private static Rope rope1 = new Rope();

    private static Rope rope2 = new Rope();

    {
        out.println("r1: " + rope1.length);
    }


    public static void main(String[] args) {
        rope1.length = 2;
        rope2.length = 8;
        Bai1 bai1 = new Bai1();
        System.out.println(rope1.length);
    }
}
