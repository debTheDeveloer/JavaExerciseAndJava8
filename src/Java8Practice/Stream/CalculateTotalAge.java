package Java8Practice.Stream;

import java.util.ArrayList;

public class CalculateTotalAge {

    public static void main(String[] args) {

        Student st1 = new Student(28, "Arka");
        Student st2 = new Student(26, "Nole");
        Student st3 = new Student(31, "Richie");
        Student st4 = new Student(30, "Bababi");
        Student st5 = new Student(27, "Rudra");
        Student st6 = new Student(27, "Pablo");

        ArrayList<Student> al = new ArrayList<>();
        al.add(st1);
        al.add(st2);
        al.add(st3);
        al.add(st4);
        al.add(st5);
        al.add(st6);

        System.out.println(al.stream().mapToInt(student -> student.age).sum());

        //Using Reduce method

        System.out.println(al.stream().map(st->st.age).reduce(0,(a,b)->a+b));

    }
}
