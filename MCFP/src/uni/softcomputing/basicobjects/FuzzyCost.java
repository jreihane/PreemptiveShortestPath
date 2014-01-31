package uni.softcomputing.basicobjects;

import java.util.List;

public class FuzzyCost {//implements Comparable<FuzzyCost>

	List<Double> priorities = null;
	double[] costVector = null;
	
	double[] membership = null;

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
	public double[] getCostVector() {
		return costVector;
	}

	/**
	 * @param costVector the costVector to set
	 */
	public void setCostVector(double[] costVector) {
		this.costVector = costVector;
	}
	
}
