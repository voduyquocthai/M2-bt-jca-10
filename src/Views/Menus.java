package Views;

import Entities.Student;

import java.util.Scanner;

public class Menus {

    static Scanner input = new Scanner(System.in);

    public static Student getStudentInfo(){
        System.out.println("---------------------------------");
        System.out.println("Enter Student's Id:");
        int id = Integer.parseInt(input.nextLine());
        System.out.println("Enter Student's Name:");
        String name = input.nextLine();
        System.out.println("Enter Student's Date Of Birth:");
        String dob = input.nextLine();
        System.out.println("Enter Student's Address:");
        String address = input.nextLine();
        System.out.println("Enter Student's Class:");
        String _class = input.nextLine();
        System.out.println("Enter Student's Course:");
        String course = input.nextLine();
        System.out.println("Enter Student's Semester:");
        String semester = input.nextLine();
        Student student = new Student(id, name, dob, address, _class, course, semester);
        return student;
    }
}
