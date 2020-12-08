package EnumPractice;

public enum SecondEnum {
    Hello(30),Hi(40),HowRU;
    int i;

    SecondEnum() {
        System.out.println("Inside constructor of Enum");
        this.i=20;
    }

    SecondEnum(int i) {
        this.i = i;
    }

    public int getValue(){
        return i;
    }
}
