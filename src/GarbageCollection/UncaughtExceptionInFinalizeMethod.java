package GarbageCollection;

public class UncaughtExceptionInFinalizeMethod {
    int i;

    public UncaughtExceptionInFinalizeMethod(int i) {
        this.i = i;
    }

    public void finalize(){
        System.out.println("Inside finalize method");
        i=i/0;
        System.out.println("End of finalize method");
    }

    public static void main(String[] args) {
        UncaughtExceptionInFinalizeMethod uc = new UncaughtExceptionInFinalizeMethod(10);
       // uc.finalize();//If we call finalize method like this, only line no 11 will be printed and abnormal termination will hppen.
        uc=null;
        Runtime.getRuntime().gc();//if we call finalize method like this, then line 11 will be printed and normal
                                    // termination will happen,as a result line 22 will be printed but not the line 13.
        System.out.println("End of main method");
    }
}

