package src;

/**
 * The calculator class can call methods from  another classes
 * to get sum, subtraction, divide and multiply of given 2 int numbers.
 */

public class Calculator {
    public static void main(String[] args) {
        System.out.println(Plus.add(4, 5));
        System.out.println(Minus.sub(10, 6));
        System.out.println(Multiply.multiply(5, 7));
        System.out.println(Divide.divide(30, 6));

    }

}
