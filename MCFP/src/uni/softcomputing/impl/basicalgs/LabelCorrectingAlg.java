package uni.softcomputing.impl.basicalgs;

import java.util.ArrayList;
import java.util.List;

import uni.softcomputing.basicobjects.Edge;
import uni.softcomputing.basicobjects.FuzzyCost;
import uni.softcomputing.basicobjects.Node;

public class LabelCorrectingAlg {
	/**
	 * Finds the preemptive shortest path from node s to each node of network
	 * @param links			: set of links
	 * @param costVector	: cost vector cij for each link (i,j)
	 * @param sourceNode	: source node
	 * @return dj			: preemptive shortest distance
	 * @return predj		: predecessor node 
	 */
	public void labelCorrecting(List<Edge> links, Node s){
		double[] ds = new double[links.size()];
		double[] dj = new double[links.size() - 1];
		Node predj = null;
		
		ds = initializeDoubleArray(ds, 0.0);
		dj = initializeDoubleArray(dj, Double.POSITIVE_INFINITY);
		
		List<Node> j = new ArrayList<Node>();
		List<Node> L = new ArrayList<Node>();
		// initialize list L = {s}
		L.add(s);
		
		// find node i in L such that there is no j in L satisfying dj < di (lexicographic)
		// call findBestNode
		
	}
	
	private Node findBestNode(Node source, List<Node> L){
		Node result = null;
		List<Edge> links = source.getLinks();
		FuzzyCost minCost = null; 
		for(int i = 0; i < links.size(); i++){
			Edge currentEdge = links.get(i);
			Node endOfLink =  currentEdge.getEndNode();
			
		}
		
		return result;
	}
	
	private double[] initializeDoubleArray(double[] doubleArray, double fillingValue){
		for(int i = 0; i < doubleArray.length; i++){
			doubleArray[i] = fillingValue;
		}
		
		return doubleArray;
	}
}
