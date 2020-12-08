package Java8Practice;


import java.util.TreeMap;

public class TreeMapSorting {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(1,"Arka");
        tm.put(3,"Debajyoti");
        tm.put(7,"Deep");
        tm.put(4,"Sayan");
        tm.put(9,"Pritam");

        System.out.println(tm);
        TreeMap<Integer,String> tm2 = new TreeMap<>((i1,i2)->i2.compareTo(i1));
        tm2.put(1,"Arka");
        tm2.put(3,"Debajyoti");
        tm2.put(7,"Deep");
        tm2.put(4,"Sayan");
        tm2.put(9,"Pritam");

        System.out.println(tm2);
    }
}
