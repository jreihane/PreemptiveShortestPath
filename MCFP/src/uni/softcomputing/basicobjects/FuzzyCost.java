package uni.softcomputing.basicobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FuzzyCost {//implements Comparable<FuzzyCost>

	List<Double> priorities = null;
	List<Double> costVector = null;

	/**
	 * @return the priorities
	 */
	public List<Double> getPriorities() {
		return priorities;
	}

	/**
	 * @param priorities the priorities to set
	 */
	public void setPriorities(List<Double> priorities) {
		this.priorities = priorities;
	}

	/**
	 * @return the costVector
	 */
	public List<Double> getCostVector() {
		return costVector;
	}

	/**
	 * @param costVector the costVector to set
	 */
	public void setCostVector(List<Double> costVector) {
		this.costVector = costVector;
	}
	
}
