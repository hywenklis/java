package exercise04;

import java.util.Scanner;

public class CalculatingNotesStudent {

    static final Integer NOTE_FOR_APPROBATION = 70;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("PASSED OR FAILED STUDENT");

        System.out.println("Enter your note: ");
        double noteStudent = scanner.nextDouble();

        boolean approved = noteStudent >= NOTE_FOR_APPROBATION;

        if (approved) {
            System.out.println("You passed years - APPROVED");
        } else {
            System.out.println("You not passed years - REPROVED");
        }

        scanner.close();
    }
}
