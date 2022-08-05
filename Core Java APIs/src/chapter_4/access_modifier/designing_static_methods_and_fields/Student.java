package chapter_4.access_modifier.designing_static_methods_and_fields;

public class Student {
    static int count;

    String name;

    public Student(String name) {
        this.name = name;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
