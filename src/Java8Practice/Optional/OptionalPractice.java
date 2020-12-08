package Java8Practice.Optional;

import java.util.Optional;

public class OptionalPractice {
    public static void main(String[] args) {
        String book = "Java";
        //String optionalOfBook = null;
        Optional<String> stringOptional = Optional.ofNullable(book);
        //Optional<String> optionalOf = Optional.of(optionalOfBook);
        //IF we write code till this line we will get nullPointer Exception for Optional.of.

        System.out.println(stringOptional); //if book=null, then we will optional[null] will be printed.
        stringOptional.ifPresent(s-> System.out.println(s.toUpperCase()));
        System.out.println("Crossed if present statement");

        System.out.println(stringOptional.orElseThrow(IllegalArgumentException::new)); //If book is null then we will
                                                                                        // face this exception.



    }
}
