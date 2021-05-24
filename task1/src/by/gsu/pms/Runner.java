package by.gsu.pms;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Purchase maxCost = new Purchase();
        boolean isAllEqual= true;

        try(Scanner scanner = new Scanner(new FileReader("D:\\Maslenkina\\JAVA\\task1\\src\\by\\gsu\\pms\\in.txt"))){
            scanner.useLocale(Locale.ENGLISH);

            Purchase[] purchases = {
                    new DiscountPurchase("Pokestop",340,8,20),
                    new NumberPurchase("Pokegym",920,20,6.6),
                    new Purchase("Milk",30,1),
                    new Purchase("Pizza",30,3),
                    new Purchase("Chocolate",40,1),
                    new Purchase("Ice-cream",230,1),

                    Factory.getClassFromFile(scanner),
            };

            for (Purchase purchase : purchases) {
                if (purchase != null){
                    System.out.println(purchase);
                    if (maxCost.getCost() < purchase.getCost()) {
                        maxCost = purchase;
                    }
                    if (!purchase.equals(purchases[0])) {
                        isAllEqual = false;
                    }
                }
            }

            if (isAllEqual) {
                System.out.println("All equal");
            } else {
                System.out.println("All not equal");
            }
            System.out.println("Max cost = "+ maxCost);
        }
        catch (FileNotFoundException e){
            System.err.println("File not found");
        }

    }
}