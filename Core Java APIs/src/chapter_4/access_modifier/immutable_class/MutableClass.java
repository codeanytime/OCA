package chapter_4.access_modifier.immutable_class;

public class MutableClass {
    StringBuilder sb;
    StringBuilder sb2;

    public MutableClass(StringBuilder sb, StringBuilder sb2) {
        this.sb = new StringBuilder(sb);
        this.sb2 = sb2;
    }

    public StringBuilder getSb() {
        return new StringBuilder(sb);
    }

    public StringBuilder getSb2() {
        return sb2;
    }
}
