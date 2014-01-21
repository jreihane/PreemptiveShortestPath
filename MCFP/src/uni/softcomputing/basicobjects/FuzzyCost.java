package uni.softcomputing.basicobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FuzzyCost implements Comparable<FuzzyCost>{

	double lowerBound = 0.0;
	double upperBound = 0.0;
	double mostPossible = 0.0;
	
	Double priority = 0.0;

	
	public static List<FuzzyCost> sortByPriority(List<FuzzyCost> costs){
		List<FuzzyCost> result = costs;
		
		Collections.sort(result, Comparators.PRIORITY);
		
		return result;
	}
	
	public double getLowerBound() {
		return lowerBound;
	}

	public void setLowerBound(double lowerBound) {
		this.lowerBound = lowerBound;
	}

	public double getUpperBound() {
		return upperBound;
	}

	public void setUpperBound(double upperBound) {
		this.upperBound = upperBound;
	}

	public double getMostPossible() {
		return mostPossible;
	}

	public void setMostPossible(double mostPossible) {
		this.mostPossible = mostPossible;
	}

	public double getPriority() {
		return priority;
	}

	public void setPriority(double priority) {
		this.priority = priority;
	}

	@Override
	public int compareTo(FuzzyCost o) {
		return Comparators.PRIORITY.compare(this, o);
	}
	
	public static class Comparators {

//        public static Comparator<FuzzyCost> LOWER = new Comparator<FuzzyCost>() {
//            @Override
//            public int compare(FuzzyCost o1, FuzzyCost o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        };
//        public static Comparator<FuzzyCost> UPPER = new Comparator<FuzzyCost>() {
//            @Override
//            public int compare(FuzzyCost o1, FuzzyCost o2) {
//                return o1.age - o2.age;
//            }
//        };
        public static Comparator<FuzzyCost> PRIORITY = new Comparator<FuzzyCost>() {
            @Override
            public int compare(FuzzyCost o1, FuzzyCost o2) {
            	int result = o1.priority.compareTo(o2.priority);
            	
//            	if (i == 0) {
//                    i = o1.age - o2.age;
//                }
            	
            	return result;
            }
        };
	}
	
	@Override
	public String toString(){
		return String.valueOf(this.priority);
	}
}
