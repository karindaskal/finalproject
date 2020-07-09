import java.io.IOException;

import controler.controler;
import controler.controlerlog;

import model.model;
import model.StudentsList;
import view.viewlogin;
import model.login;
import view.view;

public class main {
	public static void main(String[] args) throws IOException {
		
		
	    model model = new login();
		view view = new viewlogin(System.in, System.out);
		controler controller = new controlerlog(model, view);
		
		view.setController(controller);
		//view.start();
		view.run();
	   
	}


}
