
package by.gsu.pms;

import java.util.ArrayList;
import gsu.pms.ammuntions.*;

public class ArmoryShop {

    public void buy(ArrayList<Ammunition> inventory, String... ammun) {
        Ammunition temp;
        for (int i = 0; i < ammun.length; i++) {
            temp = defineAmmunition(ammun[i]);
            if (temp != null) {
                inventory.add(temp);
            }
        }
    }

    private Ammunition defineAmmunition(String type) {
        switch (type) {
            case "Leather_jacket":
                return new Armor(500, "L", false, 700, 25);
            case "Helm":
                return new Helm(100, "M", true, 100, 2);
            case "Gloves":
                return new Lance(2, 100, 100, 10);
            case "Leather_pants":
                return new Shield(200, "M", 120, 8);
            case "Boots":
                return new Sword(true, 80, 500, 10);
            default:
                System.out.println("I haven`t " + type + ".");
                return null;
        }


    }
}
