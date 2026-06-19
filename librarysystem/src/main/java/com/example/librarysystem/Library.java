package com.example.librarysystem;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Library {

		@Id
		private int id;
		private String title;
		private String category;
		private double price;
		private int availableCopies;
		
		public Library() {
			
		}
		public Library(int id,String title,String category,double price,int availableCopies) {
			this.id=id;
			this.title=title;
			this.category=category;
			this.price=price;
			this.availableCopies=availableCopies;
		}
		public void setId(int id) {
			this.id=id;
		}
		public int getId() {
			return id;
		}
		public void setTitle(String title) {
			this.title=title;
		}
		public String getTitle() {
			return title;
		}
		public void setCategory(String category) {
			this.category=category;
		}
		public String getCategoryt() {
			return category;
		}
		public void setPrice(int price) {
			this.price=price;
		}
		public double getPrice() {
			return price;
		}
		public void setJAvailableCopies(int availableCopies) {
			this.availableCopies=availableCopies;
		}
		public int getAvaiableCopies() {
			return availableCopies;
		}

		@Override
		public String toString() {

		    return "Employee [id=" + id +
		           ", name=" + title +
		           ", dept=" + category +
		           ", sal=" + price +
		           ", jdate=" + availableCopies + "]";

		}

}
