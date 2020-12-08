package Generics;

import java.util.ArrayList;

public class GenericInNonGenPlace {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(25);
        nonGenArrayList(al);
        System.out.println(al);
    }

    private static void nonGenArrayList(ArrayList al) {
        al.add("Pritam");
    }
}
