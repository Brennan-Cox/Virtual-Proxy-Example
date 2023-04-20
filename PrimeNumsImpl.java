package itec220.presentation;

import java.util.ArrayList;

/**
 * Implementation of subject
 * "Real" subject
 * @author Brennan
 *
 */
public class PrimeNumsImpl implements PrimeNums {

	@Override
	public ArrayList<Integer> getPrimeNums(int many) {
		return getPrimeNumsList(many);
	}
	
	/**
	 * Generates a list of prime numbers where the desired number of primes is only given
	 * @param many
	 * @return
	 */
	public ArrayList<Integer>  getPrimeNumsList (int many) {
		
		ArrayList<Integer> primes = new ArrayList<Integer>();
		
		int num = 2;
		while (many > primes.size()) {
			
			boolean isPrime = true;
			for (int prime : primes) {
				
				if (num % prime == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				
				primes.add(num);
			}
			num++;
		}
		
		return primes;
	}

	@Override
	public boolean isStored() {
		return false;
	}
}
