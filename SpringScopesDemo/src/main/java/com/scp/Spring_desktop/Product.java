package com.scp.Spring_desktop;

public abstract class Product {
	private int id;
	private String name;
	private double price;
	private Vender vender;
	protected abstract Vender createNewVendor();	

	public Product(int id, String name, double price, Vender vender) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.vender = vender;
	}
	public Product() {
		
		super();
		System.out.println("product");
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Vender getVender() {
		return vender;
	}
	public void setVender(Vender vender) {
		this.vender = vender;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", vender=" + vender + "]";
	}
	
}