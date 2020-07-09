package model;

import java.io.Serializable;

public class subject implements Serializable {
   private String name;
   private int grade;
  private   int credits;
    private static final long serialVersionUID = 3L;

    public subject(String name, int credits) {
        this.name = name;
        this.credits=credits;
        grade=-1;
    }
   
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getCredits() {
        return credits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
    	String s="";
    	if(grade!=-1) {
        	s="subject{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                ", credits=" + credits +
                '}';}
        return s;
    }
}