package langExperiment.Immutable;

public class TestImmutable {
    public static void main(String[] args) {
        Age age = new Age();
        age.setDay(10);
        age.setMonth(10);
        age.setYear(1992);

        OriginalCustomizedImmutable oci = new OriginalCustomizedImmutable(1,"Arka",age);
        System.out.println("Before Modification.. "+oci.getAge().getYear());
        System.out.println("After Modification... ");
        age.setYear(1991);
        System.out.println(oci.getAge().getYear());
        System.out.println("Trying to modify this in a different way");

        oci.getAge().setYear(1993); //Inside getAge method new Age object is getting created and deep cloning happening
                                    //and clone object is returned with new set values.
        System.out.println(oci.getAge().getYear()); //Inside get Age method again another  new Age object is getting created and
                                                    //deep cloning is returned with original old values.

    }
}
