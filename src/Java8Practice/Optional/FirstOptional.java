package Java8Practice.Optional;

import java.util.ArrayList;
import java.util.function.Supplier;

public class FirstOptional {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(9);
        al.add(11);
        al.add(17);
        al.add(13);
        al.add(19);
        al.add(15);

        System.out.println(al.stream().filter(i->i%2==0).findFirst().orElse(0));


        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Arka");
        al2.add("Noel");
        al2.add("Pablo");
        al2.add("Rudra");
        al2.add("Rahul");

        System.out.println(al2.stream().filter(s->s.length()>6).findAny().orElse("No Such Name found"));
        System.out.println(al2.stream().map(s->s+"Hello").findFirst().orElseGet(FirstOptional::backup));


    }

    private static String backup() {
        return "No such method is called.";
    }
}
