package model.disciplines;

import model.Discipline;
import model.TypeOfDiscipline;

public class Philosophy extends Discipline implements TypeOfDiscipline {
    public Philosophy(String name) {
        super(name);
    }
    @Override
    public boolean setTypeOfDiscipline(boolean isTechDiscipline) {
        return this.isTechDiscipline = false;
    }
}
