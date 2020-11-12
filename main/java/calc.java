import java.util.Scanner;

public class calc extends calc2 {

    public static void main(String[] args) {

        calc2 calc2 = new calc2();
        int num1 = calc2.getInt();
        int num2 = calc2.getInt();
        char operation = calc2.getOperation();

        int result = calc2.calc(num1, num2, operation);
        System.out.println("Result is: " + result);
        log.info("This is information message!");
    }
}
