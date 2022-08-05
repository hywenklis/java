package exercise04;

import java.util.Scanner;

public class CalculatingNotesStudent {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("PASSED OR FAILED STUDENT");

        System.out.println("Enter your notes: ");
        double noteStudent = scanner.nextDouble();

        boolean noteApproval = noteStudent >= 70;

        if (noteApproval) {
            System.out.println("APPROVED");
        } else {
            System.out.println("REPROVED");
        }

        scanner.close();
    }
}
