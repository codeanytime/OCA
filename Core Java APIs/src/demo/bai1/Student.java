package demo.bai1;

import java.util.function.Predicate;

public class Student {
    private String name;
    private int id;

    public Student(int id) {
        this(id, "cat huy thanh");
        System.out.println("constructor with fix name");
    }
    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }

    void Student(){
        System.out.println("Student method");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Predicate<Student> predicateNameContainsA() {
        return p -> p.getName().contains("a");
    }
}
