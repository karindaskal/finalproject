package model;

import java.util.List;

public class departmentEngineering extends department {
    @Override
    public List<subject> createDepartment() {
        subjects1.add(new subject("  Machine learning", 5));
        subjects1.add (new subject("Signal processing", 3));
        subjects1.add(new subject("physics", 5));
        subjects1.add(new subject("engineering", 4));
        subjects1.add(new subject("laboratory", 4));
        return subjects1;

    }
}
