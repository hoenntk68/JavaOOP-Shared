/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList();
        list.add(new Student("Huyen", 8, 155));
        list.add(new Student("Dat", 9, 175));
        list.add(new Student("Long", 7, 174));
        for (Student x:list){
            System.out.print(x.id + " ");
        }
        System.out.println("");
        Collections.sort(list);
        for (Student x:list){
            System.out.print(x.id + " ");
        }    
    }
}
