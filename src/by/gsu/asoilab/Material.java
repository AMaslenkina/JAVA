package by.gsu.asoilab;

public class Material {
    private String name;
    private int volume;
    private Density density;

    public Material(String name, double volume, Density density) {
        this.name = name;
        this.volume = volume;
        this.density = density;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public Density getDensity() {
        return density;
    }

    public void setDensity(Density density) {
        this.density = density;
    }

    public double getMass() {
        return density.getDensity()*this.volume;
    }

    @Override
    public String toString() {
        return name + ";" + density + ";" + volume + ";" + getMass();
    }
}
