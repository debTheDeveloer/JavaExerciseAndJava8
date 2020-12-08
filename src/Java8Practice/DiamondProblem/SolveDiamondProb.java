package Java8Practice.DiamondProblem;

public class SolveDiamondProb implements FirstInterface,SecondInterface {
    @Override
    public void m1() {
        FirstInterface.super.m1();
       // System.out.println("Own Implementation");
    }

    public static void main(String[] args) {
        SolveDiamondProb s1 = new SolveDiamondProb();
        s1.m1();
    }

}
