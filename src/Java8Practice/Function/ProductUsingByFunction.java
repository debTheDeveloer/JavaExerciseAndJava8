package Java8Practice.Function;

import java.util.function.BiFunction;

public class ProductUsingByFunction {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> bif = (a,b)->a*b;
        System.out.println(bif.apply(10,20));
    }
}
