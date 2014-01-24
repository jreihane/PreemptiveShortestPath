package uni.softcomputing.basicobjects;

import java.util.Arrays;
import java.util.List;

//import org.apache.commons.lang.builder.HashCodeBuilder;

public class Node {

	String label = "";
	List<Edge> links = null;
	FuzzyCost[] minDistance = null;
	Node previousNode = null;
	double[] dj = null;

	public Node getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}


	public List<Edge> getLinks() {
		return links;
	}

	public void setLinks(List<Edge> links) {
		this.links = links;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the minDistance
	 */
	public FuzzyCost[] getMinDistance() {
		return minDistance;
	}

	/**
	 * @param minDistance the minDistance to set
	 */
	public void setMinDistance(FuzzyCost[] minDistance) {
		this.minDistance = minDistance;
	}

	/**
	 * @return the dj
	 */
	public double[] getDj() {
		return dj;
	}

	/**
	 * @param dj the dj to set
	 */
	public void setDj(double[] dj) {
		this.dj = dj;
	}
	
}
