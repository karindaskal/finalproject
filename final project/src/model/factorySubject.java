package model;

public class factorySubject {
    public static department createFactory (String tr){
        switch (tr) {
            case "computer science":
                return new departmentComputer();
            case "design":
                return new departmentDesign();
        }
        return null;


    }

}
