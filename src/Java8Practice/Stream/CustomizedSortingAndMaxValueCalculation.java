package Java8Practice.Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomizedSortingAndMaxValueCalculation {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(13);
        al.add(12);
        al.add(9);
        al.add(19);

        al.sort((i1,i2)->i2.compareTo(i1));
        System.out.println("After sorting customized sorting");
        System.out.println(al);

        System.out.println("Maxium number of the arraylIst is: ");
        System.out.println(al.stream().max(Comparator.naturalOrder()).get());

        System.out.println("Creating new Array list which contains Descending order of the arrayList");
        List<Integer> list = al.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(list);

        System.out.println("Printing the odd elements");
        al.stream().filter(i->i%2!=0).forEach(System.out::println);
        System.out.println(al.stream().filter(i->i%2!=0).mapToInt(i->i).count());


    }
}
