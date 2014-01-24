/**
 * 
 */
package uni.softcomputing.basicobjects;

/**
 * @author Reihane Zekri
 *
 */
public class Util {

	public static double[] sumTwoArrays(double[] d1, double[] d2){
		double[] result = new double[d1.length];
		for(int i = 0; i < d1.length; i++){
			result[i] = d1[i] + d2[i];
		}
		
		return result;
	}
}
