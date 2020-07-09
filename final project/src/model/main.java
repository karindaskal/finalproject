package model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class main {
	
	  public static void main(String[] args) {
     /*   List<student>students =new ArrayList<>();

        student student1 = new student("karin",208511658,new subjectList().getComputerS());
        student student2 = new student("lilach",208511659,new subjectList().getComputerS());
        student student3 = new student("shir",208511657,new subjectList().getComputerS());
        student student4 = new student("michelle",208511656,new subjectList().getComputerS());
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);*/
        List<student> students = new ArrayList<>();


        for (int i = 0; i < students.size(); i++) {
            user id1 = (user) students.get(i);
            if (id1.getId() == 208511656) {
                for (int j = 0; j < students.get(i).getSubjects().size(); j++) {
                    if (students.get(i).getSubjects().get(j).getName().equals("OOP")) {
                        students.get(i).getSubjects().get(j).setGrade(90);

                    }
                }

            }
        }
            //student4.printgrade();
        //    students.get(3).printgrade();
           // System.out.println( factorySubject.createFactory("computer science"));

          StudentsList bookDataManager = StudentsList.getMySingleton();
           StudentsList bookDataManager2 = StudentsList.getMySingleton();

     List<List<student>> booksData = bookDataManager.readDataFromFile();
     List<List<student>> booksData2 = bookDataManager2.readDataFromFile();

            lecturer lecturer =new lecturer("david",31345689,"Software Engineering","computer science");

     bookDataManager.addAndWriteToFile("OOP",20851165,70,"computer science");
     
     bookDataManager.addAndWriteToFile("drafting",208511668,90,"design");

        bookDataManager2.addAndWriteToFile(lecturer.getNameSubject(),208511659,50,"computer science");
        booksData = bookDataManager.readDataFromFile();
   if(booksData.size()!=0);
     booksData.get(0).get(1).printgrade();
       booksData.get(1).get(1).printgrade();
        System.out.println( bookDataManager.addAndWriteToFile("drafting",208511668,90,"design"));
       
    
        

//







      /*  try{
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(subjects);
        }catch (IOException e) {
            e.printStackTrace();

        }*/
		/*
		 * System.out.println(new lecturerList().isLecturer(123456787,"Yafit"));
		 * System.out.println( bookDataManager.isStudent(208511659,"lilach"));
		 * System.out.println( bookDataManager.isStudent(208511659,"karin")); lecturer l
		 * = new lecturerList().getLecturer(123456788, "Eran"); System.out.println(l);
		 */

        }
    }

