package InnerClassExample;

public class UsageOFThisKeyWord {
    int i=10;
    class InnerDemo{
        int i=20;
        public void printELEMENT(){
            System.out.println(this.i);//20
            System.out.println(i);//20
            System.out.println(UsageOFThisKeyWord.this.i);//10
        }
    }

    public static void main(String[] args) {
        new UsageOFThisKeyWord().new InnerDemo().printELEMENT();
    }
}
