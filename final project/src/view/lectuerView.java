package view;
import java.io.InputStream;
import model.lecturer;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;



import controler.controler;

public class lectuerView implements view{
	private Scanner input;
    private PrintWriter output;
	controler controller;
	lecturer le;
	 public lectuerView(InputStream in, OutputStream out,lecturer l) {
	        input = new Scanner(in);
	        output = new PrintWriter(out);
	        le=l;
	     
	    }

@Override
public void start() {
	// TODO Auto-generated method stub
	new Thread().start();
	
}

@Override
public void run() {
	boolean state =true;
	int n;
    while (state) {
    
    	write("To enter grade press 0 \n To see statistics press 1\n To exit enter any other number");
    	n=input.nextInt();
    	if(n==0)
    		addGrade();
    	else if(n==1)
    		write(controller.getP(le.getNameSubject(), le.getFaculty()));
    	else state =false;
    	
    	
	
   }
     
	
	// TODO Auto-generated method stub
	
}

private void write(String s) {
	output.println(s);
	output.flush();
	// TODO Auto-generated method stub
	
}

@Override
public void setController(controler controller) {
	// TODO Auto-generated method stub
	this.controller = controller;
	
}
public void addGrade() {
	int grade;
	int id;
	boolean state =true;
	while(state) {
		write("if you finished enter grade press 0and another 0");
    
	 write("enter grade");
 	grade = input.nextInt();
 	 write("enter id ");
  	id =input.nextInt();   	
  	if(grade==0&&id==0)
  		state =false;
  	else {
  if(controller.addGrade(le.getNameSubject(), le.getFaculty(), id, grade)) {
 	 write("the grade  was added");
  }
  else
 	 write("the grade wasn't added");
	
}
}
}
}
