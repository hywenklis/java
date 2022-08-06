package exercise07;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalculatingDiscountFreight {

    static final BigDecimal FREIGHT = new BigDecimal("15.00");
    static final BigDecimal DISCOUNT_FREIGHT = new BigDecimal("100.00");

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the product value: ");
        BigDecimal productValue = scanner.nextBigDecimal();

        if (productValue.compareTo(DISCOUNT_FREIGHT) >= 0) {
            System.out.println("Discount applied to purchases over $100");
            System.out.println("Value of your purchases is: " + productValue);
        } else {
            BigDecimal total = productValue.add(FREIGHT);
            System.out.println("Value of your purchases is: " + total);
        }

        scanner.close();
    }
}
