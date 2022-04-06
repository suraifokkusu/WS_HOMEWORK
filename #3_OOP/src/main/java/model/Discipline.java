package model;

public class Discipline {
    protected String name;
    protected boolean isTechDiscipline;

    public Discipline() {
    }

    public Discipline(String name) {
        this.name = name;
    }

    public void showDiscipline(){
        System.out.println("This Discipline is " + name);
    }

    public void isTechDiscipline() {
        if(this.isTechDiscipline)
            System.out.println("It's technical discipline");
        else
            System.out.println("It's humanitarian discipline");
    }
}
