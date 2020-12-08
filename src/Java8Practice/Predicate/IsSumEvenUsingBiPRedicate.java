package Java8Practice.Predicate;

import java.util.function.BiPredicate;

public class IsSumEvenUsingBiPRedicate {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> bp = (a, b) -> {
            if ((a + b) % 2 == 0)
                return true;
            else
                return false;
        };

        System.out.println( bp.test(10,113));
    }

}
