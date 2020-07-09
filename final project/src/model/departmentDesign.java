package model;

import java.util.List;

public class departmentDesign extends department {
    @Override
    public List<subject> createDepartment() {
        subjects1.add(new subject("Fundamentals of Design", 5));
        subjects1.add (new subject("drafting", 3));
        subjects1.add(new subject("History of Art", 5));
        subjects1.add(new subject("graphic arts", 4));
        subjects1.add(new subject("interior design", 4));
        return subjects1;
        
    }
}
