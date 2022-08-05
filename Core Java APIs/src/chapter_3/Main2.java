package chapter_3;

public class Main2 {
    public static void main(String[] args) {
        String s1 = "thanh2";
        s1.concat(" Huy");
        System.out.println(s1);
        System.out.println(s1.indexOf("2"));
        String s = "AniMaL ";
        String result = s.trim().toLowerCase();
        System.out.println(s);
        StringBuilder sb = new StringBuilder(5);
        sb.append("Hello world").append(". I am thanh");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        Tiger t1 = new Tiger();
        Tiger t2 = new Tiger();
        Tiger t3 = t1;
        System.out.println(t1 == t3);
        System.out.println(t1.equals(t2));
        char[] c = {'1', '2', '3'};
        System.out.println(c[1]);
        String[] strArr = {"Test"};
        Object[] objArr = strArr;
        String[] str2Arr = (String[]) objArr;
        System.out.println(str2Arr[0]);
    }
}
