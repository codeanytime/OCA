package chapter_4.access_modifier.constructor;

public class InitiationOrder {
    private String name = "What is your name?";

    private String welcome = "welcome";

    {
        System.out.println("name = " + name);
    }

    static {
        System.out.println("static 1");
    }

    static {
        System.out.println("static 2");
    }

    public InitiationOrder(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        InitiationOrder order = new InitiationOrder("Thanh cat");
        System.out.println(order.name);
    }
}
