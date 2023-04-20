package itec220.presentation;

/**
 * Simple number machine which is meant as an example for a Virtual Proxy
 * @author Brennan
 *
 */
public class NumberMachine {
	
	private String machineName;
	private String machineLocation;
	private String machineSerialNum;
	private PrimeNums primeNums;
	private Permutations permutations;
	
	/**
	 * 
	 * @param machineName
	 * @param machineLocation
	 * @param machineSerialNum
	 * @param primeNums
	 * @param permutations
	 */
	public NumberMachine(String machineName, String machineLocation, String machineSerialNum, PrimeNums primeNums,
			Permutations permutations) {
		super();
		this.machineName = machineName;
		this.machineLocation = machineLocation;
		this.machineSerialNum = machineSerialNum;
		this.primeNums = primeNums;
		this.permutations = permutations;
	}

	public String getMachineName() {
		return machineName;
	}

	public String getMachineLocation() {
		return machineLocation;
	}

	public String getMachineSerialNum() {
		return machineSerialNum;
	}

	public PrimeNums getPrimeNums() {
		return primeNums;
	}

	public Permutations getPermutations() {
		return permutations;
	}
	
	/**
	 * reset the enacted proxies to unused proxies
	 */
	public void reset() {
		primeNums = new PrimeNumsProxyImp();
		permutations = new PermutationsProxyImpl();
	}
}
