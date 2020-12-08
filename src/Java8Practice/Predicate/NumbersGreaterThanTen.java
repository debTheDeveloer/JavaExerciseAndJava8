package Java8Practice.Predicate;

import java.util.function.Predicate;

public class NumbersGreaterThanTen {
    public static void main(String[] args) {
        int[] sample = new int[]{2,12,45,67,3,6};
        Predicate<Integer> p = i->i>10;
        for (int i: sample) {
            if(p.test(i))
                System.out.println(i);
        }

    }
}
