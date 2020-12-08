package InnerClassExample;

public class StaticInnerClass {
    static class InnerStatic{
        static int i=20;
        static int j;
        public void print(){
            System.out.println("Hello I am inside static inner class");
        }
    }

    public static void main(String[] args) {
        new StaticInnerClass.InnerStatic().print();
        System.out.println(InnerStatic.i);
        System.out.println(InnerStatic.j);
    }
}
