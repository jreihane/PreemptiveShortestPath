/**
 * 
 */
package uni.softcomputing.basicobjects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Reihane Zekri
 * 
 */
public class Util {

	public static double[] sumTwoArrays(double[] d1, double[] d2) {
		double[] result = new double[d1.length];
		for (int i = 0; i < d1.length; i++) {
			result[i] = d1[i] + d2[i];
		}

		return result;
	}
	
	public static double[] subtractTwoArrays(double[] d1, double[] d2) {
		double[] result = new double[d1.length];
		for (int i = 0; i < d1.length; i++) {
			result[i] = d1[i] - d2[i];
		}

		return result;
	}
	
	public static double findMinOfArray(double[] d1){
		double result = 0;
		
		for(int i = 0; i < d1.length; i++){
			if(d1[i] < result)
				result = d1[i];
		}
		
		return result;
	}

	/*
	 * use DFS to find a path from a to b
	 * 
	 * @param a the starting node
	 * 
	 * @param b the ending node
	 * 
	 * @param c the current node
	 * 
	 * @return a string with the list of nodes to b
	 */
	public List<Edge> DFS(Node a, Node b, Node c, List<Edge> edges) {
		if (c == b) {
			return null; // assume toString can uniquely identify this node
							// somehow
		} // end if c == b
		for (int i = 0; i < c.getLinks().size(); i++) {
			if(edges == null)
				edges = new ArrayList<Edge>();
			
			List<Edge> dfs = DFS(a, b, c.getLinks().get(i).getEndNode(), edges); 
			if(dfs != null)
				edges.addAll(dfs);
			
			//if (out.length() > 0)
				return edges;//out + this.toString();
		} // end for i

		return null;
	}
}
