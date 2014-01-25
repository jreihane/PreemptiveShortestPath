/**
 * 
 */
package uni.softcomputing.impl.basicalgs;

import java.util.ArrayList;
import java.util.List;

import uni.softcomputing.basicobjects.Edge;
import uni.softcomputing.basicobjects.FuzzyCost;
import uni.softcomputing.basicobjects.Node;
import uni.softcomputing.basicobjects.PSuccessiveTO;

/**
 * @author Reihane Zekri
 *
 */
public class PSuccessiveSPAlg {

	private List<Node> N = null;
	
	public PSuccessiveTO pSuccessiveShortestPath(double[][] A, double[] c, double[] u, double[] b){
		PSuccessiveTO result = null;
		
		// 1- set p = 0, e = b, r = u, test = 0
		double p = 0.0;
		double[] e = b;
		double[] r = u;
		double test = 0;
		
		// for each i in N if ei 
		double[] cpk = new double[c.length];
		
		List<Node> E = new ArrayList<Node>();
		List<Node> D = new ArrayList<Node>();
		for(int i = 0; i < N.size(); i++){
			double ei = N.get(i).getE();
			if(ei < 0)
				D.add(N.get(i));
			if(ei > 0)
				E.add(N.get(i));
		}
		
		for(int i = 0; i < c.length; i++){
			cpk[i] = c[i];
		}
		
		int index = 0;
		while(E.size() > 0 && D.size() >= test){
			Node s = E.get(index);
			Node t = D.get(index);
			
		}
		
		return result;
	}

	/**
	 * @return the n
	 */
	public List<Node> getN() {
		return N;
	}

	/**
	 * @param n the n to set
	 */
	public void setN(List<Node> n) {
		N = n;
	}
}
