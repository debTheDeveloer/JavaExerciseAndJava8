package InnerClassExample;

public class InnerClass_1 {
    int i=10;
    //Declaring Inner Class and its member
    class InnerDemo{
        int j=20;
        public void print(){
            System.out.println("Printing from inner class "+j+"..."+i);
        }

    }

    public static void main(String[] args) {
         new InnerClass_1().new InnerDemo().print();

         //Another way of calling it
        InnerClass_1 outer = new InnerClass_1();
        InnerClass_1.InnerDemo inner = outer.new InnerDemo();
        System.out.println(inner.j);
        inner.print();
    }
}
