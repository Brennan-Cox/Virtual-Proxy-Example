package itec220.presentation;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A simple selector meant to introduce interactivity with the NumberMachine class
 * 
 * Has a flag to end processes and a machines
 * @author Brennan
 *
 */
public class Selector {

	NumberMachine machine;
	boolean flag;
	
	public Selector(NumberMachine machine) {
		
		this.machine = machine;
		this.flag = false;
	}
	
	public void runSelection(String arg) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		switch (arg) {
		
		case "help":
			
			System.out.println("give prime\ngive permutation\ngive name\ngive serial\ngive location\nclose\nreset");
			
			break;
			
		case "give prime":

			int limit;
			int want;
			
			if (!machine.getPrimeNums().isStored()) {
				
				System.out.println("Specify limit and desired prime\nNote: limit can only be applied once........");
				limit = input.nextInt();
				want = input.nextInt();
				
				if (limit < want) {
					
					input.close();
					throw new IllegalArgumentException("\nwhy would you ask for something not within limit?\n");
				}
			} else {
				System.out.println("Specify desired number within previous limit......");
				limit = Integer.MAX_VALUE;
				want = input.nextInt();
			}

			ArrayList<Integer> primes = machine.getPrimeNums().getPrimeNums(limit);
			
			System.out.printf("Prime num is: %d\n", primes.get(want - 1));
			
			break;
			
		case "give permutation":
			
			int value;
			if (!machine.getPermutations().isStored()) {
				System.out.println("Specify the value to permutate..........");
				System.out.println("Note: You must reset after setting the desired permutation....");
				value = input.nextInt();
			} else {
				value = 0; //arbitrary number choice
			}
			
			ArrayList<String> permutations = machine.getPermutations().getPermutations(value);
			
			permutations.forEach(n -> System.out.println(n));
			
			break;
			
		case "give name":
			
			System.out.println(machine.getMachineName());
			
			break;
			
		case "give serial":
			
			System.out.println(machine.getMachineSerialNum());
			
			break;
			
		case "give location":
			
			System.out.println(machine.getMachineLocation());
			
			break;
			
		case "close":
			
			flag = true;
			System.out.println("Closing...........");
			
			break;
			
		case "reset":
			
			System.out.println("Resetting...");
			machine.reset();
			System.out.println("Done...");
			break;
			
		default:
			
			System.err.println("Invalid selection!");
			break;
		}
	}
	
	public boolean noFlag() {
		return !flag;
	}
}
