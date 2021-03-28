package by.gsu.pms;

import java.util.Scanner;

public class NumberPurchase extends Purchase{
    public static final int NUMBER_DISCOUNT = 15;
    private double discount;

    public NumberPurchase(String name, double price, int number, double discount){
        super(name,price,number);
        if (super.number>NUMBER_DISCOUNT){
            this.discount = discount;
        }else {
            this.discount = 0;
        }
    }

    public NumberPurchase(){
        this("",0,0,0);
    }

    public NumberPurchase(Scanner sc) {
        this(sc.next(), sc.nextDouble(), sc.nextInt(), sc.nextDouble());
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getCost(){
        return super.price*this.number*(1-this.discount/100);
    }


}