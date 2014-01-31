package uni.softcomputing.impl.basicalgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import uni.softcomputing.basicobjects.Edge;
import uni.softcomputing.basicobjects.LabelCorrectingTO;
import uni.softcomputing.basicobjects.Node;
import uni.softcomputing.basicobjects.Util;

public class LabelCorrectingAlg {
	/**
	 * Finds the preemptive shortest path from node s to each node of network
	 * @param links			: set of links
	 * @param costVector	: cost vector cij for each link (i,j)
	 * @param sourceNode	: source node
	 * @return dj			: preemptive shortest distance
	 * @return predj		: predecessor node 
	 */
	public LabelCorrectingTO labelCorrecting(List<Edge> links,List<Node> N, Node s, double[] costVector){
		LabelCorrectingTO result = new LabelCorrectingTO();
		
		double[] ds = new double[N.size()];
//		double[] dj = new double[N.size() - 1];
//		
		ds = initializeDoubleArray(ds, 0.0);
//		dj = initializeDoubleArray(dj, Double.POSITIVE_INFINITY);
		
		// dj = [inf...]
		for(int j = 0; j < N.size(); j++){
			double[] dj = new double[N.size() - 1];
			dj = initializeDoubleArray(dj, Double.POSITIVE_INFINITY);
			N.get(j).setDj(dj);
		}

		s.setPreviousNode(null);
		s.setDj(ds);
		
		List<Node> L = new ArrayList<Node>();
		// initialize list L = {s}
		L.add(s);
		
		// while L != 0
		while(L.size() > 0){
			// 1- find node i in L s.t. there is no j in L satisfying dj <(lex) di 
			// which means all links' costs should be the minimum
			Node iNode = null;
			List<Edge> sLinks = s.getLinks();
			double[] dj2 = null;
			for(int i = 0; i < sLinks.size(); i++){
				Edge currentEdge = sLinks.get(i);
				Node endOfLink = currentEdge.getEndNode();
				if(iNode == null){
					iNode = endOfLink;
				}
				else{
//					int diff = MCFPModel.compareFuzzyCosts(iNode.get, endOfLink);
					if(dj2 == null){
						dj2 = currentEdge.getFuzzyCost().getCostVector();
					}
					else{
						
						if(MCFPModel.compareLexicographic(dj2, currentEdge.getFuzzyCost().getCostVector()) == 1){
							iNode = null;
						}
					}
				}
			}
			
			// 2- pick up and remove node i from L
			L.remove(iNode);
			
			// 3- for each link (i,j) in A
			List<Edge> iLinks = iNode.getLinks();
			for(int i = 0; i < iLinks.size(); i++){
				Edge currentEdge = iLinks.get(i);
				Node endOfLink =  currentEdge.getEndNode();

				double[] cij = currentEdge.getFuzzyCost().getCostVector();
				double[] dj = endOfLink.getDj();
				double[] di = iNode.getDj();
				double[] diPlucCij = Util.sumTwoArrays(di, cij);

				// 3-1 if dj >(lex) di + cij				
				if(MCFPModel.compareLexicographic(dj, diPlucCij) == 1){
					// 3-1-1 dj = di + cij
					dj = diPlucCij;
					
					// 3-1-2 predj = i
					endOfLink.setPreviousNode(iNode);
					
					// 3-1-3 if j is not in list L, insert node j in L
					if(!L.contains(endOfLink))
						L.add(endOfLink);
					
//					LabelCorrectingTO l = new LabelCorrectingTO();
					result.setDj(dj);
					result.setPredj(iNode);
					
				}
			}
		}
		return result;
	}
	
//	private Node findBestNode(Node source, List<Node> L, List<Edge> links){
//		
//		
//		return result;
//	}
	
	private double[] initializeDoubleArray(double[] doubleArray, double fillingValue){
//		for(int i = 0; i < doubleArray.length; i++){
//			doubleArray[i] = fillingValue;
//		}
		Arrays.fill(doubleArray, fillingValue);
		return doubleArray;
	}
}
