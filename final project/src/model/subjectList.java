package model;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class subjectList implements Serializable{
private    List<subject> computerS= new ArrayList<>();
 private static final long serialVersionUID = 2L;



 public subjectList() {
  subject SoftwareEngineering= new subject("Software Engineering", 4);
  subject algorithm = new subject("algorithm", 4);
  subject programming = new subject("programming", 5);
  subject math = new subject("math", 3);
  subject OOP = new subject("OOP", 5);
  this.computerS.add(SoftwareEngineering);
  this.computerS.add(algorithm);
  this.computerS.add(programming);
  this.computerS.add(math);
  this.computerS.add(OOP);
 }

 public List<subject> getComputerS() {
  return computerS;
 }
}
