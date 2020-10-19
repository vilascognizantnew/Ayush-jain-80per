package com.cts.stock.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
public class Stock {
	
	
	@Id
	private int stock_id;
	
	@Column(name = "name")
	private String stock_name;
	private double price;
	private  double volume;
	private Date date;
	public int getStock_id() {
		return stock_id;
	}
	public void setStock_id(int stock_id) {
		this.stock_id = stock_id;
	}
	public String getStock_name() {
		return stock_name;
	}
	public void setStock_name(String stock_name) {
		this.stock_name = stock_name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double volume) {
		this.volume = volume;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Stock(int stock_id, String stock_name, double price, double volume, Date date) {
		super();
		this.stock_id = stock_id;
		this.stock_name = stock_name;
		this.price = price;
		this.volume = volume;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Stock [stock_id=" + stock_id + ", stock_name=" + stock_name + ", price=" + price + ", volume=" + volume
				+ ", date=" + date + "]";
	}
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Stock get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
