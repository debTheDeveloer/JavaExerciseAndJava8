package langExperiment;

public class EqualsMethodOverriding {
    private  int roll;
    private String name;

    public EqualsMethodOverriding(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "EqualsMethodOverriding{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) //IF we use here .equals method we will get stackoverFlow Error.
            return true;
        else if (o instanceof EqualsMethodOverriding) {
            EqualsMethodOverriding eq = (EqualsMethodOverriding) o;
            if ((eq.name == this.name) && (eq.roll == this.roll))
                return true;
            else
                return false;
        } else
            return false;
    }

    public static void main(String[] args) {
        EqualsMethodOverriding eq1= new EqualsMethodOverriding(123,"Arka");
        EqualsMethodOverriding eq2= new EqualsMethodOverriding(123,"Arka");
        EqualsMethodOverriding eq3= new EqualsMethodOverriding(123,"Deb");

        System.out.println(eq1.equals(eq2));
        System.out.println(eq1.equals(eq3));
    }


    }
