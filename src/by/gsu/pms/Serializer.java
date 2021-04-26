package by.gsu.pms;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializer {
    private Serializer(){}

    public static void serialize(Race[] Races, String file) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            outputStream.writeObject(Races);
        } catch (Exception e) {
        }
    }
}