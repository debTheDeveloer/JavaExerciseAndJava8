package Java8Practice.FunctionalInterfaceMethodRef;

public class ImplementFunctionalInterface {
    public static void main(String[] args) {
        MyFuntionalInterface mf = ()-> System.out.println("Implemented Functional Interface");
        mf.m1();
        //Using Method Ref
        MethodRef mref = new MethodRef();
        MyFuntionalInterface mf2 = mref::sampleInt;
        MyFuntionalInterface mf3 = mref::sampleVoid;

        mf2.m1();
        mf3.m1();
    }
}
