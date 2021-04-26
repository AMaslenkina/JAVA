package by.gsu.pms;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializer {
    private Deserializer(){}
    public static Race[] deserialize(String file) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            return (Race[]) inputStream.readObject();
        } catch (Exception e) {
            return new Race[0];
        }
    }
}
