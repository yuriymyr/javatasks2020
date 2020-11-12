import java.util.Scanner;
import org.apache.log4j.Logger;



public class calc2 {
    static Scanner scanner = new Scanner(System.in);
    static Logger log = Logger.getLogger(calc2.class);

    public int getInt(){
        System.out.println("Enter value:");
        log.info("This is information message!");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Error, try again.");
            log.error("This is error message");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public char getOperation(){
        System.out.println("Enter option");
        log.info("This is information message!");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Error, try again.");
            log.error("This is error message");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public int calc(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Error, try again.");
                log.error("This is error message");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}
