package EnumPractice;

public class TestSecondEnum {
    public static void main(String[] args) {
        SecondEnum secondEnum = SecondEnum.Hello;  //Call the constructor
        SecondEnum secondEnum1 = SecondEnum.Hi;  //Call the constructor

        System.out.println(secondEnum);
        System.out.println(secondEnum.getValue());

        SecondEnum[] secondEnumsArray = SecondEnum.values();
        for (SecondEnum se:secondEnumsArray) {
            System.out.println(se+"......."+se.getValue());
        }
    }

}
