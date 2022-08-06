package exercise05;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CalculatingValueTotal {

    static final Integer PERCENTUAL_DISCOUNT = 10;
    static final Integer QUANTITY_PRODUCT_FOR_DISCOUNT = 10;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the product value: ");
        BigDecimal productValue = scanner.nextBigDecimal();

        System.out.println("Enter the quantity of the product you want: ");
        int quantityProduct = scanner.nextInt();

        BigDecimal subTotal = productValue.multiply(BigDecimal.valueOf(quantityProduct));

        System.out.println("The value of your purchase is: $" + subTotal);

        BigDecimal discountSubtotal;

        if (quantityProduct >= QUANTITY_PRODUCT_FOR_DISCOUNT) {
            discountSubtotal = subTotal.divide(BigDecimal.valueOf(PERCENTUAL_DISCOUNT), 2, RoundingMode.UP);
            System.out.println("A 10% discount has been applied to your purchase its total value is: $" + discountSubtotal);
        }
    }
}
