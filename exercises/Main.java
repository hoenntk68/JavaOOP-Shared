/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaCollections.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        ArrayList<Car> cars = new ArrayList();
        Car c1 = new Car(120, "Toyota");
        Car c2 = new Car(150, "Mazda");
        cars.add(c1);
        cars.add(c2);
        displayMenu();
        do {
            System.out.print("Your option: ");
            option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    //add
                    System.out.print("Speed: ");
                    int speed = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Brand: ");
                    String brand = sc.nextLine();
                    Car x = new Car(speed, brand);
                    cars.add(x);
                    System.out.println("New car added successful!");
                    break;
                case 2:
                    //remove
                    System.out.print("Enter index of car: ");
                    int index = sc.nextInt();
                    cars.remove(index);
                    System.out.println("Car removed successfully!");
                    break;
                case 3:
                    //view
                    System.out.println("Here is the list of all cars:");
                    for (Car c : cars){
                        System.out.println(c.getBrand() + " " + c.getSpeed());
                    }
                    break;
                case 4:
                    //exit
                    System.out.println("Goodbye!");
                    break;
                case 5:
                    //sort
                    Collections.sort(cars);
                    System.out.println("Cars sorted successfully");
                    break;
                default:
                    System.out.println("Unavailable option!");
            }
        } while (option != 4);
    }

    static void displayMenu() {
        System.out.println("-----CHOOSE AN OPTION-----");
        System.out.println("1. Add a car");
        System.out.println("2. Remove a car");
        System.out.println("3. View all cars");
        System.out.println("5. Sort");
        System.out.println("4. Exit");
    }
}
