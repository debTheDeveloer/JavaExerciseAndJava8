package Java8Practice.Stream;

import java.util.ArrayList;

public class UsingCountMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(13);
        al.add(4);
        al.add(14);
        al.add(15);

        System.out.println("Total number of even number in the arraylist is: "+al.stream().filter(i->i%2==0).count());
    }
}
