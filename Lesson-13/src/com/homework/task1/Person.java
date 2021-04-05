package com.homework.task1;

public class Person {

		protected int weight;
		protected int heigh;
		
		public Person(int weight, int heigh) {
			super();
			this.weight = weight;
			this.heigh = heigh;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public int getHeigh() {
			return heigh;
		}
		public void setHeigh(int heigh) {
			this.heigh = heigh;
		}
		
		@Override
		public String toString() {
			return "Person [weight=" + weight + ", heigh=" + heigh + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + heigh;
			result = prime * result + weight;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Person other = (Person) obj;
			if (heigh != other.heigh)
				return false;
			if (weight != other.weight)
				return false;
			return true;
		}
		
		
		
		
		
		
		
}
