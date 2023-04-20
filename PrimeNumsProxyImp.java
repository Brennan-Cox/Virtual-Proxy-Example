package itec220.presentation;

import java.util.ArrayList;

/**
 * Proxy
 * @author Brennan
 *
 */
public class PrimeNumsProxyImp implements PrimeNums {

	private ArrayList<Integer> list;
	private boolean stored = false;
	
	@Override
	public ArrayList<Integer> getPrimeNums(int many) {
		if (list == null) {
			
			System.out.println("Fetching primes given input");
			System.out.println("Processing........");
			list = new PrimeNumsImpl().getPrimeNums(many);
			System.out.println("Done...");
			stored = true;
		}
		return list;
	}
	
	public boolean isStored() {
		return stored;
	}
}
