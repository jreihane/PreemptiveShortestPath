package uni.softcomputing.basicobjects;

import java.util.Arrays;
import java.util.List;

//import org.apache.commons.lang.builder.HashCodeBuilder;

public class Node {

	String label = "";
	List<Edge> links = null;
//	FuzzyCost[] minDistance = null;
	Node previousNode = null;
	double[] dj = null;
	double e = 0.0;
	double[] p = null;

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

//	/**
//	 * @return the minDistance
//	 */
//	public FuzzyCost[] getMinDistance() {
//		return minDistance;
//	}
//
//	/**
//	 * @param minDistance the minDistance to set
//	 */
//	public void setMinDistance(FuzzyCost[] minDistance) {
//		this.minDistance = minDistance;
//	}

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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(dj);
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		result = prime * result + ((links == null) ? 0 : links.hashCode());
		result = prime * result
				+ ((previousNode == null) ? 0 : previousNode.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (!Arrays.equals(dj, other.dj))
			return false;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
//		if (links == null) {
//			if (other.links != null)
//				return false;
//		} else if (!links.equals(other.links))
//			return false;
//		if (previousNode == null) {
//			if (other.previousNode != null)
//				return false;
//		} else if (!previousNode.equals(other.previousNode))
//			return false;
		return true;
	}

	/**
	 * @return the e
	 */
	public double getE() {
		return e;
	}

	/**
	 * @param e the e to set
	 */
	public void setE(double e) {
		this.e = e;
	}

	/**
	 * @return the p
	 */
	public double[] getP() {
		return p;
	}

	/**
	 * @param p the p to set
	 */
	public void setP(double[] p) {
		this.p = p;
	}
	
}
