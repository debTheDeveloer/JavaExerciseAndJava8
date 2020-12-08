package Java8Practice.Function;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionChaining {
    public static void main(String[] args) {
        String s = "AishariyaAbhi";
        Function<String,String> f1 = s1->s1.substring(0,9);
        Function<String,String> f2 = s2-> s2.toUpperCase();
        System.out.println(f1.andThen(f2).apply(s));
    }
}
