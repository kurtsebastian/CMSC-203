package calc;


public class Basic {
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }
    
    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
    
    public double divide(double num1, double num2) {
        return num1 / num2;
    }
    
    public double modulo(double num1, double num2) {
        return num1 % num2;
    }

    public double exponent(double num1, double num2) {
        return Math.pow(num1, num2);
    }
}