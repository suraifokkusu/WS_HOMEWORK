package model.disciplines;

import model.Discipline;
import model.TypeOfDiscipline;

public class Literature extends Discipline implements TypeOfDiscipline {
    public Literature(String name) {
        super(name);
    }
    @Override
    public boolean setTypeOfDiscipline(boolean isTechDiscipline) {
        return this.isTechDiscipline = true;
    }
}
