package GarbageCollection;

public class CallingGC {
    int i;

    public CallingGC(int i) {
        this.i = i;
    }

    public void finalize(){
        System.out.println("Finalize method is called");
    }

    public static void main(String[] args) {
        CallingGC cg = new CallingGC(10);
        cg=null;
        Runtime r= Runtime.getRuntime();
        r.gc();
//        System.gc();
        System.out.println("End of main method");
    }
}
