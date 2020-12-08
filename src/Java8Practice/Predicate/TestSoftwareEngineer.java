package Java8Practice.Predicate;

import java.util.ArrayList;
import java.util.stream.Stream;

public class TestSoftwareEngineer {
    public static void main(String[] args) {
        SoftwareEngineer sft = new SoftwareEngineer("Arka",100000,true);
        SoftwareEngineer sft1 = new SoftwareEngineer("Debajyoti",120000,false);
        SoftwareEngineer sft2 = new SoftwareEngineer("Sayan",110000,false);
        SoftwareEngineer sft3 = new SoftwareEngineer("Sai",90000,true);

        ArrayList<SoftwareEngineer> al = new ArrayList();
        al.add(sft);
        al.add(sft1);
        al.add(sft2);
        al.add(sft3);

        Stream<SoftwareEngineer> streamSoft = al.stream();
        streamSoft.filter(sftr->sftr.getSalary()>100000).forEach(sftwr->System.out.println(sftwr.getName()));
        al.sort((sftwr1,sftwr2)->(sftwr2.getSalary().compareTo(sftwr1.getSalary())));//Making it Integer instead of int
                                                            // because I want to compare on the basis of this paramter
        System.out.println(al);

    }
}
