package model;

public class Student extends Human {
    private int numberOfCourse;

    public Student(String name, int age) {
        super(name, age);
    }


    public void study(){
        System.out.println("Student " + this.name + " studying");
    }
    public void showCourse(){
        System.out.println("This course is " + numberOfCourse);
    }

    public void setNumberOfCourse(int numberOfCourse) {
            this.numberOfCourse = numberOfCourse;
    }
}
