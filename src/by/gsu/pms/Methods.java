package by.gsu.pms;

import java.util.Scanner;

public class Methods {
    public static House[] carsList(){
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите количество домов: ");
        House[] houses = new House[scanner1.nextInt()];
        for (int i = 0; i < houses.length; i++) {
            houses[i] = new House();
            System.out.println();
            System.out.print("Введите id: ");
            cars[i].setId(scanner1.nextInt());
            System.out.print("Введите номер  квартиры: ");
            cars[i].setNumber_of_apartment(scanner1.nextInt());
            System.out.print("Введите площадь: ");
            cars[i].setArea(scanner1.nextInt());
            System.out.print("Введите этаж: ");
            cars[i].setFloor(scanner1.nextInt());
            System.out.print("Введите количество комнат: ");
            cars[i].setNumber_of_rooms(scanner1.nextInt());
            System.out.print("Введите улицу: ");
            cars[i].setStreet(scanner1.next());
            System.out.print("Введите тип здания: ");
            cars[i].setType_of_building(scanner1.next());
            System.out.print("Введите cрок эксплуатации: ");
            cars[i].setLife_of_building(scanner1.next());
        }

        return houses;
    }

    public static House[] house(){
        House[] houses = new House[3];
        houses[0]= new House(0,1,320,2,5,"пр. Октября","панельный", 50);
        houses[1]= new House(1,2,600,3,6,"ул. Чкалова","панельный", 40);
        houses[2]= new House(2,3,300,4,3,"пр. Октября","панельный", 20);


        return houses;
    }

    public static void checkRooms(Car[] houses,String number_of_rooms){
        for (House house : houses) {
            if(house.getRooms().equals(number_of_rooms))
                System.out.println(house.toString());
        }
        System.out.println();
    }

    public static void checkHouses(House[] houses,int number_of_rooms,int floor){
        for (House house : houses) {
            if(house.getNumber_of_rooms().equals(number_of_rooms) && (house.getFloor()<=floor){
                System.out.println(house.toString());
            }
        }
        System.out.println();
    }

    public static void checkArea(House[] houses,int area){
        for (House house : houses) {
            if (house.getArea()>area)
            System.out.println(house.toString());
        }
    }
}