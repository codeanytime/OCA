package chapter_5_class_design.class_inheritance;

//1. The method in the child class must have the same signature as the method in the parent
//class.
//2. access modifier of method overriding in child class must be at least as accessible as the parent
//eat method in below must be protected or public
//3. The method in the child class may not throw a checked exception that is new or
//broader than the class of any exception thrown in the parent class method.
//4.  If the method returns a value, it must be the same or a subclass of the method in the
//parent class, known as covariant return types
public class Bird extends Animal {

    protected void eat() {
        System.out.println("Bird eat");
    }

    //Error because overide method in child class may not throw a checked exception that is new or
    //broader than the class of any exception thrown in the parent class method.
//    @Override
//    public void methodExceptionInparent() throws Exception {
//        System.out.println("Method exception in children class");
//    }


    // not error because ArrayIndexOutOfBoundsException is extends RuntimeException (unchecked exception)
    @Override
    public void methodExceptionInparent() throws ArrayIndexOutOfBoundsException{
        super.methodExceptionInparent();
    }

    @Override
    public void methodNotException() {
        super.methodNotException();
    }

    @Override
    public void test() throws RuntimeException {
        super.test();
    }
}
