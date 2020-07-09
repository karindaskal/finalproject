package model;

import java.util.List;

public  class addGrade implements model {
	
	public boolean addgrade (String subject, String faculty,int id, int grade){
		boolean b;
		 StudentsList bookDataManager2 = StudentsList.getMySingleton();
		b= bookDataManager2.addAndWriteToFile(subject,id, grade, faculty);
		 return b;
	}

	@Override
	public int login(int id, String name) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public student getstudens(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public lecturer getLectur(int id, String name) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public model getneeservise() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String StringgPercentage(String subject, String faculty) {
		 List<student>studentList;
		// TODO Auto-generated method stub
		 int pass=0 ,fails=0,count=0,grade;
		  if(faculty=="computer science") { StudentsList bookDataManager =
				 StudentsList.getMySingleton();
				 
				  List<List<student>> booksData = bookDataManager.readDataFromFile();
				  studentList= booksData.get(0);} 
		  else { 
			  StudentsList bookDataManager = StudentsList.getMySingleton();
				  
				  List<List<student>> booksData = bookDataManager.readDataFromFile();
				  studentList= booksData.get(1);
				  
				  }
			 for(int i=0;i < studentList.size();i++) {
				 
				  grade=studentList.get(i).getSubject(subject).getGrade();
				  
				  if(grade>=60) { 
					  pass++; count++;
				  
				  }
				  else if(grade<0);
				  else {
					  fails++; count++;
				  
				  } 
			 }
				  
				  double passP,failsP;
				  if(count!=0) {
					  passP =((double)pass/count)*100; 
					  failsP =((double)fails/count)*100;
					  String p = String.valueOf(passP);
					  String f = String.valueOf(failsP); 
					  String s  =p+"% of students are pass and "+f+"% of students are faild";
					  return s;
				  }
				  
				  
				
				  
				  String s="no grades";
				  
				  return s;
		
	}

}
