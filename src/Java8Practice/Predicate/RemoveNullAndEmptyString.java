package Java8Practice.Predicate;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class RemoveNullAndEmptyString {
    public static void main(String[] args) {
        String[] sample = new String[]{"Arka","",null,"Debajyoti","Sayan"};
        Stream<String> stringStream = Stream.of(sample);
        /*Predicate<String> p = s -> (s!=null&&!s.isEmpty());
        for (String s : sample) {
            if(p.test(s))
                System.out.println(s);
        }*/
        stringStream.filter(s->(s!=null&&!s.isEmpty())).forEach(System.out::println);
    }
}
