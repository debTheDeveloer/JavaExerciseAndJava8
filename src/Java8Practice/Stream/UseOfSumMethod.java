package Java8Practice.Stream;

import java.util.ArrayList;
import java.util.Comparator;

public class UseOfSumMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(11);
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);

        System.out.println(al.stream().mapToInt(i->i).sum());
        System.out.println(al.stream().max(Comparator.naturalOrder()).get());
        System.out.println("Sum calculation using different method");
        System.out.println(al.stream().reduce(0,(a,b)->a+b));
    }
}
