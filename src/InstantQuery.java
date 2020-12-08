public class InstantQuery {

    public static void main(String[] args) {
        System.out.println("Inside original method");
        InstantQuery.main("Arka");
    }

    public static void main(String s){
        System.out.println("Hello.."+s);
        InstantQuery.main("Arka","Debajyoti");
    }

    public static void main(String s1, String s2){
        System.out.println("hi.."+s1+"..."+s2);
        InstantQuery.main(10);
    }

    public static void main(int i){
        System.out.println("printing...."+i);
    }
}
