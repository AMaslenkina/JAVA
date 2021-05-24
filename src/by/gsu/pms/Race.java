package by.gsu.pms;

import java.io.Serializable;
import java.util.Scanner;

public class Race implements Serializable {

    private String date;
    private int players;
    private boolean prize;

    public Race() {
        this("",0, false);
    }
    public Race(String date, int players, boolean prize) {
        super();
        this.date = date;
        this.players = players;
        this.prize = prize;
    }
    public Race(String date, int payment) {
        this.date = date;
        this.players = players;
        this.prize = false;
    }

    public Race(Scanner scanner){
        this(scanner.next(), scanner.nextInt(), scanner.nextBoolean());
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int payment) {
        this.players = players;
    }

    public boolean havePrize() {
        return prize;
    }

    public void setPrize(boolean prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return date + ";" + players + ";" + prize + ";";
    }
}
