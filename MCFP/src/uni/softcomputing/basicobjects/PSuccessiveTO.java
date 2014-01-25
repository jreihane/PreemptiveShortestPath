/**
 * 
 */
package uni.softcomputing.basicobjects;

import java.util.List;

/**
 * @author Reihane Zekri
 *
 */
public class PSuccessiveTO {

	private List<Double> objectiveValue = null;
	private double optimalFlow = 0.0;
	
	/**
	 * @return the objectiveValue
	 */
	public List<Double> getObjectiveValue() {
		return objectiveValue;
	}
	/**
	 * @param objectiveValue the objectiveValue to set
	 */
	public void setObjectiveValue(List<Double> objectiveValue) {
		this.objectiveValue = objectiveValue;
	}
	/**
	 * @return the optimalFlow
	 */
	public double getOptimalFlow() {
		return optimalFlow;
	}
	/**
	 * @param optimalFlow the optimalFlow to set
	 */
	public void setOptimalFlow(double optimalFlow) {
		this.optimalFlow = optimalFlow;
	}
	
	
}
