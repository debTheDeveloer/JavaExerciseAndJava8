package ObjectAndClassExp.SuperAndThisCantCallFromStatic;

public class Experiment1 {
    {
        m=111;
    }
     int m;


    static int i;
    int j;

    public static void m1(){
        int i;
        i=10;
//        this.j =30; // We cant use super or this from static block/method
    }

    public static void main(String[] args) {
        System.out.println(new Experiment1().m);
    }
}
