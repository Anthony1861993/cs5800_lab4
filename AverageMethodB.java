package cs5800_lab4;

import java.util.ArrayList;
import java.util.Collections;

public class AverageMethodB implements AverageAlgorithm {
	public double compute(ArrayList<Double> assignmentList, ArrayList<Double> examList) {
		double assignmentAverage = 0;
		double examAverage = 0;
		Collections.sort(assignmentList);
		for (double as : assignmentList) {
			assignmentAverage += as;
		}
		for (double es : examList) {
			examAverage += es;
		}
		
		if (assignmentList.size() > 1)
			assignmentAverage =  (assignmentAverage - assignmentList.get(0)) / (assignmentList.size()-1);
		examAverage /= examList.size();
		
		return assignmentAverage * 0.4 + examAverage * 0.6;
	}
}
