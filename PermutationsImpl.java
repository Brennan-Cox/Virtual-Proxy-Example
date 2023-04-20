package itec220.presentation;

import java.util.ArrayList;

/**
 * Implementation of the subject which is possibly expensive
 * This is the "Real" subject
 * @author Brennan
 *
 * This will do the actual, expensive work
 */
public class PermutationsImpl implements Permutations {

	/**
	 * replaced
	 */
	@Override
	public ArrayList<String> getPermutations(int value) {
		return getPermutationsList(value);
	}
	
	/**
	 * actual work is done
	 * @param value
	 * @return
	 */
	public ArrayList<String> getPermutationsList(int value) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < value; i++) {
			list.add(Integer.toBinaryString(i ^ value));
		}
		return list;
	}

	/**
	 * always false because the real subject should not be implemented in selector
	 */
	@Override
	public boolean isStored() {
		System.err.println("Warning this should not be used in Selector");
		return false;
	}
}
