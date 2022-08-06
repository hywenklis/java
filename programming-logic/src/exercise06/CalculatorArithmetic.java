package exercise06;

import java.util.Scanner;

public class CalculatorArithmetic {

    static final Integer ADDITION = 1;
    static final Integer SUBTRACTION = 2;
    static final Integer MULTIPLICATION = 3;
    static final Integer DIVISION = 4;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("SIMPLE CALCULATOR");

        System.out.println("Enter the first operator: ");
        Integer firstOperator = scanner.nextInt();

        System.out.println("Enter the second operator: ");
        Integer secondOperator = scanner.nextInt();

        System.out.println("Choose the operation");
        System.out.println("[ENTER 1 - ADDITION]");
        System.out.println("[ENTER 2 - SUBTRACTION]");
        System.out.println("[ENTER 3 - MULTIPLICATION]");
        System.out.println("[ENTER 4 - DIVISION]");

        Integer operation = scanner.nextInt();

        final int ADDITION_VALUE =  firstOperator + secondOperator;
        final int SUBTRACTION_VALUE =  firstOperator - secondOperator;
        final int MULTIPLICATION_VALUE =  firstOperator * secondOperator;
        final int DIVISION_VALUE =  firstOperator / secondOperator;

        if (operation.equals(ADDITION)) {
            System.out.println(firstOperator + " + " + secondOperator + " = " + ADDITION_VALUE);
        }

        if (operation.equals(SUBTRACTION)) {
            System.out.println(firstOperator + " - " + secondOperator + " = " + SUBTRACTION_VALUE);
        }

        if (operation.equals(MULTIPLICATION)) {
            System.out.println(firstOperator + " x " + secondOperator + " = " + MULTIPLICATION_VALUE);
        }

        if (operation.equals(DIVISION)) {
            System.out.println(firstOperator + " / " + secondOperator + " = " + DIVISION_VALUE);
        }

        scanner.close();
    }
}
