package itec220.presentation;

import java.util.ArrayList;

/**
 * Subject
 * @author Brennan & Elijah
 *
 */
public interface PrimeNums {

	public static final boolean stored = false;
	
	public ArrayList<Integer> getPrimeNums(int many);
	
	public boolean isStored();
}