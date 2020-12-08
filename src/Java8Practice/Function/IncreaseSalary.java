package Java8Practice.Function;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class IncreaseSalary {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ram",900);
        Employee e2 = new Employee("Shyam",1300);
        Employee e3 = new Employee("Madhu",1200);
        Employee e4 = new Employee("Jadu",1100);

        ArrayList<Employee> al = new ArrayList<>();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);

        System.out.println(al.stream().filter(emp->emp.getSalary()>1000).map(emp->emp.getSalary()+1000).collect
                (Collectors.toList()));
    }
}
