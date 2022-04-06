import model.Faculty;
import model.Group;
import model.Student;
import model.University;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------");
        //UNIVERSITY
        University university = new University("PNU");
        university.showUniversity();
        System.out.println("-----------------");
        //FACULTY
        Faculty faculty = new Faculty("FKFN");
        faculty.showFaculty();

        ArrayList<Student> students = new ArrayList<>();
        System.out.println("-----------------");
        //STUDENTS
        Student Mikita = new Student("Mikita", 21);
        Mikita.setNumberOfCourse(3);
        Mikita.study();
        Mikita.showCourse();

        Student Albert = new Student("Albert", 19);
        Albert.setNumberOfCourse(2);
        Albert.study();

        System.out.println("-----------------");
        //GROUP
        Group group = new Group("PI");
        group.setCourse(3);
        group.showAllInfo();
        group.addStudentInGroup(Mikita);
        group.addStudentInGroup(Albert);
        group.showStudents();



    }
}
