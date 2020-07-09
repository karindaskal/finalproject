package model;

import java.util.List;

public class departmentComputer extends department {
    @Override
    public List<subject> createDepartment() {
        subjects1.add(new subject("OOP", 5));
        subjects1.add (new subject("math", 3));
        subjects1.add(new subject("programming", 5));
        subjects1.add(new subject("algorithm", 4));
        subjects1.add(new subject("Software Engineering", 4));
        return subjects1;
    }
}
