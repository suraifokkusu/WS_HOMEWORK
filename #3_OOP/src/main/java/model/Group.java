package model;

import java.util.ArrayList;

public class Group {
    private String name;
    private int course;
    private ArrayList<Student> students;

    public Group(String name) {
        this.name = name;
        students = new ArrayList<Student>();
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void addStudentInGroup(Student student) {
        this.students.add(student);
    }

    public void showStudents() {
        for(int count =0; count<students.size(); count++)
            System.out.println(students.get(count).name);
    }

    public void showAllInfo() {
        System.out.println("Name of Group: " + name + " and course " + course);
    }
}
