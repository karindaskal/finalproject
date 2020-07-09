package model;

import java.util.List;

public  class login implements model {


	public int login(int id, String name) {
		// TODO Auto-generated method stub
		StudentsList bookDataManager = StudentsList.getMySingleton();
		  List<List<student>> booksData = bookDataManager.readDataFromFile();
		  if( bookDataManager.isStudent(id,name))
		  return 1;
		  if(new lecturerList().isLecturer(id,name))
			  return 2;

		  
		return 0;
	}


	public student getstudens(int id, String name) {
		StudentsList bookDataManager = StudentsList.getMySingleton();

		
		
		return  bookDataManager.getStudent(id, name) ;
	}


	public lecturer getLectur(int id, String name) {
		// TODO Auto-generated method stub
		lecturerList l = new lecturerList();
		return l.getLecturer(id, name);
	}
	
	public model getServise() {
		model servise;
		return servise = new addGrade();
	}


	@Override
	public boolean addgrade(String subject, String faculty, int id, int grade) {
		// TODO Auto-generated method stub
		return false;
		
	}


	@Override
	public model getneeservise() {
		// TODO Auto-generated method stub
		model model = new addGrade();
		return  model;
	}


	@Override
	public String StringgPercentage(String subject, String faculty) {
		// TODO Auto-generated method stub
		return null;
		
	}



	

}
