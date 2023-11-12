package entity;
import java.util.Scanner;
public class Purchase {
    public String purchaseName;
    public Euro price;
    public int purchasedUnits;


    public Purchase(){
        this.purchaseName = "Cabernet Sauvignon";
        this.price = new Euro(150);
        this.purchasedUnits = 1;
    }

    public Purchase(String purchaseName, Euro price, int purchasedUnits){
        this.purchaseName = purchaseName;
        this.price = price;
        this.purchasedUnits = purchasedUnits;
    }

    public Purchase(Scanner scanner){
        purchaseName = scanner.next();
        price = new Euro(scanner.nextInt());
        purchasedUnits = scanner.nextInt();
    }

    public Euro getCost(){
        Euro purchaseCost = getPrice().mul(purchasedUnits);
        return purchaseCost;
    }
    @Override
    public String toString() {
        return getClass().getSimpleName() + ";"
                + purchaseName + ";"
                + price + ";"
                + purchasedUnits + ";"
                + getCost();
    }


    public String getPurchaseName() {
        return purchaseName;
    }

    public void setPurchaseName(String purchaseName) {
        this.purchaseName = purchaseName;
    }

    public Euro getPrice() {
        return new Euro(this.price);
    }

    public void setPrice(Euro price) {
        this.price = price;
    }

    public int getPurchasedUnits() {
        return purchasedUnits;
    }

    public void setPurchasedUnits(int purchasedUnits) {
        this.purchasedUnits = purchasedUnits;
    }
}
