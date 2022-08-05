package chapter_4.access_modifier.immutable_class;

public class ImmutableClass {
    private int num;

    public ImmutableClass(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
