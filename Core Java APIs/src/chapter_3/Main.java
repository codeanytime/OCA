package chapter_3;

public class Main {
    public static void main(String[] args) {
        long t = 2147483647;
        System.out.println(t);
        int i = (int) 1.0;
        System.out.println(i);
        //mac dinh java lay literal kieu int, > integer.max_int, < integer.min_int thi dong sau se loi
        // long t = 2147483648 > max = 2147483647
    }
}
