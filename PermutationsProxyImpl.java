package itec220.presentation;

import java.util.ArrayList;

/**
 * Implementation of the subject which will utilize the "real" subject when needed
 * Proxy
 * @author Brennan
 *
 * 
 */
public class PermutationsProxyImpl implements Permutations {
	
	private ArrayList<String> list;//begin as null
	private boolean isStored = false;//some flag to tell Selector what dialogue to output

	@Override
	public ArrayList<String> getPermutations(int value) {
		
		if (list == null) {//if isn't there then fetch
			
			//diag
			System.out.println("Fetching permutations given input");
			System.out.println("Processing........");
			
			//"real" subject delegation
			list = new PermutationsImpl().getPermutations(value);
			
			//diag
			System.out.println("Done...");
			
			isStored = true;
		}
		
		return list;
	}

	/**
	 * selector uses this and will tell if the list has been calculated before
	 */
	@Override
	public boolean isStored() {
		return isStored;
	}
}