import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayTest {
    public static void main(String[] args) {
        String[] arr = new String[5];
        System.out.println(arr.length);
        System.out.println(arr[0]);
        ArrayList<Integer> al = new ArrayList<>();
//        al.add(10);
        System.out.println(al.size());
        al.add(10);
        al.add(30);
        al.add(50);
        System.out.println(al.size());
        System.out.println(al);

        System.out.println(al.stream().skip(1).limit(1).collect(Collectors.toList()));
        List<Integer> al2 = al.stream().skip(1).limit(1).collect(Collectors.toList());
        System.out.println(al2);
        System.out.println("TM".equalsIgnoreCase("TM"));
    }
}
