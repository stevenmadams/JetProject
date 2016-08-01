package fleetofjets;

import java.util.Scanner;

public class fleetMenu {

	public static Scanner airmanSnuffy = new Scanner(System.in);

	public static void main(String[] args) {
		// Jet[] listOfJets;
		// Jet[] listOfJets; ^ moved it up so the methods could see it
		Jet airplane = new Jet("C-17", 515, 2420, 218000000);
		Jet airplane2 = new Jet("F-22", 1500, 1840, 150000000);
		Jet airplane3 = new Jet("A-10", 518, 2580, 18800000);
		Jet airplane4 = new Jet("C-130", 366, 2360, 30100000);
		Jet airplane5 = new Jet("C-5", 571, 2760, 100370000);
		
		Jet listOfJets[] = { airplane, airplane2, airplane3, airplane4, airplane5 };

		int option;
		while (true) {
			System.out.println("AIRCRAFT INVENTORY MENU");
			System.out.println("***Select an option:***");
			System.out.println("1. List of aircraft");
			System.out.println("2. Top speed aircraft");
			System.out.println("3. Longest range aircraft");
			System.out.println("4. Add additional aircraft");
			System.out.println("5. QUIT");
			System.out.println("-----------------------");
			option = airmanSnuffy.nextInt();
			if (option == 1) {
				System.out.println("***CURRENT INVENTORY:***");
				for (int i = 0; i < listOfJets.length; i++) {
					System.out.println(listOfJets[i]);
				}
				System.out.println();
				// for (int i = 0; i < listOfJets.length; i++) {
				// System.out.println(listOfJets[i]);
			}
			if (option == 2) {
				System.out.println("Aircraft with the fastest speed:");
				System.out.println(findFastest(listOfJets)+ "\n");

			}
			if (option == 3) {
				
				System.out.println("Aircraft with the longest range:");
				System.out.println(findMostRange(listOfJets)+ "\n");
			}

			if (option == 4) {
				listOfJets = addNewJet(listOfJets);

			}

			if (option == 5) {
				System.out.println("***EXITED INVENTORY***");
				System.exit(option);
			}
		}
	}

	public static Jet[] addNewJet(Jet[] listOfJets) {
		Jet templistOfJets[] = new Jet[listOfJets.length + 1];
		for (int i = 0; i < listOfJets.length; i++) {
			templistOfJets[i] = listOfJets[i];
		}
		System.out.println("What is the model name?");
		String addModel = airmanSnuffy.next();
		System.out.println("What is the speed (MPH)?");
		Float addSpeed = airmanSnuffy.nextFloat();
		System.out.println("What is the range (miles)?");
		Float addRange = airmanSnuffy.nextFloat();
		System.out.println("What is the price?");
		Float addPrice = airmanSnuffy.nextFloat();

		Jet newAirplane = new Jet(addModel, addSpeed, addRange, addPrice);
		templistOfJets[(listOfJets.length)] = newAirplane;
		System.out.println("\nNew aircraft ADDED");
		System.out.println(newAirplane + "\n");

		return templistOfJets;
	}

	public static Jet findFastest(Jet[] listOfJets) {
		Jet findFastest = listOfJets[0];
		double findSpeed = 0;
		for (int i = 0; i < listOfJets.length; i++) {
			if (listOfJets[i].getSpeedMPH() > findSpeed) {
				findSpeed = listOfJets[i].getSpeedMPH();
				findFastest = listOfJets[i];
			}
		}
		return findFastest;
	}
	public static Jet findMostRange(Jet[] listOfJets) {
		Jet findMostRange = listOfJets[0];
		double findSpeed = 0;
		for (int i = 0; i < listOfJets.length; i++) {
			if (listOfJets[i].getSpeedMPH() > findSpeed) {
				findSpeed = listOfJets[i].getSpeedMPH();
				findMostRange = listOfJets[i];
			}
		}
		return findMostRange;
	}

	

}
