package model ;


import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentsList {
   ;
    private List<List<student>> students = new ArrayList<>();


    private final String fileName = "sd.dat";



    static StudentsList mySingleton;

    private StudentsList() {}

    public static StudentsList getMySingleton() {
        if (mySingleton == null) {

            mySingleton = new StudentsList();



        }
        return mySingleton;
    }


   public boolean addAndWriteToFile(String nameSub,int id,int grade,String department) {
        /*if (students.size() == 0) {
            System.out.println("File is empty");
            student student1 = new student("karin",208511658,new subjectList().getComputerS());
            student student2 = new student("lilach",208511659,new subjectList().getComputerS());
            student student3 = new student("shir",208511657,new subjectList().getComputerS());
            student student4 = new student("michelle",208511656,new subjectList().getComputerS());
            students.add(student1);
            students.add(student2);
          students.add(student3);
            students.add(student4);

       }*/
        int k=0;
        Boolean writeBookResult= false;
       if(grade>=0&&grade<=100) {     
        if(department.equals("computer science")) k=0;
       else if(department.equals("design"))k=1;
       for (int i = 0; i < students.get(k).size(); i++) {

            if (students.get(k).get(i).getId() == id) {
                for (int j = 0; j < students.get(k).get(i).getSubjects().size(); j++) {
                    if (students.get(k).get(i).getSubjects().get(j).getName().equals(nameSub) )
                    {
                      students.get(k).get(i).getSubjects().get(j).setGrade(grade);
                      writeBookResult=true;
                      break;
                    }
                    else
                    	writeBookResult = false;
                }

            }
        }
        }



            try (OutputStream fileOutputStream = new FileOutputStream(fileName);
                 ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(students);
              
            } catch (IOException e) {
                e.printStackTrace();
           
                           }

            return writeBookResult;
        }
   /* public boolean addAndWriteToFile(student student) {


        boolean writeBookResult = false;
        students.add(student);
            try (OutputStream fileOutputStream = new FileOutputStream(fileName);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(students);
            writeBookResult = true;
        } catch (IOException e) {
            e.printStackTrace();
            writeBookResult = false;
        }

        return writeBookResult;
    }*/



    public List<List<student> >readDataFromFile() {
    
         File file = new File(fileName);
    
           if (file.length()==0) {
                System.out.println("File is empty");
                ArrayList<student> c =new ArrayList<>();
               ArrayList<student> d= new ArrayList<>();
               ArrayList<student> e=new ArrayList<>();

                students.add(c);
                students.add(d);
                students.add(e);
               student student1 = new student("karin", 208511658, factorySubject.createFactory("computer science").createDepartment());
               student student2 = new student("lilach", 208511659, factorySubject.createFactory("computer science").createDepartment());
               student student3 = new student("shir", 208511657, factorySubject.createFactory("computer science").createDepartment());
               student student4 = new student("michelle", 208511656, factorySubject.createFactory("computer science").createDepartment());
               student student5 = new student("liz", 208511669, factorySubject.createFactory("design").createDepartment());
               student student6 = new student("nofar", 208511668, factorySubject.createFactory("design").createDepartment());
               student student7 = new student("shiran", 208511667, factorySubject.createFactory("design").createDepartment());
               student student8 = new student("michal", 208511666, factorySubject.createFactory("design").createDepartment());
               students.get(0).add(student1);
               students.get(0).add(student2);
               students.get(0).add(student3);
               students.get(0).add(student4);
               students.get(1).add(student5);
               students.get(1).add(student6);
               students.get(1).add(student7);
               students.get(1).add(student8);


                return students;          }
          else {
               try (InputStream fileInputStream = new FileInputStream(fileName);
                  ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

                   students = (List<List<student>>) objectInputStream.readObject();


               } catch (IOException | ClassNotFoundException e) {
                    e.printStackTrace();
                }

                return students;
            }

        }
    public Boolean isStudent(int id,String name) {
        int i;
        for (int j = 0; j < 2; j++) {
            for (i = 0; i < students.get(j).size(); i++) {
                if (students.get(j).get(i).getId() == id && students.get(j).get(i).getName().equals(name)) {
                    return true;
                }
            }
        }
        return false;


    }
    public  student getStudent(int id,String name) {
        int i;
        for (int j = 0; j < 2; j++) {
            for (i = 0; i < students.get(j).size(); i++) {
                if (students.get(j).get(i).getId() == id && students.get(j).get(i).getName().equals(name)) {
                    return  students.get(j).get(i);
                }
            }
        }
        return null;


    }
}
