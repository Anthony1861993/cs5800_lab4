package cs5800_lab4;

import java.util.ArrayList;

public class Roster implements AvgDispenser{
	private String name;
	private String number;
	private ArrayList<Student> studentList;
	
	public Roster(String name, String number) {
		this.name = name;
		this.number = number;
		studentList = new ArrayList<Student>();
	}
	
	public String getCourseName() {
		return name + number;
	}
	
	public void addStudent(Student student) {
		studentList.add(student);
	}
	
	public void getAverages() {
		System.out.println("AVERAGES OF STUDENTS IN CLASS " + getCourseName() + ":");
		for (int i = 0; i < studentList.size(); i++) {
			System.out.println("Average of " + studentList.get(i).getName() + ": " + studentList.get(i).getAverage());
		}
	}
}
