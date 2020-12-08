package PassByValue;

import java.util.ArrayList;

public class PassbyConceptUsingArrayAndList {
    public  void createArrayAndList() {
        int i =10; //Duplicate ref will be used inside methods. Outside methods original ref will be used.
        Integer j = new Integer(100); // Integer is Immutable Class. That is why obj ref after changes and
                                        // before changes are diff.
        ArrayList<Integer> al = new ArrayList<>();//ArrayList is Mutable. So obj ref inside and outside method are same.
        al.add(1);
        al.add(2);
        al.add(3);

        useArrayList(al,i);
        System.out.println(al);
        System.out.println(i);

        useInteger(j);
        System.out.println(j);

        Integer[] arrInt = new Integer[5]; //Array are Mutable in nature. So obj ref inside and outside method are same.
        arrInt[0]=1;
        useArray(arrInt);
        System.out.println(arrInt[0]);

        Employee employee = new Employee("Arka"); //Employee is a Mutable Object.
        useEmployee(employee);
        System.out.println(employee);

        String s = "Hello";  //String is a Immutable in nature.
        useString(s);
        System.out.println(s);
    }

    private void useString(String s) {
        s = "Hello World";
    }

    private void useEmployee(Employee employee) {
        employee.name="Debajyoti";
    }

    private void useInteger(Integer j) {
        j=300;
        System.out.println(j);
    }

    private  void useArray(Integer[] arrInt) {
        arrInt[0]=2;
    }

    private  void useArrayList(ArrayList<Integer> al, int i) {
        al.add(4);
        al.add(5);
        i =20;
    }

    public static void main(String[] args) {
       new PassbyConceptUsingArrayAndList().createArrayAndList();
    }
}
