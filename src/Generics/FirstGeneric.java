package Generics;

public class FirstGeneric <T> {
    T obj;

    public FirstGeneric(T obj) {
        this.obj = obj;
    }


    public  T methodOne(T t){
        System.out.println("Inside method one");
        System.out.println(obj);
        System.out.println(t.equals(obj));
        return obj;
    }

    public  <T> void methodTwo(T t){ //if we not mention <T> here then we can only pass the type of object we have passed
                                    //in constructor. IF we mention <T> then we can pass any kind of obj in this method.
        System.out.println(t.toString());
    }

    public static void main(String[] args) {
        StudentGen st= new StudentGen("Arka",101);
        FirstGeneric<StudentGen> fg = new FirstGeneric<>(st);
        fg.methodOne(st);
        fg.methodTwo(st);
        fg.methodTwo("Arka");

    }

}
