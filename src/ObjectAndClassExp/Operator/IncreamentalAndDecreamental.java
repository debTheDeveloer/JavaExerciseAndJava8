package ObjectAndClassExp.Operator;

public class IncreamentalAndDecreamental {
    public static void main(String[] args) {
        int i=10;
        System.out.println(i++); // increamented values will be displayed after this line as it is a post increamentaton.
        int j=15;
        System.out.println(++j);
        int k=20;
        k++;
        System.out.println(k);
        int m=25;
        ++m;
        System.out.println(m);
        int d = 10;
        int result = d--+--d; //First d-- = 10 and second --d = 8
        System.out.println(result);
        System.out.println(d);

        int m1=20;
        int m2 = 30;

        int result2 = m1--+m2++;
        System.out.println(result2);
        System.out.println(m1);
        System.out.println(m2);
    }
}
