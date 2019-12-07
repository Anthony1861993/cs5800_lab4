package cs5800_lab4;

import java.io.IOException;

public class lab4 {
	
	public static void main(String[] args) throws IOException {
		
		AverageAlgorithm methodA = new AverageMethodA();
		AverageAlgorithm methodB = new AverageMethodB();
		
		Student myStudent = new Student("Vincent", methodA);
		myStudent.addAssignmentScore(90.5);
		myStudent.addAssignmentScore(70.6);
		myStudent.addAssignmentScore(60.7);
		myStudent.addExamScore(85);
		myStudent.addExamScore(86.5);
		
		myStudent.computeAverage();
		
		myStudent.setAverageAlgorithm(methodB);
		myStudent.computeAverage();
		
		myStudent.setAverageAlgorithm(methodA);
		myStudent.computeAverage();
		
		Observer myGradeTracker = new GradeTracker();
		myStudent.addObserver(myGradeTracker);
		
		myStudent.addExamScore(50);
		
		
		
		Student student2 = new Student("Paul", methodA);
		student2.addAssignmentScore(80.8);
		student2.addAssignmentScore(65.6);
		student2.addAssignmentScore(91.8);
		student2.addExamScore(70);
		student2.addExamScore(89.2);
		
		Roster roster = new Roster("CS", "5800");
		roster.addStudent(myStudent);
		roster.addStudent(student2);
		
		roster.getAverages();
	}
	
}
