package controler;

import model.lecturer;
import model.model;
import model.student;
import view.view;

public class controlerAddGrade implements controler {
	private model model;
	private view view;
	public controlerAddGrade(model model, view view){
		this.view = view;
		this.model = model;
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
	public controler getnewcontroler(view view) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean addGrade(String subject, String faculty, int id, int grade) {
		// TODO Auto-generated method stub
		
		return model.addgrade(subject, faculty, id, grade);
		
	}
	@Override
	public String getP(String subject, String faculty) {
		// TODO Auto-generated method stub
		return model.StringgPercentage(subject, faculty);
	}

}
