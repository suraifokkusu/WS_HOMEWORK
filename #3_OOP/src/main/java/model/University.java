package model;

public class University {
    private String name;

    public University(String name) {
        this.name = name;
    }

    public void showUniversity(){
        System.out.println("Name of University: " + this.name);
    }
}
