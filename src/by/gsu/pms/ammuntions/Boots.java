
package by.gsu.pms;

public class Boots extends Ammunition {

    private String name = "NoName";
    private int canTakeDamage;
    private String size;

    public Boots(int canTakeDamage, String size, int cost, int weight) {
        super(cost, weight);
        this.canTakeDamage = canTakeDamage;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getCanTakeDamage() {
        return canTakeDamage;
    }

    public String getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCanTakeDamage(int canTakeDamage) {
        this.canTakeDamage = canTakeDamage;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        String noname = "";
        if (!name.equals("NoName")) {
            noname = "Name: " + name + ". ";
        }
        return "\n" + "#Boots." + noname + "It can take " + canTakeDamage
                + " damage. Size: " + size + ". " + super.toString();

    }
}
