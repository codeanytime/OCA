package chapter_4.access_modifier.immutable_class;

public class Main {
    public static void main(String[] args) {
        ImmutableClass im = new ImmutableClass(9);
        System.out.println(im.getNum());

        StringBuilder sb = new StringBuilder();
        sb.append("hello");
        sb.append(" i'm thanh");
        System.out.println(sb);

        StringBuilder sb2 = new StringBuilder("MUTABLE StringBuilder");

        MutableClass mu = new MutableClass(sb, sb2);
        sb2.append("After append sb2");
        sb.append(". Mutable");
        System.out.println(mu.getSb());
        System.out.println(mu.getSb2());
    }
}
