package InnerClassExample.AnnonymousInnerClass;

public class Child1 {
    public static void main(String[] args) {
        Parent p = new Parent(){
            public void taste(){
                System.out.println("Hello child.....Taste is Salty");
                childSpecificMethod();

            }
            public void childSpecificMethod(){
                System.out.println("It is an extra method in parent class");
            }
        };
        p.taste();//Hello child.....Taste is Salty
        Parent p1 = new Parent();
        p1.taste();//Hello child.....Taste is Spicy
    }
}
