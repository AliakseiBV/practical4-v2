package entity;
import java.util.Scanner;

public class PriceDiscountPurchase extends Purchase {
    private Euro discountForUnit;

    public PriceDiscountPurchase(String purchaseName, Euro price, int purchasedUnits, Euro discountForUnit){
        super(purchaseName, price, purchasedUnits);
        this.discountForUnit = discountForUnit;
    }

    public PriceDiscountPurchase(Scanner scanner){
        purchaseName = scanner.next();
        price = new Euro(scanner.nextInt());
        purchasedUnits = scanner.nextInt();
        discountForUnit = new Euro(scanner.nextInt());
    }


}
