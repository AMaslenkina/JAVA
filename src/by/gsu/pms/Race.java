package by.gsu.pms;

public class Race {
    private String data;
    private int numberRiders;
    private boolean prize;

    public Race() {
        this("",0, false);
    }

    public Race(String data, int numberRiders, boolean prize) {
        super();
        this.data = data;
        this.numberRiders = numberRiders;
        this.prize = prize;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNumberRiders() {
        return numberRiders;
    }

    public void setNumberRiders(int numberRiders) {
        this.numberRiders = numberRiders;
    }

    public boolean getPrize() {
        return prize;
    }

    public void setPrize(boolean prize) {
        this.prize = prize;
    }

}
