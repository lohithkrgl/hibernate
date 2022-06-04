package com.xworkz.dogapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="properties")
	@Entity
	public class Dog {
		
		@Column(name="dogId")
		@Id
		private int dogId;
		@Column(name="dogName")
		private String dogName;
		@Column(name="breed")
		private String breed;
		@Column(name="color")
		private String color;
		@Column(name="weight")
		private double weight;
		
		public Dog(){
			
		}
		
		public Dog(int dogId, String dogName, String breed, String color, double weight) {
			super();
			this.dogId = dogId;
			this.dogName = dogName;
			this.breed = breed;
			this.color = color;
			this.weight = weight;
		}

		public int getDogId() {
			return dogId;
		}

		public void setDogId(int dogId) {
			this.dogId = dogId;
		}

		public String getDogName() {
			return dogName;
		}

		public void setDogName(String dogName) {
			this.dogName = dogName;
		}

		public String getBreed() {
			return breed;
		}

		public void setBreed(String breed) {
			this.breed = breed;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}

		@Override
		public String toString() {
			return "Dog [dogId=" + dogId + ", dogName=" + dogName + ", breed=" + breed + ", color=" + color + ", weight="
					+ weight + "]";
		}
		
		
		

	}



