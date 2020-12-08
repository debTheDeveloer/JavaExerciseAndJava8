package Java8Practice.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class NumberOFSpacesInaStrng {
    public static void main(String[] args) {
        String s = "My name is Debajyoti Ghatak";
        char[] stringChar = s.toCharArray();
        Character[] chr = new Character[stringChar.length];
        int i=0;
        for (char c:stringChar) {
            chr[i]=c;
            i++;
        }
        Stream<Character> charStream = Stream.of(chr);
        System.out.println(charStream.filter(c->c.isWhitespace(c)).count());
    }
}
