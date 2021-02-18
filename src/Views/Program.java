package Views;

import Behaviors.StudentManagement;
import Entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    static Scanner input = new Scanner(System.in);

    static StudentManagement sm = new StudentManagement();

    public static void main(String[] args) {
        do {
            System.out.println("-----Student Management-----");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Show All Student Who Was Born In 1985 And From Thai Nguyen");
            System.out.println("4. Show Add Student Of 10A1 Class");
            System.out.println("5. Update Student");
            System.out.println("6. Show All Students Info");
            int choice = Integer.parseInt(input.nextLine());
            switch (choice){
                case 1:
                    Student student = Menus.getStudentInfo();
                    sm.addStudent(student);
                    break;
                case 2:
                    System.out.println("Enter Student's Id:");
                    int id = Integer.parseInt(input.nextLine());
                    sm.deleteStudent(id);
                    break;
                case 3:
                    ArrayList<Student> students = sm.getStudents();
                    for (Student s: students) {
                        if(s.getDateOfBirth().contains("1985")){
                            if(s.getAddress().contains("Thai Nguyen")){
                                System.out.println(s.toString());
                            }
                        }
                    }
                    break;
                case 4:
                    ArrayList<Student> students1 = sm.getStudents();
                    for(Student s: students1){
                        if(s.get_class().equals("10A1")){
                            System.out.println(s.toString());
                        }
                    }
                    break;
                case 5:
                    Student student1 = Menus.getStudentInfo();
                    sm.updateStudent(student1);
                    break;
                case 6:
                    sm.showAllStudentInfo();
                    break;
                default:
                    System.out.println("Try Again !");
                    continue;
            }
        } while (true);
    }
}
