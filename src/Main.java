import entity.Euro;
import entity.Purchase;
import entity.PurchaseFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Purchase purchase = new Purchase("Cabernet", new Euro(100), 2);
//
//        System.out.println(purchase + "\n" + purchase);

        try(Scanner scanner = new Scanner(new FileReader("/home/ave/university-2/practical4-v2/src/in"))) {

//      1. Create an array for 6 objects
            final int PURCHASES_NUMBER = 6;
            Purchase purchases[] = new Purchase[PURCHASES_NUMBER];

            Purchase withMaxCost = new Purchase();
            boolean areTheyEqual;

            for(int i = 0; i < purchases.length; i++){
//      2. Input data from the given file into the array.
                purchases[i] = PurchaseFactory.getPurchaseFromFactory(scanner);



//      3. Output the array content to the console (one element per line).
                System.out.println(purchases[i]);
            }
//      4. Output the purchase with maximum cost.
//      5. Determine whether all purchases are equal.




        }catch (FileNotFoundException e){
            System.err.println("File not found :(");
        }
    }
}