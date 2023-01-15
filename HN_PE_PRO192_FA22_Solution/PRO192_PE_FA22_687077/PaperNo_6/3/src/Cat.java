/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hp
 */
public class Cat implements Comparable<Cat> {

    private String area;
    private int leg;

    public Cat() {
    }

    public Cat(String area, int leg) {
        this.area = area;
        this.leg = leg;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getLeg() {
        return leg;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    @Override
    public int compareTo(Cat o) {
        return this.getLeg() % 10 - o.getLeg() % 10;
    }

}
