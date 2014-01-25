package uni.softcomputing.impl.basicalgs;

import java.util.List;

import uni.softcomputing.basicobjects.Edge;
import uni.softcomputing.basicobjects.FuzzyCost;
import uni.softcomputing.basicobjects.Node;

// Objective Function
public class MCFPModel {

	public NodeType nodeType(Node node){
		NodeType result = null;
		
		return result;
	}
	
	public static int compareFuzzyCostVectors(FuzzyCost f1, FuzzyCost f2){
		if(f1 != null && f2 == null)
			return 1;
		if(f1 == null && f2 != null)
			return -1;
		if(f1 == null && f2 == null)
			return 0;
		
		double[] f1CostVector = f1.getCostVector();
		double[] f2CostVector = f2.getCostVector();
		
		if(f1CostVector.length > f2CostVector.length)
			return 1;
		if(f2CostVector.length > f1CostVector.length)
			return -1;
		
		for(int i = 0; i < f1CostVector.length; i++){
			if(f1CostVector[i] > f2CostVector[i])
				return 1;
			if(f2CostVector[i] > f1CostVector[i])
				return -1;
		}
		
		return 0;
	}
	
	public static int compareLexicographic(double[] d1, double[] d2){
		if(d1 != null && d2 == null)
			return 1;
		if(d1 == null && d2 != null)
			return -1;
		if(d1 == null && d2 == null)
			return 0;
		if(d1.length > d2.length)
			return 1;
		if(d1.length < d2.length)
			return -1;
		
		for(int i = 0; i < d1.length; i++){
			double d1C = d1[i];
			double d2C = d2[i];
			
			if(d1C > d2C)
				return 1;
			if(d1C < d2C)
				return -1;
		}
		
		return 0;
	}
	
//	public static int compareFuzzyCosts(FuzzyCost f1, FuzzyCost f2){
//		int result = 0;
//		
//		if(f1.getPriority() > f2.getPriority())
//			return 1;
//		if(f1.getPriority() > f2.getPriority())
//			return -1;
//		
//		if(f1.getMostPossible() > f2.getMostPossible())
//			return 1;
//		if(f1.getMostPossible() < f2.getMostPossible())
//			return -1;
//		
//		return result;
//	}
}
