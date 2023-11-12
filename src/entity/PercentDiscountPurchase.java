package entity;

import java.util.Scanner;

public class PercentDiscountPurchase extends Purchase{
    private double discountPercentForAll;
    private final static int AMOUNT_TO_GET_DISCOUNT = 5;

    public PercentDiscountPurchase(String purchaseName, Euro price, int purchasedUnits, double discountPercentForAll){
        super(purchaseName, price, purchasedUnits);
        this.discountPercentForAll = discountPercentForAll;
    }

    public PercentDiscountPurchase(Scanner scanner){
        purchaseName = scanner.next();
        price = new Euro(scanner.nextInt());
        purchasedUnits = scanner.nextInt();
        discountPercentForAll = scanner.nextDouble();

    }

}
