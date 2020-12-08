package Polymorphism;

public class MethodHidingChild extends MethodHidingParent{
    public static void m1(){
        System.out.println("Child method");
    }

    public static Integer m2(){
        System.out.println("Child int method");
        return 10;
    }

    public void m3(){
        System.out.println("Non static Child method");
    }

/*    public static void main(String[] args) {
        MethodHidingParent.m1();
        MethodHidingParent mt = new MethodHidingChild();
        mt.m1();
        MethodHidingChild.m1();
        MethodHidingChild.m2();
    }*/
}
