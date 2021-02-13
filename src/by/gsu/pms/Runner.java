package by.gsu.pms;


public class Runner {
    public static void main(String[] args) {

        //task #1

        BusinessTrip[] businessTrips = {
                new BusinessTrip("Tobio Kageyama", 20000, 2),
                new BusinessTrip("Hinata Shoyo", 2000, 9),
                null,
                new BusinessTrip("Nishinoya Yu", 8000, 1),
                new BusinessTrip("Tanaka Ryunosuke", 30000, 8),
                new BusinessTrip("Azumane Asahi", 75000, 6),
                new BusinessTrip(),
        };

        //task #2

        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null) {
                businessTrip.show();
                System.out.println("..................");
            }
        }

        //task #3

        businessTrips[businessTrips.length - 1].setExpenses(90000);
        System.out.println(businessTrips[businessTrips.length-1]);

        //task #4

        System.out.println("Duration = " + (businessTrips[0].getDays() + businessTrips[1].getDays()));

        //task #5

        for (BusinessTrip businessTrip : businessTrips) {
            System.out.println(businessTrip);
        }

        //task #6

        int totalExpenses = 0;
        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null) {
                totalExpenses += businessTrip.getTotal();
            }
        }
        System.out.println("Sum of total expenses = " + totalExpenses);

        //task #7

        int maxTotal = 0;
        String name = "";
        for (BusinessTrip businessTrip : businessTrips) {
            if (businessTrip != null && businessTrip.getTotal() > maxTotal) {
                name = businessTrip.getName();
                maxTotal = businessTrip.getTotal();
            }
        }
        System.out.println("Max total expenses: " + name + " - " + maxTotal);
    }
}