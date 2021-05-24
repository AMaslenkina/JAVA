package by.gsu.pms;

public class Commodity {

    private String name;
    private int price;

    public Commodity(String name, int price){
        super();
        this.name = name;
        this.price = price;
    }
    public Commodity(){
        this("",0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return (name + ";" + price);
    }
}
