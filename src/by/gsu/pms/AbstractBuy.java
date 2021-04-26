package by.gsu.pms;

public abstract class AbstractBuy implements Comparable<AbstractPurchase>,ViewBuy{
    private Commodity commodity;
    private int number;

    public AbstractBuy(Commodity commodity, int number) {
        this.commodity = commodity;
        this.number = number;
    }

    public AbstractBuy() {
        this(null,0);
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCost(){
        return commodity.getPrice()*number;
    }

    @Override
    public final String toString() {
        return fieldsToString() + ";" + getCost();
    }

    protected String fieldsToString(){
        return  commodity + ";" + number;
    }

    @Override
    public int compareTo(AbstractBuy buy) {
        return buy.getCost()-this.getCost();
    }

    public void view(){
        System.out.println("Name:"+commodity.getName()+"; Price:"+commodity.getPrice()+"; Number:"+number+"; Cost:"+getCost());
    }
}