package com.example.foodordersystem;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Order {
	@Id
	private int id;
	private String customerName;
	private String foodItem;
	private int quantity;
	private int total_amnt;
	private String odate;
	private String status;
	
	public Order() {
		
	}
	public Order(int id,String customerName,String foodItem,int quantity,int total_amnt,String odate,String status)
	{
		this.id=id;
		this.customerName=customerName;
		this.foodItem=foodItem;
		this.quantity=quantity;
		this.total_amnt=total_amnt;
		this.odate=odate;
		this.status=status;
	}
	
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.customerName=customerName;
	}
	public String getName() {
		return customerName;
	}
	public void setFoodItem(String foodItem) {
		this.foodItem=foodItem;
	}
	public String getFoodItem() {
		return foodItem;
	}
	public void setQuantity(int qunatity) {
		this.quantity=qunatity;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setTotalAmngt(int total_amnt) {
		this.total_amnt=total_amnt;
	}
	public int getTotalAmnt() {
		return total_amnt;
	}
}
