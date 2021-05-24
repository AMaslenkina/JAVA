package by.gsu.pms;

public class PriceBuy extends AbstractBuy{
    private int priceDiscount;


    public PriceBuy(Commodity commodity, int number, int priceDiscount) {
        super(commodity, number);
        this.priceDiscount = priceDiscount;
    }

    public PriceBuy(int priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public int getPriceDiscount() {
        return priceDiscount;
    }

    public void setPriceDiscount(int priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    @Override
    public int getCost() {
        return super.getCost()-priceDiscount;
    }

    @Override
    protected String fieldsToString() {
        return super.fieldsToString() + ";" + priceDiscount;
    }

}
