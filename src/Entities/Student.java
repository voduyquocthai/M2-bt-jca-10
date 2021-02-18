package Entities;

public class Student extends Person{

    private String _class;

    private String course;

    private String semester;

    public Student(int id, String name, String dateOfBirth, String address, String _class, String course, String semester) {
        super(id, name, dateOfBirth, address);
        this._class = _class;
        this.course = course;
        this.semester = semester;
    }

    public Student() {
    }

    public String get_class() {
        return _class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "_class='" + _class + '\'' +
                ", course='" + course + '\'' +
                ", semester='" + semester + '\'' +
                '}';
    }
}
