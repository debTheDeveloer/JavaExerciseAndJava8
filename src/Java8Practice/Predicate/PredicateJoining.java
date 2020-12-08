package Java8Practice.Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateJoining {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Arka");
        al.add("Debajyoti");
        al.add("Deep");
        al.add("Sayan");
        al.add("Pritam");
        al.add("Saif");
        al.add("Sarang");

        Predicate<String> p1 = s->s.length()>=4;
        Predicate<String>  p2 = s->s.charAt(1)=='a';

        Stream<String> stringStream = al.stream();
        System.out.println(stringStream.filter(p1.and(p2)).collect(Collectors.toList()));
    }
}
