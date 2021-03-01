package by.gsu.pms;

public class Runner {

    public static void main(String[] args) {
        Race[] races = {

                new Race("2021.06.12", 5, false),
                new Race("2021.08.18", 11, true),
                new Race("2021.09.15", 6, false),
                new Race("2021.02.05", 19, false),
                null,
                new Race("2021.10.30", 8, false),
                new Race("2021.11.27", 2, true),
                new Race("2022.01.12", 20, true),
                new Race("2022.02.01", 7, false),
                new Race(),
        };

        int totalRiders = 0;
        int totalPrize = 0;

        for (Race race : races){
            if (race != null){
                totalRiders += race.getNumberRiders();
                if (race.getPrize()){
                    totalPrize += 1;
                }
            }
        }
        System.out.println("Total riders = " + totalRiders);
        System.out.println("Races with prizes = " + totalPrize);
    }
}
