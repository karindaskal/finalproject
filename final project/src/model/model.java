package model;

public interface  model {
int login (int id,String name);
student getstudens (int id,String name);
lecturer getLectur (int id,String name);
public boolean addgrade (String subject, String faculty,int id, int grade);
public String StringgPercentage (String subject, String faculty);
public model getneeservise ();



}
