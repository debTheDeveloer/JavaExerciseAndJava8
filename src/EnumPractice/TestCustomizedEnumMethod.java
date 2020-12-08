package EnumPractice;

public class TestCustomizedEnumMethod {
    public static void main(String[] args) {
        CustomizedEnumMethod[] customArray = CustomizedEnumMethod.values();
        for (CustomizedEnumMethod c:customArray) {
            System.out.println(c+"....."+c.show());
        }
    }
}
