/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project01.data.structure;

/**
 *
 * @author anh51
 */
public class StudentTracker {
    private int maxSize;
    private Student[] students;
    private int size;

    public StudentTracker(int maxSize) {
        this.maxSize = maxSize;
        students = new Student[maxSize];
        size = 0;
        
    }
    public void insertStudent(String name, int id, double gpa) {
        if(size == maxSize){
        System.out.println("Cannot insert student. Maximum size reached.");
        return;
        }
        Student newStudent = new Student(name, id, gpa);
        students[size] = newStudent;
        size++;
        System.out.println("Student information have been successfully added.");
        
         }
        
    
    public void fetchandOutputStudent(int id) {
        for (int i = 0; i < size; i++) {
            if (students[i].getId() == id) {
                System.out.println("Name: " + students[i].getName());
                System.out.println("ID: " + students[i].getId());
                System.out.println("GPA: " + students[i].getGpa());
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public void deleteStudent(int id) {
        for (int i = 0; i < size; i++) {
            if (students[i].getId() == id) {
                for (int j = i; j < size - 1; j++) {
                    students[j] = students[j + 1];
                }
                size--;
                System.out.println("Student deleted.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public void updateStudent(int id, String newName, double newGpa) {
        for (int i = 0; i < size; i++) {
            if (students[i].getId() == id) {
                students[i].setName(newName);
                students[i].setGpa(newGpa);
                System.out.println("Student information updated.");
                return;
            }
        }
        System.out.println("Student not found.");
    }
    
    public void showAll(){
        for(int i = 0; i < maxSize; i++){
            System.out.println(students[i].toString());
        }
    }
    
    public void SortStudent(){
        if(size == 0){
             System.out.println("No student information available.");
            return;
        }
        System.out.println("All Student Information:");
        for (int i = 0; i < size; i++) {
            System.out.println("Name: " + students[i].getName());
            System.out.println("ID: " + students[i].getId());
            System.out.println("GPA: " + students[i].getGpa());
            System.out.println("------------------------");
        }
    }
}
