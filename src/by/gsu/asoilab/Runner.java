package by.gsu.asoilab;

public class Runner {
    public static void main(String[] args){
        Density steel = new Density("Steel", 7850);
        Density copper = new Density("Copper", 8500);

        System.out.println(steel.toString());
        System.out.println(copper.toString());
    }
}
