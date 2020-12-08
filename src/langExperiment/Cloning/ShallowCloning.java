package langExperiment.Cloning;

public class ShallowCloning implements Cloneable {
    int i;
    int j;

    public ShallowCloning(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowCloning sh = new ShallowCloning(10,20);
        System.out.println("Before Cloning the value is: "+sh.i+"   "+sh.j);
        ShallowCloning sh2 = (ShallowCloning) sh.clone();
        System.out.println("Printing value from cloned object..."+sh2.i+"   "+sh2.j);
        sh2.i=100;
        sh2.j=200;

        System.out.println("After changing cloned printing parent object:"+sh2.i+"  "+sh2.j);
        System.out.println("After changing printing parent object: "+sh.i+"  "+sh.j);
    }
}
