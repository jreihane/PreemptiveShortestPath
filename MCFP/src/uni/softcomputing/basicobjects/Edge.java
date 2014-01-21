package uni.softcomputing.basicobjects;

import java.util.List;

public class Edge {
	
	public Edge(Node beginNode, Node endNode, double lowerCapacity,
			double upperCapacity, List<FuzzyCost> fuzzyCost) {
		super();
//		this.beginNode = beginNode;
		this.endNode = endNode;
		this.lowerCapacity = lowerCapacity;
		this.upperCapacity = upperCapacity;
		this.fuzzyCost = fuzzyCost;
	}

//	Node beginNode = null;
	Node endNode = null;
	
	// lower capacity
	double lowerCapacity = 0.0;
	
	// upper capacity
	double upperCapacity = 0.0;
	
	// real value
	double capacity = 0.0;
	
	// the priority of k_th element is more than k+1_th element
	List<FuzzyCost> fuzzyCost = null;

	public Node getEndNode() {
		return endNode;
	}

	public void setEndNode(Node endNode) {
		this.endNode = endNode;
	}

	public double getLowerCapacity() {
		return lowerCapacity;
	}

	public void setLowerCapacity(double lowerCapacity) {
		this.lowerCapacity = lowerCapacity;
	}

	public double getUpperCapacity() {
		return upperCapacity;
	}

	public void setUpperCapacity(double upperCapacity) {
		this.upperCapacity = upperCapacity;
	}

	public List<FuzzyCost> getFuzzyCost() {
		return fuzzyCost;
	}

	public void setFuzzyCost(List<FuzzyCost> fuzzyCost) {
		this.fuzzyCost = fuzzyCost;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		
		if(capacity < this.lowerCapacity)
			this.capacity = this.lowerCapacity;
		
		else if(capacity > this.upperCapacity)
			this.capacity = this.upperCapacity;
		
		else
			this.capacity = capacity;
	}
	
	
}
