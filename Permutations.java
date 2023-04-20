package itec220.presentation;

import java.util.ArrayList;

/**
 * Interface for Proxy
 * this is the subject
 * 
 * @author Brennan & Elijah
 * 
 * This will be the type of the Proxy which you will implement
 */
public interface Permutations {
	
	/**
	 * Method which must be replaced
	 * @param value
	 * @return
	 */
	public ArrayList<String> getPermutations(int value);
	
	/**
	 * this is going to help the selector understand what information to convey to user
	 * @return
	 */
	public boolean isStored();
}