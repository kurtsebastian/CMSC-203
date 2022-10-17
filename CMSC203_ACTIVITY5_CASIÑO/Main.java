import calc.Basic;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Num 1: ");
        double num1 = scan.nextDouble();

        System.out.print("Num 2: ") ;
        double num2 = scan.nextDouble();

        System.out.println("Options:");
        System.out.println("+ = Add");
        System.out.println("- = Subtract");
        System.out.println("* = Multiply");
        System.out.println("/ = Divide");
        System.out.println("% = Modulo");
        System.out.println("^ = Exponent");

        System.out.print("Operation: ");
        String operation = scan.next();

        Basic basic = new Basic();

        double result = 0;
        switch (operation) {
            case "+":
                result = basic.add(num1, num2);
                break;
            case "-":
                result = basic.subtract(num1, num2);
                break;
            case "*":
                result = basic.multiply(num1, num2);
                break;
            case "/":
                result = basic.divide(num1, num2);
                break;
            case "%":
                result = basic.modulo(num1, num2);
                break;
            case "^":
                result = basic.exponent(num1, num2);
                break;
            default:
                System.out.println("ERROR. INVALID OPERATION.");
                break;
        }
        System.out.println();
        System.out.println("RESULT: " + result);
    }
}