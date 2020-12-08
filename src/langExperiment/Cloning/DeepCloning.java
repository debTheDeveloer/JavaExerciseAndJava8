package langExperiment.Cloning;

public class DeepCloning implements Cloneable {
    int j;
    Cat c;

    public DeepCloning(int j, Cat c) {
        this.j = j;
        this.c = c;
    }

    public Object clone(){
        Cat c1 = new Cat(c.i);
        DeepCloning d = new DeepCloning(this.j,c1);
        return d;
    }

    public static void main(String[] args) {
        Cat c = new Cat(10);
        DeepCloning d = new DeepCloning(20,c);
        System.out.println("Printing parent value before clonig: "+d.c.i+"     "+d.j);

        DeepCloning d2 = (DeepCloning) d.clone();
        d2.c.i=123;
        d2.j=234;

        System.out.println("Printing cloned object details "+d2.c.i+"    "+d2.j);
        System.out.println("Printing Parent object details "+d.c.i+"    "+d.j);
    }
}
