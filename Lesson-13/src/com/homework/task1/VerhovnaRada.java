package com.homework.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class VerhovnaRada {
	 Scanner scanner;
	
	ArrayList<Fraction> fractionList = new ArrayList<>() ;
	
	public void addFraction(Fraction fraction) {
		String name = scanner.next();
		fractionList.add(new Fraction(name));	
	}
	public void addDeputyToFraction(String nameOfFraction) {
		Iterator<Fraction> iterator = fractionList.iterator();
		while(iterator.hasNext()) {
			Fraction currentFraction = iterator.next();
			if(currentFraction.getNameOfFraction().equalsIgnoreCase(nameOfFraction)) {
				currentFraction.addD(scanner);
			}		
		}
	}
	public void show(String nameOfFraction) {
			Iterator<Fraction> iterator = fractionList.iterator();
			while(iterator.hasNext()) {
				Fraction currentFraction = iterator.next();
				if(currentFraction.getNameOfFraction().equalsIgnoreCase(nameOfFraction)) {
					currentFraction.toString();
				}	
			}
		}
	public void deleteDeputyFromFraction(String nameOfFraction) {
		Iterator<Fraction> iterator = fractionList.iterator();
		while(iterator.hasNext()) {
			Fraction currentFraction = iterator.next();
			if(currentFraction.getNameOfFraction().equalsIgnoreCase(nameOfFraction)) {
				currentFraction.removeD(scanner);
			}		
		}
	}
	public void allDeputyTo(String nameOfFraction) {
		Iterator<Fraction> iterator = fractionList.iterator();
		while(iterator.hasNext()) {
			Fraction currentFraction = iterator.next();
			if(currentFraction.getNameOfFraction().equalsIgnoreCase(nameOfFraction)) {
				currentFraction.addD(scanner);
			}	
		}
	}
	public void removeFraction(Scanner scanner) {
		System.out.println("enter fraciton");
		String name = scanner.next();
		Iterator<Fraction> iterator = fractionList.iterator();
		while(iterator.hasNext()) {
			Fraction fractionList = iterator.next();
			if(fractionList.getNameOfFraction().equalsIgnoreCase(name)) {
				iterator.remove();
				}
			}
		}
	public void showAllDeputy(Scanner scanner) {
		System.out.println("enter fraciton");
		String nameOfFraction = scanner.next();
		Iterator<Fraction> iterator = fractionList.iterator();
		while(iterator.hasNext()) {
			Fraction currentFraction = iterator.next();
			if(currentFraction.getNameOfFraction().equalsIgnoreCase(nameOfFraction)) {
				currentFraction.showAllDeputy();
			}
		}
	}
	public void showAllBribes(Scanner scanner) {
		System.out.println("enter fraciton");
		String nameOfFraction = scanner.next();
		Iterator<Fraction> iterator = fractionList.iterator();
		while(iterator.hasNext()) {
			Fraction frac = iterator.next();
			if(frac.getNameOfFraction().equalsIgnoreCase(nameOfFraction)) {
				frac.allBribeDB();
			}
		}
	}

	@Override
	public String toString() {
		return "VerhovnaRada [scanner=" + scanner + ", fractionList=" + fractionList + "]";
	}
	
	
	
}

