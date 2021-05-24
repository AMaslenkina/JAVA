package by.gsu.pms;

import java.util.Scanner;

public class DiscountPurchase extends Purchase {

    private int discount;

    public DiscountPurchase(int discount) {
        super(name, price, number);
        this.discount = discount;
    }

    public DiscountPurchase(){
        this("",0,0,0);
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
