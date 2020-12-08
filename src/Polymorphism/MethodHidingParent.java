package Polymorphism;

public class MethodHidingParent {
    public static void m1(){
        System.out.println("Parent method");
    }

    public static Object m2(){
        System.out.println("Parent m2 method");
        return new MethodHidingParent();
    }

    public void m3(){
        System.out.println("Non static Parent method");
    }
}
