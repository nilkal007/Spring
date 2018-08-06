package com.scp.Spring_desktop;

class Vender{
	private int id;
	private String name;
	private String address;
	public Vender(int id, String name, String address) {
		super();
		
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
	public Vender() {
		
		super();
		System.out.println("vender");
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Vender [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}