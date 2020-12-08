package InnerClassExample;

public class MethodLocalInnerClass {
    int i =10;
    public void print(){
        int j=20;
        class InnerMethodClass{
            int k =30;
            public void printInner(){
                System.out.println(i);
                System.out.println(j);
                System.out.println(k);
            }
        }

        InnerMethodClass im = new InnerMethodClass();
        im.printInner();
    }

    public static void main(String[] args) {
        new MethodLocalInnerClass().print();
    }
}
