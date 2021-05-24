import by.gsu.pms.*;
import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        House[] house_list = Methods.house_list();        
                
                System.out.println("a)Вывести список квартир, имеющих заданное число комнат.");
                System.out.print("Введите число комнат:");
                String number_rooms = scanner.nextInt();
                Methods.checkRooms(house_list,number_rooms);

                System.out.println("b)Вывести список  квартир,  имеющих  заданное  число  комнат  и  расположенных на этаже, который находится в заданном промежутке.");
                System.out.print("Введите число комнат: ");
                String rooms = scanner.nextInt();
                System.out.print("Введите этажи: ");
                Methods.checkHouses(house_list, rooms, scanner.nextInt());

                System.out.println("c)Вывести список квартир, имеющих площадь, превосходящую заданную. ");
                System.out.print("Введите площадь: ");
                Methods.checkArea(house_list,scanner.nextInt());
    }
}