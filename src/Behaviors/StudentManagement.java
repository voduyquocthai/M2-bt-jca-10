package Behaviors;

import Entities.Student;

import java.util.ArrayList;

public class StudentManagement {

    private ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student s){
        students.add(s);
    }

    public void deleteStudent(int id){
        students.removeIf(s -> s.getId() == id);
    }

    public void updateStudent(Student s){
        for (Student student: students) {
            if(student.getId() == s.getId()){
                student.setName(s.getName());
                student.setDateOfBirth(s.getDateOfBirth());
                student.setAddress(s.getAddress());
                student.set_class(s.get_class());
                student.setCourse(s.getCourse());
                student.setSemester(s.getSemester());
            }
        }
    }

    public void showAllStudentInfo(){
        for (Student s: students) {
            System.out.println(s.toString());
        }
    }

    public void showStudentInfoById(int id){
        for (Student s: students) {
            if(s.getId() == id){
                System.out.println(s.toString());
            }
        }
    }
}
