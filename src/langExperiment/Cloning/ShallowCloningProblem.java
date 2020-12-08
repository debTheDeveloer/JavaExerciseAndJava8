package langExperiment.Cloning;

public class ShallowCloningProblem implements Cloneable {
    Cat c;
    int j;

    public ShallowCloningProblem(Cat c, int j) {
        this.c = c;
        this.j = j;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Cat c = new Cat(10);
        ShallowCloningProblem sh = new ShallowCloningProblem(c,20);
        System.out.println("Printing parent value before clonig: "+sh.c.i+"     "+sh.j);

        ShallowCloningProblem sh2 = (ShallowCloningProblem) sh.clone();
        sh2.c.i=100;
        sh2.j=200;

        System.out.println("Printing cloned object details"+sh2.c.i+"    "+sh2.j);
        System.out.println("Printing Parent object details"+sh.c.i+"    "+sh.j); //sh.c.i has changed by sh2.c.j
                                                                                // reference which is not supposed to be.
                                                                                //Thays y concept of Deep cloning comes into picture.
    }


}
