package controler;


import model.lecturer;
import model.model;
import model.student;
import view.view;


import controler.controler;

public class controlerlog implements controler {
	private model model;
	private view view;
	public controlerlog(model model, view view){
		this.view = view;
		this.model = model;
	}

	@Override
	public int login(int id, String name) {	
		
		return model.login(id, name);
	}

	@Override
	public student getstudens(int id, String name) {
		// TODO Auto-generated method stub
		return model.getstudens(id, name);
	}

	@Override
	public lecturer getLectur(int id, String name) {
		// TODO Auto-generated method stub
		return model.getLectur(id, name);
	}

	@Override
	public controler getnewcontroler(view view) {
		// TODO Auto-generated method stub
		controler controller = new controlerAddGrade(model.getneeservise(), view);
		return controller;
	}

	@Override
	public boolean addGrade(String subject, String faculty, int id, int grade) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getP(String subject, String faculty) {
		// TODO Auto-generated method stub
		return null;
	}




	

}
