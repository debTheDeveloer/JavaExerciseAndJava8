package Exception;

public class Exception_1 {

    private static void printMe(){
        System.out.println("Hello I am here");
    }

    public static void main(String[] args) {
        try {
            printMe();
            System.out.println("Inside Try block");
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Inside Try block");
        }finally {
            System.out.println("Inside Finally");
        }
        System.out.println("After finally block");
    }
}
