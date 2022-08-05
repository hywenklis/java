package exercise02;

import java.util.Scanner;

public class CalculateBMI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULATION OF BODY MASS INDEX");

        System.out.println("Enter your weight: ");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height: ");
        Double height = scanner.nextDouble();

        Double BMI = weight / (height * height);

        System.out.printf("Your BMI is: %f", BMI);

        scanner.close();
    }
}
