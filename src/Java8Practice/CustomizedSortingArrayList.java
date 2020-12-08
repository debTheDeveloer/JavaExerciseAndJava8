package Java8Practice;

import java.util.ArrayList;
import java.util.Comparator;

public class CustomizedSortingArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Arka");
        al.add("Debajyoti");
        al.add("Deep");
        al.add("Sayan");
        al.add("Pritam");
        al.add("Saif");
        al.add("Sarang");

        al.sort((s1,s2)->s2.compareTo(s1));
//        al.sort(Comparator.reverseOrder());
        System.out.println(al);
    }
}
