package model;

import java.util.ArrayList;
import java.util.List;

public class lecturerList {
     private List<lecturer> lecturers = new ArrayList<>();


    public lecturerList() {
    	lecturer l =new lecturer ("David", 123456789, "Software Engineering", "computer science");
    	this.lecturers.add(l);
        this.lecturers.add(new lecturer("David", 123456789, "Software Engineering", "computer science"));
        this.lecturers.add(new lecturer("Eran", 123456788, "OOP", "computer science"));
        this.lecturers.add(new lecturer("Yafit", 123456787, "math", "computer science"));
        this.lecturers.add(new lecturer("Naama", 123456786, "programming", "computer science"));
        this.lecturers.add(new lecturer("Ayelet", 123456785, "algorithm", "computer science"));
      
    

        this.lecturers.add(new lecturer("Dani", 123456784, "Fundamentals of Design", "design"));
        this.lecturers.add(new lecturer("Yael", 123456783, "drafting", "design"));
        this.lecturers.add(new lecturer("Liz", 123456782, "History of Art", "design"));
        this.lecturers.add(new lecturer("Shir", 123456781, "graphic arts", "design"));
    
        this.lecturers.add(new lecturer("Elad", 123456780, "interior design", "design"));
       

    }

    public Boolean isLecturer(int id,String name) {
        int i;
        for (i = 0; i < lecturers.size(); i++) {
            if(lecturers.get(i).getId()==id&&lecturers.get(i).getName().equals(name)){
                return true;
            }

        }
        return false;

    }
    public lecturer getLecturer(int id,String name) {
        int i;
        for (i = 0; i < lecturers.size(); i++) {
        	// System.out.println(lecturers.get(i));
        	
            if(lecturers.get(i).getId()==id&&lecturers.get(i).getName().equals(name)){
            	// System.out.println(lecturers.get(i));
            	 return lecturers.get(i);
            	
            }

        }
         return null;

    }
}
