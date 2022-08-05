package chapter_5_class_design.class_inheritance;

public class Animal {
    public String food;

    protected void eat() {
        System.out.println("Animal eat" + food);
    }

    public void methodExceptionInparent() {
        System.out.println("method in parent");
    }

    public void methodNotException() {
        System.out.println("parent not throw exception");
    }

    public void test() throws CustomRuntimeEx {
        System.out.println("runtime parent");
    }
}


