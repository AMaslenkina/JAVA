package by.gsu.pms;

public class Race {
    private String data;
    private int numberRiders;
    private String prize;

    public Race() { super(); }

    public Race(String data, int numberRiders, String prize) {
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

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }

}
