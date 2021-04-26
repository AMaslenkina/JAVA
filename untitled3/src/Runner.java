import by.gsu.pms.*;

import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        Commodity commodity = new Commodity("Nutella",3000);

        AbstractPurchase[] purchases = {
                new PriceDiscountPurchase(commodity, 11, 22),
                new PriceDiscountPurchase(commodity, 22, 36),
                new PercentDiscountPurchase(commodity, 3, 8),
                new PercentDiscountPurchase(commodity, 4, 15),
                new TransportExpensesPurchase(commodity, 40, 400),
                new TransportExpensesPurchase(commodity, 350, 100),
        };

        for (AbstractPurchase purchase: purchases) {
            System.out.println(purchase);
        }

        Arrays.sort(purchases);
        AbstractPurchase minCostPurchase = purchases[0];

        System.out.println("Sorted:");
        for (AbstractPurchase purchase: purchases) {
            System.out.println(purchase);
            if(minCostPurchase.compareTo(purchase) < 0){
                minCostPurchase = purchase;
            }
        }
        System.out.println("Min cost:");
        System.out.println(minCostPurchase);
        purchases[0].view();
    }
}
