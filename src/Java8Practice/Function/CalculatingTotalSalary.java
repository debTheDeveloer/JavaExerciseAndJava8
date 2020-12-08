package Java8Practice.Function;

import java.util.ArrayList;
import java.util.function.Function;

public class CalculatingTotalSalary {
    public static void main(String[] args) {
        Function<Employee,Integer> f = emp->emp.getSalary();
        Employee e1 = new Employee("Arka",100000);
        Employee e2 = new Employee("Ram",20000);
        Employee e3 = new Employee("Shyam",30000);

        ArrayList<Employee> al = new ArrayList<>();
        al.add(e1);
        al.add(e2);
        al.add(e3);

        System.out.print("Total salary is: ");
        System.out.println(al.stream().map(f).reduce(0,(a,b)->a+b));
    }
}
