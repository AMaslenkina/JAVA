package by.gsu.pms;

public class BusinessTrip {
    private String name;
    private static final int RATE = 25000 ;
    private int expenses;
    private int days;

    public BusinessTrip() {
        super();
    }

    public BusinessTrip(String name, int expenses, int days) {
        super();
        this.name = name;
        this.expenses = expenses;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpenses() {
        return expenses;
    }

    public void setExpenses(int expenses) {
        this.expenses = expenses;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getTotal() {
        return RATE * days + expenses;
    }

    public void show() {
        System.out.println("rate = " + RATE + "\n"
                + "account = " + name + "\n"
                + "transport = " + expenses + "\n"
                + "days = " + days + "\n"
                + "total = " + getTotal());
    }
    public String toString() {
        return RATE + ";" + name + ";" + expenses + ";" + days + ";" + getTotal();
    }
}
