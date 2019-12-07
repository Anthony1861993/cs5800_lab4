package cs5800_lab4;

import java.util.ArrayList;
import java.util.Iterator; 

public class Student {
	
	private String name;
	private AverageAlgorithm averageAlgorithm;
	private ArrayList<Double> assignmentList; 
	private ArrayList<Double> examList; 
	private double classAverage;
	private ArrayList<Observer> observerList; 
	
	public Student(String name, AverageAlgorithm averageAlgorithm) {
		this.name = name;
		this.averageAlgorithm = averageAlgorithm;
		assignmentList = new ArrayList<Double>();
		examList = new ArrayList<Double>();
		observerList = new ArrayList<Observer>();
	}
	
	public double getAverage() {
		return classAverage;
	}
	
	public String getName() {
		return name;
	}
	
	public void addObserver(Observer o) {
		observerList.add(o);
		o.update(classAverage);
	}
	
	public void removeObserver(Observer o) {
		observerList.remove(observerList.indexOf(o));
	}
	
	public void notifyObservers() {
		for (Iterator<Observer> it = observerList.iterator(); it.hasNext(); ) {
			Observer o = it.next();
			o.update(classAverage);
		}
	}
	
	public void addAssignmentScore(double as) {
		assignmentList.add(as);
		computeAverage();
		notifyObservers();
	}
	
	public void addExamScore(double es) {
		examList.add(es);
		computeAverage();
		notifyObservers();
	}
	
	public void setAverageAlgorithm(AverageAlgorithm averageAlgorithm) {
		this.averageAlgorithm = averageAlgorithm;
	}
	
	public void computeAverage() {
		classAverage = averageAlgorithm.compute(assignmentList, examList);
		System.out.println(name + "'s Class average: " + classAverage); 
	}
}
