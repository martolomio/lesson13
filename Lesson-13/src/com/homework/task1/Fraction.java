package com.homework.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Fraction  {
	    Scanner scaner = new Scanner (System.in);
	
	    private String nameOfFraction;

		ArrayList<Deputy> deputyList = new ArrayList<>();
		
  
		public Fraction(String nameOfFraction) {
			super();
			this.nameOfFraction = nameOfFraction;
		}

		public String getNameOfFraction() {
			return nameOfFraction;
		}

		public void setNameOfFraction(String nameOfFraction) {
			this.nameOfFraction = nameOfFraction;
		}

		//good
		public void addD(Scanner scanner) {
			 
			 System.out.println("Додати weight");
			 int weight = scanner.nextInt();
			 
			 System.out.println("Додати height");
			 int height = scanner.nextInt();
			 
			 System.out.println("Додати прізвище");
			 String suname = scanner.next();
			 
			 System.out.println("Додати name");
			 String name = scanner.next();
			 
			 System.out.println("Додати age");
			 int age = scanner.nextInt();
			 
			 System.out.println("Додати isbriber");
			 boolean isbriber = scanner.nextBoolean();
			 
			 deputyList.add(new Deputy( weight, height, suname, name, age, isbriber));	
		}

		public void removeD(Scanner scanner) {
			System.out.println("Remove deputy");
			String name = scanner.next();
			Iterator<Deputy> iterator = deputyList.iterator();
			while(iterator.hasNext()) {
				Deputy deputy = iterator.next();
				if(deputy.getName().equalsIgnoreCase(name)) {
					iterator.remove();
				}
			}

		}
		public void allBribeD() {
			Iterator<Deputy> iterator = deputyList.iterator();
			while(iterator.hasNext()) {
				Deputy briber = iterator.next();
				if(briber.isBribe()==true) {
					briber.giveBribe(scaner);
				}
			}
		}
		public void allBribeDB() {
			Iterator<Deputy> iterator = deputyList.iterator();
			while(iterator.hasNext()) {
				Deputy briber = iterator.next();
				if(briber.isBribe()==true) {
					briber.toString();
				}
			}
		}

		public void bigestBribe() {
			deputyList.toString();
			}
		
		public void showAllDeputy() {
			deputyList.toString();
			}

		public void clearFraction() {
			deputyList.clear();
			}

		@Override
		public String toString() {
			return "Fraction [nameOfFraction=" + nameOfFraction + ", deputyList=" + deputyList + "]";
		}


		
		
		
	
	
	
	
	

}
