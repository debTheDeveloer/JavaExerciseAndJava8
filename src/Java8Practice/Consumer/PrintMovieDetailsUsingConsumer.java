package Java8Practice.Consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

public class PrintMovieDetailsUsingConsumer {
    public static void main(String[] args) {
        Movie m1 = new Movie("Abc", 100,true);
        Movie m2 = new Movie("Def", 110,false);
        Movie m3 = new Movie("Ghi", 120,true);
        Movie m4 = new Movie("Jkl", 130,false);

        ArrayList<Movie> al = new ArrayList<>();
        al.add(m1);
        al.add(m2);
        al.add(m3);
        al.add(m4);

        Consumer<Movie> c = mv-> System.out.println(mv);
        al.stream().forEach(c);
    }
}
