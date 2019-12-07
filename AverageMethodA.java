package cs5800_lab4;

import java.util.ArrayList;

public class AverageMethodA implements AverageAlgorithm {
	public double compute(ArrayList<Double> assignmentList, ArrayList<Double> examList) {
		double assignmentAverage = 0;
		double examAverage = 0;
		for (double as : assignmentList) {
			assignmentAverage += as;
		}
		for (double es : examList) {
			examAverage += es;
		}
		assignmentAverage /= assignmentList.size();
		examAverage /= examList.size();
		
		return assignmentAverage * 0.4 + examAverage * 0.6;
	}
}
