package controler;
import model.student;
import model.lecturer;
import view.view;

public interface controler {
	//
	public int login(int id,String name); //1 - student, 2-lecturer, 0 - none of them
	public student getstudens (int id,String name); // return student
	 public lecturer getLectur (int id,String name); // return lecturer
	 public controler getnewcontroler (view view ); // return controller to specific view
	 public boolean addGrade (String subject, String faculty,int id, int grade); // add new grade to specific student
	 public String getP (String subject, String faculty); // return statistics data

}
