package Java8Practice.Consumer;

import java.util.function.Consumer;

public class FirstConsumer {
    public static void main(String[] args) {
        Consumer<String> c = s-> System.out.println(s);
        c.accept("Hello Consumer");
    }
}
