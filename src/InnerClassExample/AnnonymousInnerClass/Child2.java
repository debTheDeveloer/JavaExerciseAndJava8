package InnerClassExample.AnnonymousInnerClass;

public class Child2 {
    public static void main(String[] args) {
        Parent p = new Parent(){
            public void printOnlyChildSpecificMethod(){
                System.out.println("Hi this is child specific method");
            }
        };
//        ((Parent) p).printOnlyChildSpecificMethod(); //cant access child specific method as we are referring Parent
                                                        //class instance.
        p.taste();
    }
}
