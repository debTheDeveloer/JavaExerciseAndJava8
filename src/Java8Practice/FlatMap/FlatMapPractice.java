package Java8Practice.FlatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlatMapPractice {
    public static void main(String[] args) {
        Student st1 = new Student("Arka",101,Arrays.asList(new Nickname("ABC","DEF")));
        Student st2 = new Student("Noel",102,Arrays.asList(new Nickname("GHI","JKL"),
                new Nickname("MNO","PQR")));
        Student st3 = new Student("Rudra",103,Arrays.asList(new Nickname("STU","VWX")));

        ArrayList<Student> al = new ArrayList<>();
        al.add(st1);
        al.add(st2);
        al.add(st3);

        al.stream().flatMap(student -> student.nicknameList.stream()).
                map(nickname -> nickname.frndNickName).forEach(s-> System.out.println(s));


        System.out.println("Printing FrndNickName in another way");
        al.stream().flatMap(student -> student.nicknameList.stream().map
                (nickname -> nickname.frndNickName)).forEach(frndnckName-> System.out.println(frndnckName));

        System.out.println("Printing Name of the Student whose home nickname is PQR");

        al.stream().flatMap(student -> student.nicknameList.stream().
                filter(nickname -> nickname.homeNickName.equals("PQR")).map(s->student)).forEach(s-> System.out.println(s));


        al.stream().flatMap(student -> student.nicknameList.stream().
                filter(nickname -> nickname.homeNickName.equals("PQR")).map(s->student.getName())).forEach(s-> System.out.println(s));

    }

}
