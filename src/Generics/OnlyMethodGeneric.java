package Generics;

public class OnlyMethodGeneric {
    public static void main(String[] args) {
        StudentGen st = new StudentGen("DJ",102);
        printGentMethod(st);
    }

    public static  <T> void printGentMethod(T t){
        System.out.println("Inside Generic method of Non gen class");
        System.out.println(t.toString());
    }
}
