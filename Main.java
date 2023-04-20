package itec220.presentation;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * Lets make a class which could be expensive
		 */
		NumberMachine machine = new NumberMachine("Smarty",
				"DownTown", "54354815", new PrimeNumsProxyImp(), new PermutationsProxyImpl());
		
		Selector selector = new Selector(machine);
		Scanner input = new Scanner(System.in);
		
		while (selector.noFlag()) {
			
			selector.runSelection(input.nextLine().trim());
		}
		input.close();
	}
}
