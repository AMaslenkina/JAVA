
package by.gsu.pms;

public class Leather_pants extends Ammunition {

    private String name = "NoName";
    private int length;
    private int damage;
    private int dmgRange;

    public Leather_pants(int length, int damage, int cost, int weight) {
        super(cost, weight);
        this.length = length;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getDamage() {
        return damage;
    }

    public int getDmgRange() {
        return dmgRange;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDmgRange(int dmgRange) {
        this.dmgRange = dmgRange;
    }

    @Override
    public String toString() {
        String noname = "";
        if (!name.equals("NoName")) {
            noname = "Name: " + name + ". ";
        }
        return "\n" + "#Leather_pants." + noname + "It can inflict " + damage
                + " damage. Length: " + length + ". " + super.toString();

    }
}
