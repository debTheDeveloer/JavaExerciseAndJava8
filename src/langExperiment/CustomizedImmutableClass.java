package langExperiment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CustomizedImmutableClass implements Iterable {
    private int i;
    private  int j;

    public CustomizedImmutableClass(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public CustomizedImmutableClass getInstance(int i, int j){
        if(i==this.i && j==this.j)
            return this;
        else
            return new CustomizedImmutableClass(i,j);
    }

    public static void main(String[] args) {
        CustomizedImmutableClass c1 = new CustomizedImmutableClass(10,20);
        CustomizedImmutableClass c2 = c1.getInstance(10,20);
        CustomizedImmutableClass c3 = c1.getInstance(100,20);

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));

        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        al.forEach(System.out::println);
        al.stream().forEach(System.out::println);

        for (int i: al) {
            System.out.println(i);
        }

        for(int i=0;i<al.size();i++){
            System.out.println(i);
        }

        int[] arr = new int[]{1,2,3,4};
        for (int i:arr) {
            System.out.println(i);
        }

        CustomizedImmutableClass cs2 = new CustomizedImmutableClass(10,299);
        for(Object o: cs2){

        }
    }


    @Override
    public Iterator iterator() {
        return null;
    }
}
