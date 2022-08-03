package exercise03;

import java.util.Scanner;

public class CalculatingSquareNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        Integer number = scanner.nextInt();

        Integer square = number * number;

        System.out.println("The square of " + number + " is " + square + ".");

        scanner.close();
    }
}
