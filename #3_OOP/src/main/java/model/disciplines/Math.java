package model.disciplines;

import model.Discipline;
import model.TypeOfDiscipline;

public class Math extends Discipline implements TypeOfDiscipline {
    public Math(String name) {
        super(name);
    }
    @Override
    public boolean setTypeOfDiscipline(boolean isTechDiscipline) {
        return this.isTechDiscipline = true;
    }
}
