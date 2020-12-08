package Polymorphism;

public class TestMethodHiding {
    public static void main(String[] args) {
        MethodHidingChild child = new MethodHidingChild();
        MethodHidingParent parent = new MethodHidingParent();
        MethodHidingParent parentChild = new MethodHidingChild();
        child.m1();
        parent.m1();
        parentChild.m1();
        System.out.println("---------------------------");
        child.m2();
        parent.m2();
        parentChild.m2();
        System.out.println("------------------------");
        child.m3();
        parent.m3();
        parentChild.m3();

    }
}
