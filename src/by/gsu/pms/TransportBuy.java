package by.gsu.pms;

public class TransportBuy extends AbstractBuy{
    private int transportExpenses;


    public TransportBuy(Commodity commodity, int number, int transportExpenses) {
        super(commodity, number);
        this.transportExpenses = transportExpenses;
    }

    public TransportBuy(int transportExpenses) {
        this.transportExpenses = transportExpenses;
    }

    public int getTransportExpenses() {
        return transportExpenses;
    }

    public void setTransportExpenses(int transportExpenses) {
        this.transportExpenses = transportExpenses;
    }

    @Override
    public int getCost() {
        return super.getCost()+transportExpenses;
    }

    @Override
    protected String fieldsToString() {
        return super.fieldsToString() + ";" + transportExpenses;
    }
}
