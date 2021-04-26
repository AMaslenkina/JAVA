package by.gsu.pms;

public class BuisnessTrip implements Comparable<BuisnessTrip> {

    private static int RATE = 2500;
    private String account;
    private int transport;
    private int days;

    public BuisnessTrip() {
        this("",0,0);
    }
    public BuisnessTrip(String account, int transport, int days) {
        super();
        this.account = account;
        this.transport = transport;
        this.days = days;
    }


    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getTransport() {
        return transport;
    }

    public void setTransport(int transport) {
        this.transport = transport;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public static void setRate(int rate) {
        BuisnessTripExpenses.RATE = rate;
    }

    public int getTotal() {
        return RATE * days + transport;
    }

    public void show() {

        System.out.println("Rate = " + RATE);
        System.out.println("Account = " + account);
        System.out.println("Transport = " + transport);
        System.out.println("Days = " + days);

    }

    @Override
    public String toString() {
        return RATE + ";" + account + ";" + transport + ";" + days + ";" + getTotal();
    }

    @Override
    public int compareTo(BuisnessTripExpenses buisnessTripExpenses) {
        return buisnessTripExpenses.getTotal() - getTotal();
    }

}
