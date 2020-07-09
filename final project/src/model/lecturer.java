package model;

import java.util.List;

public class lecturer extends user {
   private List<student>studentList;
   private  String nameSubject;
   private String faculty;

    public lecturer(String name, int id, String nameSubject, String faculty) {
        super(name, id);
        this.nameSubject = nameSubject;
        this.faculty = faculty;
    }
    
    public List<student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<student> studentList) {
        this.studentList = studentList;
    }

    public  String getNameSubject() {
        return nameSubject;
    }
    public String toString() {
        return "lecturer{" +
                "nameSubject='" + nameSubject + '\'' +
                ", faculty='" + faculty + '\'' +
                '}';
    }
    public  String getFaculty() {
    	return faculty;
    } 	
    
}


    

    

