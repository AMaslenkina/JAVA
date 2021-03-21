package by.gsu.asoilab;

public class Density {
    private String name;
    private int density;

    public Density(){
        this("",0);
    }

    public Density(String name, int density) {
        super();
        this.name = name;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        this.density = density;
    }

    @Override
    public String toString() {
        return name + ";" + density;
    }
}


