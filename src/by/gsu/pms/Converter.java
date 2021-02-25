package by.gsu.pms;

public class Converter {
    private final double divider;
    private final int decimalPlaces;

    public Converter(double divider, int decimalPlaces ){
        this.divider = divider;
        this.decimalPlaces  = decimalPlaces ;
    }

    public void convert(BusinessTrip businessTrip){
        double scale = Math.pow(10, decimalPlaces);
        System.out.println("rate = " + Math.round((BusinessTrip.RATE /divider)*scale)/scale);
        System.out.println("account = " + businessTrip.getName());
        System.out.println("transport = " + Math.round((businessTrip.getExpenses()/divider)*scale)/scale);
        System.out.println("days = " + businessTrip.getDays());
        System.out.println("total = " + Math.round((businessTrip.getTotal()/divider)*scale)/scale);

    }
}
