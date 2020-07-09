package view;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

import controler.controler;
import controler.controlerlog;
import model.lecturer;

public class viewlogin implements view, Runnable{
	private Scanner input;
    private PrintWriter output;
	controler controller;
	InputStream in;
	OutputStream out;
	 public viewlogin(InputStream in, OutputStream out) {
	        input = new Scanner(in);
	        output = new PrintWriter(out);
	        this.in=in;
	        this.out =out;
	    }
	  public void writePharse(String s) {
			this.WP(s);

		}
	  public void WP (String s) {
	  output.println(s);
	  }
	  public void writeTopNStudent(int num,String name,int id) {
		//	this.write(num,name,id);

		}
	  public void run() {
		  String name ,n;
		  int id=0;
		  int num;
		      
	        
	        while (true) {
	        	write("enter name");
	         	n= input.nextLine();
	         	name =input.nextLine();           	                 	 
	         	 write("enter id");
	        	id =input.nextInt();  
	        	
	        	num=controller.login(id,name);
	        	
	      	  if(num==1) {
	      		  write("the avreage is");
	      		  write(String.valueOf(controller.getstudens(id, name).getAverage()));
	      		 write("the subject is");
	      		// write(controller.getstudens(id, name).toString());
	      		controller.getstudens(id, name).printgrade();
	      		 
				  
			  }
			  else if(num==2) {
				  lecturer lecturer;
				  lecturer =controller.getLectur(id, name);				  
				  write(lecturer.toString());
				 
				view view = new lectuerView(in, out,lecturer);			
				view.setController(controller.getnewcontroler(view));
				//view.start();
				view.start();
				view.run();}
				  else
				write("user not found");
	   
	        	
	        }
	       
	       
	    }

	

	  public void write(String s) {
		  output.println(s);  
	
	       output.flush();
	    }
	  public String write() {
		 return input.nextLine();

	    }
	  public int writeI() {
			 return input.nextInt();

		    }


	@Override
	public void start() {
		// TODO Auto-generated method stub
		new Thread().start();
		
	}

	@Override
	public void setController(controler controller) {
		// TODO Auto-generated method stub
		this.controller = controller;
		
	}

}
