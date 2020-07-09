package model;
import java.io.Serializable;
import java.util.List;
public class student extends user implements Serializable {
    List<subject> subjects;
    private static final long serialVersionUID = 1L;
    public student(String name, int id, List<subject>subjects1) {
        super(name, id);
        subjects=subjects1;
    }

    public List<subject> getSubjects() {
        return subjects;
    }    
    public subject getSubject(String s) {
    	for(int i=0;i<subjects.size();i++) {
    		if(subjects.get(i).getName().equals(s)) {
    			  return subjects.get(i) ;    			
    		}   		
    	}
    	 return null;      
    }

    public void setSubjects(department subjects) {
        this.subjects = subjects.subjects1;
    }
    public double getAverage(){
        int i;
        double ave=0,sumCred=0;

        for(i=0;i<subjects.size();i++){
            if(subjects.get(i).getGrade()!=-1) {
                ave = (sumCred * ave + subjects.get(i).getGrade() * subjects.get(i).getCredits()) / (sumCred + subjects.get(i).getCredits());
                sumCred = sumCred + subjects.get(i).getCredits();
            }
        }
        return ave;
    }
    public  void printgrade (){
       for(int i=0;i< subjects.size();i++){
         if(subjects.get(i).getGrade()!=-1){
               System.out.println(subjects.get(i));
          }
       }
    }
    public String toString() {        
        return "student{" +       
                "subjects=" + subjects +
                '}';
    }  
    
}
