/**
 * 
 */
package uni.softcomputing.impl.basicalgs;

import uni.softcomputing.basicobjects.Node;

/**
 * @author Reihane Zekri
 *
 */
public class DepthFirstSearch {
	/* use DFS to find a path from a to b
	 * @param a the starting node
	 * @param b the ending node
	 * @param c the current node
	 * @return a string with the list of nodes to b
	 */
	 public String DFS(Node a, Node b, Node c) {
		 if(c == b) {
			 return this.toString(); // assume toString can uniquely identify this node somehow
		 } // end if c == b
		 for(int i = 0; i < c.getLinks().size(); i++) {
			 String out = DFS(a,b,c.getLinks().get(i).getEndNode());
			 if(out.length() > 0) 
				 return out + this.toString();
		 } // end for i
		 
		 return "";
	 }
}
