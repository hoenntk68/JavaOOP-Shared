/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JavaCollections;

/**
 *
 * @author Hp
 */
public class Student implements Comparable<Student>{
    String id;
    int gpa;
    int height;

    public Student(String id, int gpa, int height) {
        this.id = id;
        this.gpa = gpa;
        this.height = height;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + '}';
    }

    @Override
    public int compareTo(Student s) {
        int diff = this.height - s.height;
        return diff;
    }
 //1  3  2  2 
}
