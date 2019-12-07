package cs5800_lab4;

public class GradeTracker implements Observer { 
    private char letterGrade; 
  
    public void update(double classAverage) {   
    	if (classAverage >= 90)
    		letterGrade = 'A';
    	else if (classAverage >= 80)
    		letterGrade = 'B';
    	else if (classAverage >= 70)
    		letterGrade = 'C';
    	else if (classAverage >= 60)
    		letterGrade = 'D';
    	else letterGrade = 'F';
    	
    	display();
    }
  
    public void display() {
    	System.out.println("Current letter grade of student: " + letterGrade);
    }

}
