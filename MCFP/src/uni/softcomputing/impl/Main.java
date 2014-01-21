/**
 * 
 */
package uni.softcomputing.impl;

import java.util.ArrayList;
import java.util.List;

import uni.softcomputing.basicobjects.FuzzyCost;

/**
 * @author Reihane Zekri
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FuzzyCost f1 = new FuzzyCost();
		f1.setPriority(1);
		
		FuzzyCost f2 = new FuzzyCost();
		f2.setPriority(4);
		
		FuzzyCost f3 = new FuzzyCost();
		f3.setPriority(2);
		
		FuzzyCost f4 = new FuzzyCost();
		f4.setPriority(8);
		
		List<FuzzyCost> list = new ArrayList<FuzzyCost>();
		list.add(f1);
		list.add(f2);
		list.add(f3);
		list.add(f4);
		
		System.out.println(FuzzyCost.sortByPriority(list));
	}

}
