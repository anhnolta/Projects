/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project01.data.structure;

/**
 *
 * @author anh51
 */
public class Student {
    private int ID;
    private String name;
    private double GPA;
  
    public Student(String name, int id, double gpa) {
        this.name = name;
        this.ID = id;
        this.GPA = gpa;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return ID;
    }

    public double getGpa() {
        return GPA;
    }
    public void setGpa(double gpa){
        this.GPA = gpa;
    }

    public int compareTo(Student other) {
        return Integer.compare(ID, other.ID);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + ID + ", GPA: " + GPA;
    }

    void setName(String newName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

