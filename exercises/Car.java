/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaCollections.exercises;

/**
 *
 * @author Hp
 */
public class Car implements Comparable<Car>{
    private int speed;
    private String brand;

    public Car(int speed, String brand) {
        this.speed = speed;
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public int compareTo(Car o) {
        //toyota ford
        int x = this.brand.compareTo(o.getBrand());
        return -x;
    }
    
    
}
