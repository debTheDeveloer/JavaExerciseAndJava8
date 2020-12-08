package langExperiment.Immutable;

public class OriginalCustomizedImmutable {
    private final int id;
    private final  String name;
    private final Age age;

    public OriginalCustomizedImmutable(int id, String name, Age age) {
        this.id = id;
        this.name = name;
//        this.age = age;  //This is not accepable as we can change object value using age instace after creation This
//                          class object which is violating Immutable class principle.

        Age cloneage = new Age();
        cloneage.setYear(age.getYear());
        cloneage.setMonth(age.getMonth());
        cloneage.setDay(age.getDay());

        this.age=cloneage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        Age cloneAge = new Age();
        cloneAge.setDay(this.age.getDay());
        cloneAge.setMonth(this.age.getMonth());
        cloneAge.setYear(this.age.getYear());
        return cloneAge;
    }
}
