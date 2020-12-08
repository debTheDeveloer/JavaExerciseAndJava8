package Java8Practice.Supplier;

import java.util.Date;
import java.util.function.Supplier;

public class DateTimeUsingSupplier {
    public static void main(String[] args) {
        Supplier<Date> s = ()->new Date();
        System.out.println(s.get());
    }
}
