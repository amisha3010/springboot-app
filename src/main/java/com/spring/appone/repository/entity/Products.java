package com.spring.appone.repository.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
	public class Products {
		
		@Id
		int ID;
		String name;
		String brand;
		String  description;
		String  code;
		String  image;
		double  price;
		 
		
		@Override
		public String toString() {
			return "Products [ID=" + ID + ", Name=" + name + ", brand=" + brand + ", description=" + description + ", code="
					+ code + ", image=" + image + ", price=" + price + "]";
		}
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			this.ID = iD;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getCode() {
			return code;
		}
		public void setCode(String code) {
			this.code = code;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		 

}
