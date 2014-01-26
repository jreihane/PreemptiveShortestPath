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
	
	public PSuccessiveTO pSuccessiveShortestPath(double[][] A, double[] c, List<Edge> links, double[] b){
		PSuccessiveTO result = null;
		
		// 1- set p = 0, e = b, r = u, test = 0
		double pj = 0.0;
		double[] e = b;
		double[] r = new double[links.size()];
		for(int i = 0; i < links.size(); i++)
			r[i] = links.get(i).getCapacity();
		double test = 0;
		
		// 2- for each i in N if ei < 0 add i to D and ei > 0 add i to E
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
		
		// 3- for each k = 1,...,K set c(p,k) = c(k)
		for(int i = 0; i < c.length; i++){
			cpk[i] = c[i];
		}
		
		LabelCorrectingAlg labelCorrectingAlg = new LabelCorrectingAlg(); 
		
		// 4- while E is not empty and tes <= size(D)
		int index = 0;
		while(E.size() > 0 && D.size() >= test){
			// 4-1 pick up the first elements of E and D, denotes with s and t respectively 
			Node s = E.get(index);
			Node t = D.get(index);
			
			// 4-2 define Ag as a set including links (i,j) such that r(i,j) > 0
			List<Edge> Ag = new ArrayList<Edge>();
			for(int i = 0; i < r.length; i++){
				if(r[i] > 0)
					Ag.add(links.get(i));
			}
			
			// 4-2 Apply algorithm 4.3 to find the preemptive shortest path dj
			// 	and predecessor predj for each j in N when its inputs are links set Ag,
			// 	source node s and cost vector c(p)(i,j)
			for(int i = 0; i < N.size(); i++){
				labelCorrectingAlg.labelCorrecting(Ag, E, s, cpk);
			}
			
			// 4-3 if dt is finite
			
			// 4-3-1 let p consists of links lay through path from node s to node t
			List<Edge> p = null;
			
			// 4-3-2 determine pj' = pj - dj for each j in N
			
			// 4-3-3 set thelta = min{es, -et.min{rij}}
			double thelta = 0.0;
			
			// 4-3-4 if thelta > 0
			if(thelta > 0){
				// 4-3-4-1 for each (i,j) in p
				for(int j = 0; j < p.size(); j++){
				
					// 4-3-4-1-1 set rij = rij - thelta, rji = rji + thelta
					
					// 4-3-4-1-2 set es = es - thelta, et = et + thelta
					s.setE(s.getE() - thelta);
					t.setE(t.getE() + thelta);
					
					// 4-3-4-1-3 if es = 0 remove s from E and test = 0
					if(s.getE() == 0){
						E.remove(0);
						test = 0;
					}
					
					// 4-3-4-1-4 if et = 0 remove t from D
					if(t.getE() == 0)
						D.remove(0);
					
					// 4-3-4-1-5 for each (i,j) in Ag update c(p,k)(i,j) = c(k)(i,j) - p(k)(i) + p(k)(j)
				}
			}
			
			// 4-3-5 else
			else{
				// 4-3-5-1 remove s from the head of D and add s to the tail of D
				D.remove(0);
				D.add(s);
				
				// 4-3-5-2 test = test + 1
				test++;
			}
			
		} // end of while
		
		// 5- if test > size(D)
		if(test > D.size()){
			// 5-1 print "the problem is infeasible"
			System.out.println("the problem is infeasible");
			
			// 5-2 v = [0...0]
		}
		
		// 6- else for each k = 1, ...K set vk = 0 and for each link (i,j) in A
		// 	repeat:
		
			// 6-1 x(i,j) = r(i,j)
			
			// 6-2 for k = 1,...,K repeat:
			
				// 6-2-1 vk = vk + c(k)(i,j)*x(i,j)

		
		
		// end of algorithm
		
		
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
