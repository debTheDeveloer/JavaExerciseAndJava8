package Java8Practice.Function;

import java.util.function.Function;
import java.util.function.Predicate;

public class CountNumberOfSpaces {
    public static void main(String[] args) {
        String s ="My name is Debajyoti Ghatak";

        Function<String,String> f = (str->str.replaceAll(" ",""));
        String s1 = f.apply(s);
        System.out.println(s.length()-s1.length());
    }
}
