package by.gsu.pms;

public class Purchase {
    private String name;
    private double price;
    private int number;

    public Purchase(String name, double price, int number) {
        super();
        this.name = name;
        this.price = price;
        this.number = number;
    }
    public Purchase{
        this("",0,0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getCost(){
        return this.price*this.number;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return name + ";" + price + ";" + number + ";" + getCost();
    }

    public boolean equals(){
       return this.name == purchase.getName() && this.price == purchase.getPrice();
    }

}
