
package by.gsu.pms;

public class Gloves extends Ammunition {

    private String name = "NoName";
    private final boolean twoHanded;
    private int damage;
    private int dmgRange;

    public Gloves(boolean twoHanded, int damage, int cost, int weight) {
        super(cost, weight);
        this.twoHanded = twoHanded;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public boolean isTwoHanded() {
        return twoHanded;
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
        String glovesType = twoHanded ? "two-handed" : "single-handed";
        return "\n" + "#Gloves." + noname + "It`s " + glovesType + " gloves"
                + ". It can inflict " + damage + " damage. " + super.toString();

    }
}
