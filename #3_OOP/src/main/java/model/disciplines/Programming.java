package model.disciplines;

import model.Discipline;
import model.TypeOfDiscipline;

public class Programming extends Discipline implements TypeOfDiscipline {
    public Programming(String name) {
        super(name);
    }

    @Override
    public boolean setTypeOfDiscipline(boolean isTechDiscipline) {
        return this.isTechDiscipline = true;
    }

    public void letsCode(){
        System.out.println("Let's coding!");
    }
}
