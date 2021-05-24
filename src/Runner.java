import by.gsu.pms.BuisnessTrip;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class Runner {
    public static void main(String[] args) {
        final String INPUT_FILE = "src\in.txt";
        final String RATE_KEY = "daily-rate";
        final String INDICES_KEY = "indices";
        final String ACCOUNT_KEY = "account%02d";
        final String TRANSPORT_KEY = "transport%02d";
        final String DAYS_KEY = "days%02d";

        try (FileInputStream fileInputStream = new FileInputStream(INPUT_FILE)) {
            ResourceBundle resourceBundle = new PropertyResourceBundle(fileInputStream);

            String[] indices = resourceBundle.getString(INDICES_KEY).split("\\s*;\\s*");
            BuisnessTrip[] buisnessTrip = new BuisnessTrip[indices.length];

            String rate = resourceBundle.getString(RATE_KEY);

            BuisnessTrip.setRate(Integer.parseInt(rate));

            for (int i = 0; i < buisnessTrip.length; i++) {
                int index = Integer.parseInt(indices[i]);
                buisnessTrip[i] = new BuisnessTrip(resourceBundle.getString(String.format(ACCOUNT_KEY, index)),
                        Integer.parseInt(resourceBundle.getString(String.format(TRANSPORT_KEY, index))),
                        Integer.parseInt(resourceBundle.getString(String.format(DAYS_KEY, index))));

            }
            Arrays.sort(buisnessTrip);

            for (BuisnessTrip businessTrip: buisnessTrip) {
                System.out.println(businessTrip);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}