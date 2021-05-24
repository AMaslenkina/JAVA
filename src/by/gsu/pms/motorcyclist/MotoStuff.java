package by.gsu.pms;


import java.util.ArrayList;
import ua.kpi.ammuntions.Ammunition;
import ua.kpi.knight.Knight;
import ua.kpi.shop.ArmoryShop;

public class MotoStuff {

    public static void main(String[] args) {
        Moto knight = new Knight("Duke", new ArrayList<Ammunition>(), "Roland", 29);
        ArmoryShop shop = new ArmoryShop();
        shop.buy(knight.getAmmunition(), "Gloves", "Leather_jacket", "Leather_pants", "Boots", "Helm");
        System.out.println(knight);
        knight.sortAmmunitionsByWeight();
        System.out.println(knight);
        ArrayList<Ammunition> f = knight.findAmmunitionsByCost(100, 201);
        StringBuilder k = new StringBuilder();
        if (!f.isEmpty()) {
            for (Ammunition ammunition : f) {
                k.append(new StringBuilder(ammunition.toString()));
            }
        }
        System.out.println(k);
    }
}
