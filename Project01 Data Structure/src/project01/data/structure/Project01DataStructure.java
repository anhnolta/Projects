/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project01.data.structure;
import java.util.Scanner;

 /*
 * @author anh51
 */
public class Project01DataStructure {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum size of the data set: ");
        int maxSize = scanner.nextInt();
        scanner.nextLine();
        StudentTracker studentTracker = new StudentTracker(maxSize);
        System.out.print("Enter the initial number of students: ");
        int initialStudents = scanner.nextInt();
        scanner.nextLine();

        
        for (int i = 0; i < initialStudents; i++) {
            System.out.println("Enter student " + (i + 1) + " information:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();
        
            studentTracker.insertStudent(name, id, gpa);
        }
        int choice =0;
        while (choice != 6) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert a new student's information");
            System.out.println("2. Fetch and output a student's information");
            System.out.println("3. Delete a student's information");
            System.out.println("4. Update a student's information");
            System.out.println("5. Output all the student information in sorted order");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
           
            if (choice == 6) {
                break;
            }

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the new student's information:");
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("GPA: ");
                    double gpa = scanner.nextDouble();
                    scanner.nextLine();
                    
                   studentTracker.insertStudent(name, id, gpa);
                    break;
                }
                case 2 -> {
                    System.out.print("Enter the ID of the student to fetch: ");
                    int fetchId = scanner.nextInt();
                    studentTracker.fetchandOutputStudent(fetchId);
                    break;
                }
                case 3 -> {
                    System.out.print("Enter the ID of the student to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    studentTracker.deleteStudent(deleteId);
                }
                case 4 -> {
                    System.out.print("Enter the ID of the student to update: ");
                    int newid = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the updated student's information:");
                    System.out.print("Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("GPA: ");
                    double newGpa = scanner.nextDouble();
                    scanner.nextLine();

                    studentTracker.updateStudent(newid, newName, newGpa);
                    break;
                }
                case 5 -> {
                   studentTracker.SortStudent();
                   break;
                }
                case 6 -> {
                    System.out.println("Exiting the program: ");
                    break;
                }
                default -> System.out.println("Invalid answer. Please try again.");
            }
        }
        scanner.close();
    }
}
